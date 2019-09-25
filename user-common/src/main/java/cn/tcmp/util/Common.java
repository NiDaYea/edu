package cn.tcmp.util;

public class Common {

    //错误编码
    public static final String CODE_SUCCESS="0000";
    //token超时
    public static final String CODE_01="0001";
    //用户名密码错误
    public static final String CODE_02="0002";
    //验证失败
    public static final String CODE_03="0003";
    //重置Token时间条件未达到
    public static final String CODE_04="0004";
    //token失效的时间
    public static final Integer TOKEN_TIMEOUT=2*60*60;
    //token重置时间
    public static final Integer TOKEN_REDIS_TIMEOUT=90*60*1000;
    //token前缀
    public static  final String TOKEN_PREFIX="token:";
    //pc端
    public static  final String PC="PC";
    //移动端
    public static  final String MOBILE="MOBILE";
    //老token延迟2分钟
    public static  final Integer TOKEN_LONG_TIME=2*60;
}
