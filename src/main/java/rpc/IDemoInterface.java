package rpc;

/**
 * ${DESCRIPTION}
 * com.shock.rpc.demo.${CLASS_NAME}
 * Created by zhengdong.lzd on 2016/11/29 0029.
 */
public interface IDemoInterface {

    public String withReturn(String name);
    public void noReturn(String name);
    public String noArgument();
}

