package com.example.EasyTravelHolyday.utils;

import com.example.EasyTravelHolyday.models.entity.Offre;
import com.example.EasyTravelHolyday.models.entity.Transport;
import com.example.EasyTravelHolyday.models.entity.TypeOffres;
import com.example.EasyTravelHolyday.repository.OffreRepository;
import com.example.EasyTravelHolyday.repository.TransportRepository;
import com.example.EasyTravelHolyday.repository.TypeOffresRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DatabaseFiller implements InitializingBean {
    private final OffreRepository offreRepository;
    private final TypeOffresRepository typeOffreRepository;
    private final TransportRepository transportRepository;
    public DatabaseFiller(OffreRepository offreRepository, TypeOffresRepository typeOffreRepository, TransportRepository transportRepository) {
        this.offreRepository = offreRepository;
        this.typeOffreRepository = typeOffreRepository;
        this.transportRepository = transportRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //saveOffre();
        //saveTypeOffre();
        //saveTransport();
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
    private TypeOffres saveTypeOffre(){
        TypeOffres typ=new TypeOffres();
        typ.setNom("Long Séjour");
        typeOffreRepository.save(typ);

        typ=new TypeOffres();
        typ.setNom("CIRCUIT Séjour");
        typeOffreRepository.save(typ);

        typ=new TypeOffres();
        typ.setNom("UNJOUR Séjour");
        typeOffreRepository.save(typ);
        return typ;
    }

    private void  saveTransport(){
        Transport transport=new Transport();
        transport.setNom("Avion");
        transportRepository.save(transport);

        transport=new Transport();
        transport.setNom("Train");
        transportRepository.save(transport);

        transport=new Transport();
        transport.setNom("Bus");

        transportRepository.save(transport);
    }
}
