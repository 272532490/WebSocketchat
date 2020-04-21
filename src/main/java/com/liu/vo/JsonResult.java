package com.liu.vo;

public class JsonResult {
    /**״̬�룺1��ʾ��ȷ��0��ʾ����*/
    private int state=1;
    /**״̬���Ӧ����Ϣ*/
    private String message="ok";
    /**��ȷ����ͨ�������Խ��з�װ�������ѯ���*/
    private Object data;


    public JsonResult() {}
    public JsonResult(String message) {
        this.message=message;
    }
    /**
     * ��ʼ����ȷ������
     * @param data
     */
    public JsonResult(Object data) {
        this.data = data;
    }
    /**�����쳣ʱ����ͨ���˷�����ʼ����Ϣ*/
    public JsonResult(Throwable e) {
        this.state=0;//��ʾ������Ϣ
        this.message=e.getMessage();//�쳣��Ϣ
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "JsonResult{" +
                "state=" + state +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

}
