package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wrong implements Serializable {

    private Integer wrongId,UserId,topicId;
    private List<Topic> listTopic;
}
