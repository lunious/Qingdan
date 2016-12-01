package lunioussky.qingdan.utils.http;

/**
 * Created by Administrator on 2016/11/28.
 */

public class Request {
    private String url;
    private String method;
    private Headers headers;
    private RequestBody body;

    private Request(Builder builder){
        this.url = builder.url;
        this.method = builder.method;
        if(builder.headersBuilder != null){
            this.headers = builder.headersBuilder.build();
        }
        this.body = builder.body;
    }
    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public Headers getHeaders() {
        return headers;
    }

    public RequestBody getBody() {
        return body;
    }

    public static class Builder{
        private String url;
        private String method;
        private Headers.Builder headersBuilder;
        private RequestBody body;

        public Builder url(String url){
            this.url = url;
            return this;
        }
        public Builder get(){
            this.method = "GET";
            return this;
        }

        public Builder post(RequestBody body){
            this.method = "POST";
            this.body = body;
            addHeader("Content-type",body.getContentType());
            return this;
        }
        public Request build(){
            return new Request(this);
        }
        /**
         * 添加头部数据
         * @param name
         * @param value
         * @return
         */
        public Builder addHeader(String name,String value){
            if(headersBuilder == null){
                headersBuilder = new Headers.Builder();
            }
            headersBuilder.addHeader(name,value);
            return this;
        }
        public Builder addHeaders(Headers headers){
            if(headersBuilder == null){
                headersBuilder = new Headers.Builder();
            }
            headersBuilder.addHeaders(headers);
            return this;
        }
    }
}
