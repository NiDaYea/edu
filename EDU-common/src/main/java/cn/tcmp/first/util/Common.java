package cn.tcmp.first.util;

public class Common {

    //成功
    public static final String CODE_SUCCESS="0000";
    //超时
    public static final String CODE_01="0001";
    //密码错误
    public static final String CODE_02="0002";
    //验证失败
    public static final String CODE_03="0003";
    //未到重置时间
    public static final String CODE_04="0004";
    //超时
    public static final Integer TOKEN_TIME=2*60*60;
    //token前缀
    public static  final String TOKEN_PREFIX="token:";
    //pc端
    public static  final String PC="PC";
    //移动端
    public static  final String MOBILE="MOBILE";
    //token重置时间
    public static final Integer TOKEN_RESET_TIME=90*60*1000;

    //老token延迟2分钟
    public static final Integer TOKEN_LONG_TIME=2*60;



}
