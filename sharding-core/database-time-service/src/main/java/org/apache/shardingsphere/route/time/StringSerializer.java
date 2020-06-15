import com.alipay.sofa.rpc.common.RpcConstants;

/**
 * @author <a href="mailto:zhanggeng.zg@antfin.com">GengZhang</a>
 * @since 5.4.0
 */
public final class StringSerializer {

    public static byte[] encode(String s) {
        return s == null ? new byte[0] : s.getBytes(RpcConstants.DEFAULT_CHARSET);
    }

    public static String decode(byte[] data) {
        return data == null ? null : new String(data, RpcConstants.DEFAULT_CHARSET);
    }
}