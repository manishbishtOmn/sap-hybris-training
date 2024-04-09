package concerttours.convertors.populators;

import concerttours.data.BandData;
import concerttours.model.BandModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.spockframework.util.CollectionUtil;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BandDataPopulator implements Populator<BandModel,BandData> {
    @Override
    public void populate(BandModel source, BandData target) throws ConversionException {
//      final List<BandData> bandFacadeData = new ArrayList<>();
        if(Objects.nonNull(source)){
            final BandData sfd = new BandData();
            sfd.setId(source.getCode());
            sfd.setName(source.getName());
            sfd.setDescription(source.getHistory());
            sfd.setAlbumsSold(source.getAlbumSales());
        }
    }
}
