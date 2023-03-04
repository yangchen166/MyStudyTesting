package com.testing.ycclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class YcCase {
    private long id;
    private String caseName;
    private String stepName;
    private String keywords;
    private String param1;
    private String author;

}
