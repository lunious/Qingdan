package lunioussky.qingdan.utils.http;

/**
 * Created by Administrator on 2016/11/28.
 */

public abstract class RequestBody {

    public static final String formContentType = "application/x-www-form-urlencoded";
    public static final String jsonContentType = "application/json; Charset=utf-8";
    private String contentType;

    public String getContentType() {
        return contentType;
    }

    public RequestBody(String contentType) {
        this.contentType = contentType;
    }

    public abstract byte[] getBodyBytes();
}
