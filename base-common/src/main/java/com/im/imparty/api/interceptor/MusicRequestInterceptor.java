package com.im.imparty.api.interceptor;

import com.im.imparty.spring.util.MusicCacheUtils;
import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class MusicRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        //String cookie = "MUSIC_A_T=1491020046006; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/neapi/clientlog; HTTPOnly;MUSIC_A_T=1491020046006; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/eapi/clientlog; HTTPOnly;MUSIC_A_T=1491020046006; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/eapi/feedback; HTTPOnly;MUSIC_R_T=1491020163452; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/weapi/clientlog; HTTPOnly;MUSIC_R_T=1491020163452; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/neapi/clientlog; HTTPOnly;MUSIC_R_T=1491020163452; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/openapi/clientlog; HTTPOnly;MUSIC_R_T=1491020163452; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/api/clientlog; HTTPOnly;MUSIC_A_T=1491020046006; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/weapi/clientlog; HTTPOnly;MUSIC_A_T=1491020046006; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/neapi/feedback; HTTPOnly;MUSIC_A_T=1491020046006; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/weapi/feedback; HTTPOnly;MUSIC_A_T=1491020046006; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/wapi/clientlog; HTTPOnly;MUSIC_R_T=1491020163452; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/eapi/feedback; HTTPOnly;MUSIC_R_T=1491020163452; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/eapi/clientlog; HTTPOnly;MUSIC_R_T=1491020163452; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/weapi/feedback; HTTPOnly;MUSIC_R_T=1491020163452; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/api/feedback; HTTPOnly;__csrf=10b226b3cd413af72483284f30e704db; Max-Age=1296010; Expires=Wed, 26 Apr 2023 09:49:21 GMT; Path=/;;MUSIC_SNS=; Max-Age=0; Expires=Tue, 11 Apr 2023 09:49:11 GMT; Path=/;MUSIC_R_T=1491020163452; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/wapi/feedback; HTTPOnly;MUSIC_A_T=1491020046006; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/wapi/feedback; HTTPOnly;MUSIC_A_T=1491020046006; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/openapi/clientlog; HTTPOnly;MUSIC_R_T=1491020163452; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/neapi/feedback; HTTPOnly;MUSIC_U=c3ad21ccd9c33f1f6b2abcdfd1b56dfb109f506cf07ef902b789961b19c8b07c8a08bd5bf851808fda0f55ca60824f1e67f08dfd5de80216758ab293c62bea8bfb23af057f26a700a0d2166338885bd7; Max-Age=15552000; Expires=Sun, 08 Oct 2023 09:49:11 GMT; Path=/; HTTPOnly;MUSIC_A_T=1491020046006; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/api/clientlog; HTTPOnly;MUSIC_A_T=1491020046006; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/api/feedback; HTTPOnly;MUSIC_R_T=1491020163452; Max-Age=2147483647; Expires=Sun, 29 Apr 2091 13:03:18 GMT; Path=/wapi/clientlog; HTTPOnly";
        String cookie = Optional.ofNullable(MusicCacheUtils.get("admincookie", String.class)).orElse("");
        requestTemplate.header("Cookie",
                Arrays.stream(cookie.split(";")).map(item -> item.trim()).collect(Collectors.toList()));
    }
}
