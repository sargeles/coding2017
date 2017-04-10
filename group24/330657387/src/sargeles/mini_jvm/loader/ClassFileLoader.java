package sargeles.mini_jvm.loader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.io.IOUtils;

public class ClassFileLoader {
	private List<String> clzPaths = new ArrayList<String>();

	public void addClassPath(String path) {
		// 不允许重复
		if (this.clzPaths.contains(path)) {
			return;
		}

		this.clzPaths.add(path);
	}

	public String getClassPath() {
		return StringUtils.join(this.clzPaths, ";");
	}

	public byte[] readBinaryCode(String className) {
		className = className.replace('.', File.separatorChar) + ".class";
		
		for(String path : this.clzPaths){
			String clzFileName = path + File.separatorChar + className;
			byte[] codes = loadClassFile(clzFileName);
			if(codes != null){
				return codes;
			}
		}
		return null;
	}

	private byte[] loadClassFile(String clzFileName) {

		File f = new File(clzFileName);

		try {

			return IOUtils.toByteArray(new FileInputStream(f));

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	
	}

}
