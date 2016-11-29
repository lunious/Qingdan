package lunioussky.qingdan.utils.http;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/28.
 */

public class Headers {
    private List<String> namesAndValues;

    private Headers(Builder builder) {
        this.namesAndValues = namesAndValues;
    }

    public List<String> getNamesAndValues() {
        return namesAndValues;
    }

    public static class Builder{
        private List<String> namesAndValues;
        public Builder() {
            namesAndValues = new ArrayList<>();
        }

        public Builder addHeader(String name, String value){
            namesAndValues.add(name);
            namesAndValues.add(value);
            return this;
        }
        public Builder addHeaders(Headers headers){
            namesAndValues.addAll(headers.namesAndValues);
            return this;
        }
        public Headers build(){
            return new Headers(this);
        }
    }
}
