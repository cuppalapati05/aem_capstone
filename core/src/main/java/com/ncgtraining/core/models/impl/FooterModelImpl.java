package com.ncgtraining.core.models.impl;

import com.ncgtraining.core.models.FooterModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, adapters = FooterModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class FooterModelImpl implements FooterModel {
    @ValueMapValue
    private String logo;
    @ValueMapValue
    private String trendingText;

    @ValueMapValue
    private String trendingDesc;
    @Override
    public String getTrendingText() {
        return trendingText;
    }

    @Override
    public String getTrendingDesc() {
        return trendingDesc;
    }
    @Override
    public String getLogo(){
        return logo;
    }
}
