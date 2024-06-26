package dev.runtian.helpcommunity.commons.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageAddRequest implements Serializable {

    private String type;

    private String content;

    private Long senderId;

    private Long recipientId;

    private Long chatId;

    private static final long serialVersionUID = 1L;
}
