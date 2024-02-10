package com.portal26.webhook.app.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventRequest {

    private Integer id;

    private String user_id;

    private String event_timestamp;

    private String url;

    private String body;

}
