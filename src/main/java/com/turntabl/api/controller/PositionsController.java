package com.turntabl.api.controller;

import com.turntabl.api.domain.Position;
import com.turntabl.api.domain.ProductDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PositionsController {

    @GetMapping("/positions")
    public List<Position> getPositions() {
        List<Position> positions = new ArrayList<>();
        ProductDetail sge = new ProductDetail();
        sge.setTicker("SGE");
        sge.setProductId("P987");
        sge.setExchange("LSE");

        ProductDetail carlsberg = new ProductDetail();
        carlsberg.setTicker("0AI4");
        carlsberg.setExchange("LSE");
        carlsberg.setProductId("P556");

        Position position = new Position();
        position.setProductDetail(sge);
        position.setQuantity(1500);
        position.setAveragePrice(new BigDecimal("680.5"));
        positions.add(position);

        position = new Position();
        position.setProductDetail(carlsberg);
        position.setQuantity(450);
        position.setAveragePrice(new BigDecimal("830.4"));
        positions.add(position);

        return positions;
    }
}
