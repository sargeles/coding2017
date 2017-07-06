package me.lzb.jvm.cmd;

import me.lzb.jvm.clz.ClassFile;

/**
 * @author LZB
 */
public abstract class OneOperandCmd extends ByteCodeCommand {

    private int operand;

    public OneOperandCmd(ClassFile clzFile, String opCode) {
        super(clzFile, opCode);

    }

    public int getOperand() {
        return this.operand;
    }

    public void setOperand(int oprand1) {
        this.operand = oprand1;

    }

    public int getLength() {
        return 2;
    }


}
