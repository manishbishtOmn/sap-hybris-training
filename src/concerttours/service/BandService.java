package concerttours.service;

import concerttours.model.BandModel;

import java.util.List;

public interface BandService {
    List<BandModel> getBands();
    /**
     * Gets the band for the given code.
     *
     * @throws de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException
     *            in case more then one band is found for the given code
     * @throws de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException
     *            in case no band for the given code can be found
     */
    BandModel getBandForCode(String code);
}
