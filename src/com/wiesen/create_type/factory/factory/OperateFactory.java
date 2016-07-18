package com.wiesen.create_type.factory.factory;


/**
 * Created by wiesen on 16-7-18.
 */
public class OperateFactory {

    public static BaseOperate createOperation(OperateType type) {
        BaseOperate baseOperate = null;
        switch (type){
            case ADD:
                baseOperate = new AddOperate();
                break;
            case SUB:
                baseOperate = new SubOperate();
                break;
            case MUL:
                baseOperate = new MulOperate();
                break;
            case DIV:
                baseOperate = new DivOperate();
                break;
        }
        return baseOperate;
    }

    public static enum OperateType{
        ADD,
        SUB,
        MUL,
        DIV
    }
}
