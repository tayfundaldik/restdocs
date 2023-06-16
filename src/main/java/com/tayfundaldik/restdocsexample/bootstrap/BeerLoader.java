package com.tayfundaldik.restdocsexample.bootstrap;

import com.tayfundaldik.restdocsexample.domain.Beer;
import com.tayfundaldik.restdocsexample.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count() == 0){

            beerRepository.save(Beer.builder()
                    .beerName("Carlsberg")
                    .beerStyle("GOSE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(55900000011L)
                    .price(new BigDecimal("15.99"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Tuborg Gold")
                    .beerStyle("PILSNER")
                    .quantityToBrew(400)
                    .minOnHand(15)
                    .upc(5590000013L)
                    .price(new BigDecimal("12.34"))
                    .build());
        }
    }
}
