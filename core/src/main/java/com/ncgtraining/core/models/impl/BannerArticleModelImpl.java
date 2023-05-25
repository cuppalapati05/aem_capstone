package com.ncgtraining.core.models.impl;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.ncgtraining.core.models.BannerArticleModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, adapters = BannerArticleModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class BannerArticleModelImpl implements BannerArticleModel {
    @ValueMapValue
    public String bannerImage;
    @ValueMapValue
    public String bannerText;
    @ValueMapValue
    public String logo;
    @Override
    public String getBannerImage(){
        return bannerImage;
    }
    @Override
    public String getBannerText(){
        return bannerText;
    }
    @Override
    public String getLogo(){
        return logo;
    }
}
