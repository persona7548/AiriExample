package com.airi.example.domain.dto;

import com.airi.example.domain.entity.Product;
import lombok.*;


@ToString
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductReqDto {
    private int id;
    private String name;
    private String desc;
    private Double price;


    public Product toEntity(){
        return Product.builder()
                .price(this.price)
                .id(this.id)
                .name(this.name)
                .desc(this.desc)
                .build();
    }

    @Override
    public String toString() {
        return "ProductReqDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}
