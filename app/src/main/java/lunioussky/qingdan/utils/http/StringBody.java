package lunioussky.qingdan.utils.http;

/**
 * Created by Administrator on 2016/12/1.
 */

public class StringBody extends RequestBody{
    private String body;
    public StringBody(String contentType,String body) {
        super(contentType);
        this.body = body;
    }
    @Override
    public byte[] getBodyBytes() {
        return body.getBytes();
    }
}