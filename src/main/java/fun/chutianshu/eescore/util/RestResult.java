package fun.chutianshu.eescore.util;

import lombok.Data;

import java.io.Serializable;

@Data
//自定义了一个web api 返回数据结果的包装类
public class RestResult implements Serializable {

    // http Response 返回的状态码
    private int code;
    // 附加信息
    private String msg;
    // 数据
    private Object data;

    public static fun.chutianshu.eescore.util.RestResult success(Object data){return  success(200,"操作成功",data);}

    public static fun.chutianshu.eescore.util.RestResult success(int code, String msg, Object data) {
        fun.chutianshu.eescore.util.RestResult r = new fun.chutianshu.eescore.util.RestResult();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static fun.chutianshu.eescore.util.RestResult fail(String msg){return fail(400,msg,null);}

    public static fun.chutianshu.eescore.util.RestResult fail(int code, String msg, Object data) {
        fun.chutianshu.eescore.util.RestResult r = new fun.chutianshu.eescore.util.RestResult();
        r.setData(data);
        r.setMsg(msg);
        r.setCode(code);
        return r;
    }

}
