package lunioussky.qingdan.utils;

/**
 * Created by LG on 2016/10/20.
 * Tips:
 */

public class UrlHandler {
    /***
     * http://cnblogs.davismy.com/Handler.ashx?op=GetTimeLine&channelpath={0}&page={1}
     * {"data/123","1"}
     * @param url
     * @param params
     * @return {0}
     */
    public  static final String handlUrl(String url,Object... params){
        for (int i = 0; i < params.length; i++) {
            url = url.replace("{"+i+"}", params[i]+"");
        }
        return url;
    }
}
