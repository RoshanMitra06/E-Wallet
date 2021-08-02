package com.example.WalletService.Util;
import java.net.URISyntaxException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SmsUtil {
    private static final Logger logger = LoggerFactory.getLogger(SmsUtil.class);
    void sendSms()throws URISyntaxException, UnirestException
    {
        HttpResponse response = Unirest.get("https://www.fast2sms.com/dev/bulk?authorization=lz9aDmqfe6OiZ4ybgGYtWcwnSKHo1T7UJrBuhdMQs5FpLRkA8XYgxqmdRLTcF7uhyV8fUa45eMs29jo1&sender_id=FSTSMS&message=This%20is%20a%20test%20message%20from%20Roshan&language=english&route=p&numbers=8806573292")
                .header("cache-control", "no-cache")
                .asString();
        logger.info(response.getBody().toString());
        logger.info(response.getHeaders().toString());
    }


}
