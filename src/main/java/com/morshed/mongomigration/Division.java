package com.morshed.mongomigration;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Division {
    @Id
    private String id;
    private String name;
    private String bnName;
    private String url;
}
