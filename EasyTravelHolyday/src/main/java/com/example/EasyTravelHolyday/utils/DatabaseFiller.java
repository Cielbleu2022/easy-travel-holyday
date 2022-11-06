package com.example.EasyTravelHolyday.utils;

import com.example.EasyTravelHolyday.models.entity.Offre;
import com.example.EasyTravelHolyday.repository.OffreRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DatabaseFiller implements InitializingBean {
    private final OffreRepository offreRepository;

    public DatabaseFiller(OffreRepository offreRepository) {
        this.offreRepository = offreRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //saveOffre();
    }
    private Offre saveOffre() {
        Offre offre=new Offre();
        offre.setTitre("voyage Belgique-Salou");
        offre.setPrix(1500);
        offre.setNbplacetotal(50);
        offre.setImage("https://helpx.adobe.com/content/dam/help/en/stock/how-to/visual-reverse-image-search/jcr_content/main-pars/image/visual-reverse-image-search-v2_intro.jpg");
        offre.setDateDepart(LocalDate.now());
        offre.setDateArrive(LocalDate.now());
        offreRepository.save(offre);

        offre=new Offre();
        offre.setTitre("voyage Madagascar-Belgique");
        offre.setPrix(2500);
        offre.setNbplacetotal(320);
        offre.setImage("https://helpx.adobe.com/content/dam/help/en/stock/how-to/visual-reverse-image-search/jcr_content/main-pars/image/visual-reverse-image-search-v2_intro.jpg");
        offre.setDateDepart(LocalDate.now());
        offre.setDateArrive(LocalDate.now());
        offreRepository.save(offre);

        return offre;

    }
}
