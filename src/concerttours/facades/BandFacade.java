package concerttours.facades;

import java.util.List;
import concerttours.data.BandData;

public interface BandFacade
{
    BandData getBand(String name);
    List<BandData> getBands();

    public List<BandData> getBandsMedia();

    public BandData getBandMedia(final String name);
}