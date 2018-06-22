package stayblank;

/**
 * ${DESCRIPTION}
 * com.shock.rpc.demo.${CLASS_NAME}
 * Created by zhengdong.lzd on 2016/11/29 0029.
 */
public class IDemoImpl implements IDemoInterface {
    @Override
    public String withReturn(String name) {
        System.out.println("withReturn "+name);
        return "hello " + name;
    }

    @Override
    public void noReturn(String name) {
        System.out.println("noReturn "+name);
    }

    @Override
    public String noArgument() {
        System.out.println("noArgument");
        return "noArgument";
    }
}
