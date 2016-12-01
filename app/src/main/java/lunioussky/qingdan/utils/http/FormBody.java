package lunioussky.qingdan.utils.http;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/1.
 */

public class FormBody extends  RequestBody{
    private final List<String> encodedNames;//{"key1","key2"}
    private final List<String> encodedValues;//{"value1","value2"}
    public FormBody(FormBody.Builder builder) {
        super(formContentType);
        this.encodedNames = builder.names;
        this.encodedValues = builder.values;
    }

    public List<String> getEncodedNames() {
        return encodedNames;
    }

    public List<String> getEncodedValues() {
        return encodedValues;
    }

    @Override
    public byte[] getBodyBytes() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < encodedNames.size(); i++) {
            sb.append(encodedNames.get(i));
            sb.append("=");
            sb.append(encodedValues.get(i));
            sb.append("&");
        }
        if(sb.length() != 0){
            sb.deleteCharAt(sb.length()-1);
        }
        String stringBody = sb.toString();
        return stringBody.getBytes();
    }

    public static class Builder{
        private final List<String> names = new ArrayList<>();
        private final List<String> values = new ArrayList<>();
        public Builder add(String name,String value){
            names.add(name);
            values.add(value);
            return this;
        }
        public Builder addEncoded(String name,String value){
            try {
                names.add(URLEncoder.encode(name,"utf-8"));
                values.add(URLEncoder.encode(value,"utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return this;
        }
        public RequestBody build(){
            return new FormBody(this);
        }
    }
}