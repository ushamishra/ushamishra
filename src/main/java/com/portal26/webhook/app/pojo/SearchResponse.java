package com.portal26.webhook.app.pojo;

import com.portal26.webhook.app.entity.WebhookDetails;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class SearchResponse {

   private String user_id;

   private String domain;

    private String body;

    private String event_timestamp;

    private List<String> categories;

    public SearchResponse(WebhookDetails webhookDetails){
        this.user_id = webhookDetails.getUser_id();
        this.body = webhookDetails.getBody();
        this.domain = webhookDetails.getUrl();
        this.event_timestamp = webhookDetails.getEvent_timestamp();
        this.categories = webhookDetails.getWebShrinkerData().getCategories()
                .stream().map(pojo -> pojo.getLabel()).collect(Collectors.toList());
        System.out.println("categories..."+this.categories);
    }

}
