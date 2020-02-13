package com.Collections.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderResponse 
{
    private String name;
    private String email;
    private String productName; 
    private Integer price;
    private Integer qty;
    
}
