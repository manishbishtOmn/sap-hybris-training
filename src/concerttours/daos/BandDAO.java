package concerttours.daos;

import concerttours.model.BandModel;

import java.util.List;

public interface BandDAO {
    List<BandModel> findBands();

    List<BandModel> findBandsByCode(String code);
}
