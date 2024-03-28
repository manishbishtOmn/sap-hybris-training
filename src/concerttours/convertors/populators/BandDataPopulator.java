package concerttours.convertors.populators;

import concerttours.data.BandData;
import concerttours.model.BandModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.spockframework.util.CollectionUtil;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class BandDataPopulator implements Populator<List<BandModel>,List<BandData>> {
    @Override
    public void populate(List<BandModel> source, List<BandData> target) throws ConversionException {
//        final List<BandData> bandFacadeData = new ArrayList<>();
        if(!CollectionUtils.isEmpty(source)){
            for (final BandModel sm : source) // populater
            {
                final BandData sfd = new BandData();
                sfd.setId(sm.getCode());
                sfd.setName(sm.getName());
                sfd.setDescription(sm.getHistory());
                sfd.setAlbumsSold(sm.getAlbumSales());
                target.add(sfd);
            }
        }
    }
}
