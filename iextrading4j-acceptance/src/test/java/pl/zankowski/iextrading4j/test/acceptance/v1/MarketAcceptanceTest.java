package pl.zankowski.iextrading4j.test.acceptance.v1;

import org.junit.Test;
import pl.zankowski.iextrading4j.api.market.MarketVolume;
import pl.zankowski.iextrading4j.client.rest.request.market.MarketRequestBuilder;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MarketAcceptanceTest extends IEXCloudV1AcceptanceTestBase {

    @Test
    public void marketVolumeAcceptanceTest() {
        final List<MarketVolume> result = cloudClient.executeRequest(new MarketRequestBuilder()
                .build());
        assertThat(result).isNotNull();
    }

}
