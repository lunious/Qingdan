package lunioussky.qingdan.utils.http.qingdan;

/**
 * Created by Administrator on 2016/12/1.
 */

public class AuthoriaztionObj {

    /**
     * code : 0
     * message : Success
     * data : {"access_token":"NP24tkEJSbTYcX5BdthAEaufoC4OTNf3NL8bMs4A","token_type":"Bearer","expires_in":3600}
     */

    private int code;
    private String message;
    /**
     * access_token : NP24tkEJSbTYcX5BdthAEaufoC4OTNf3NL8bMs4A
     * token_type : Bearer
     * expires_in : 3600
     */

    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String access_token;
        private String token_type;
        private int expires_in;

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }

        public String getToken_type() {
            return token_type;
        }

        public void setToken_type(String token_type) {
            this.token_type = token_type;
        }

        public int getExpires_in() {
            return expires_in;
        }

        public void setExpires_in(int expires_in) {
            this.expires_in = expires_in;
        }
    }
}
