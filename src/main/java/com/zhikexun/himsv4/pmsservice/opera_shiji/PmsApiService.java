package com.zhikexun.himsv4.pmsservice.opera_shiji;


import com.fasterxml.jackson.core.JsonProcessingException;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhikexun.himsv4.pmsservice.opera_shiji.utils.ExpiringMap;
import com.zhikexun.himsv4.pmsservice.opera_shiji.utils.HttpUtils;
import org.jsoup.Connection;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PmsApiService {
    private ObjectMapper objectMapper = new ObjectMapper();
    private static Map map = new ExpiringMap<String,String>();

    private PmsApiService() {

    }

    ;
    private static PmsApiService pmsApiService = new PmsApiService();

    public static PmsApiService get() {
        return pmsApiService;
    }

    /**
     * 安全验证
     */
    public String grantToken(GrantTokenRequest grantToken) {
        try {
            HttpUtils utils = new HttpUtils();
            String s = objectMapper.writeValueAsString(grantToken);
            Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/grantToken", s);
            String body = post.body();
            String[] split = body.split(",");
            String[] token = split[2].split(":");
            map.put("token", token[1].substring(1, token[1].length() - 1));
            Long startTime=new Date().getTime();
            System.out.println(token[1]);
            return body;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    ;

    /**
     * 判断用户是否获得权限（是否经过认证）
     */
    private boolean isAvailable() {
        Object token = map.get("token");
        if (token == null) {
            return false;
        } else {
            return true;
        }
    }

    ;

    /**
     * 查询订单服务
     */
    public String searchArrivingReservation(SearchArrivingReservationRequest request)  {

        try {
            String s = objectMapper.writeValueAsString(request);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/searchArrivingReservation", s, map.get("token").toString());
                String s1 = post.contentType();
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/searchArrivingReservation", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 获取可用房
     */
    public String preAuthorization(AvailableRooms availableRooms)  {
        try {
            String s = objectMapper.writeValueAsString(availableRooms);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/preAuthorization", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/preAuthorization", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 分配房间
     * @param room
     * @return
     */
    public String assignRoom(AssignAndReleaseRoom room){
        try {
            String s = objectMapper.writeValueAsString(room);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/assignRoom", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/assignRoom", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    };

    /**
     * 释放房间
     * @param room
     * @return
     * @throws IOException
     */
    public String releaseRoom(AssignAndReleaseRoom room)  {
        try {
            String s = objectMapper.writeValueAsString(room);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/releaseRoom", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/releaseRoom", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 入住
     *
     */
    public String checkIn(CheckIn checkIn) {
        try {
            String s = objectMapper.writeValueAsString(checkIn);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/checkIn", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/checkIn", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 预付费抛帐
     */
    public String prePayment(PrePayment payment){
        try {
            String s = objectMapper.writeValueAsString(payment);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/prePayment", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/prePayment", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    };
    /**
     * 账单查询
     */
    public String getInvoice(Invoice invoice){
        try {
            String s = objectMapper.writeValueAsString(invoice);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/getInvoice", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/getInvoice", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 离店(离店的参数和基础请求类参数一致，故不单独生成对象)
     */
    public String checkOut(Request request){
        try {
            String s = objectMapper.writeValueAsString(request);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/checkOut", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/checkOut", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 更新客人信息
     *
     */
    public String updateDocument(updateDocument document){
        try {
            String s = objectMapper.writeValueAsString(document);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/updateDocument", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/updateDocument", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 更新订单信息
     */
    public String updateReservation(updateReservation updateReservation){
        try {
            String s = objectMapper.writeValueAsString(updateReservation);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/updateReservation", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/updateReservation", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 查询在店订单
     */
    public String getInHouseReservation(getInHouseReservation getInHouseReservation){
        try {
            String s = objectMapper.writeValueAsString(getInHouseReservation);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/getInHouseReservation", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/getInHouseReservation", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 查询预授权
     */
    public String searchAuthorization(searchAuthorization searchAuthorization){
        try {
            String s = objectMapper.writeValueAsString(searchAuthorization);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/searchAuthorization", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/searchAuthorization", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 标记信用住订单
     *
     */
    public String modifyReservationAsPostPostPay(modifyReservationAsPostPostPay modifyReservationAsPostPostPay){
        try {
            String s = objectMapper.writeValueAsString(modifyReservationAsPostPostPay);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/modifyReservationAsPostPostPay", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/modifyReservationAsPostPostPay", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 新增预授权
     */
    public String preAuthorization(preAuthorization preAuthorization){
        try {
            String s = objectMapper.writeValueAsString(preAuthorization);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/preAuthorization", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/preAuthorization", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 预处理预授权
     */

    public String  dealAuthorization(dealAuthorization dealAuthorization){
        try {
            String s = objectMapper.writeValueAsString(dealAuthorization);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/dealAuthorization", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/dealAuthorization", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 查询订单在线状态
     */
    public String getReservationStatus(getReservationStatus getReservationStatus){
        try {
            String s = objectMapper.writeValueAsString(getReservationStatus);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/getReservationStatus", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/getReservationStatus", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 查询订单信息
     */
    public String fetchReservationInfo(fetchReservationInfo fetchReservationInfo){
        try {
            String s = objectMapper.writeValueAsString(fetchReservationInfo);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/fetchReservationInfo", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/fetchReservationInfo", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 订单队列操作
     */
    public String queueReservation(queueReservation queueReservation){
        try {
            String s = objectMapper.writeValueAsString(queueReservation);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/queueReservation", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/queueReservation", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 合住操作
     */
    public String combineShare(CombineShare combineShare){
        try {
            String s = objectMapper.writeValueAsString(combineShare);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/combineShare", s, map.get("token").toString());
                body = post.body();
                return body;

            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/combineShare", s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 这个方法可以用来执行所有的查询
     * @param methodname
     * @param
     * @return
     */
    public String  post(String methodname,Object params){
        try {
            String s = objectMapper.writeValueAsString(params);
            String body;
            if (isAvailable()) {
                Connection.Response post = HttpUtils.postWithToken("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/" + methodname, s, map.get("token").toString());
                body = post.body();
                return body;
            } else {
                Connection.Response post = HttpUtils.post("http://121.8.131.196:8080/kunlun-kiosk-new-dev/rest/gje/"+methodname, s);
                body = post.body();
                return body;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}

