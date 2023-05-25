package com.ncgtraining.core.models.impl;

import com.ncgtraining.core.models.HeaderSecondaryModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, adapters = HeaderSecondaryModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderSecondaryModelImpl implements HeaderSecondaryModel {

    @ValueMapValue
    public String[] languages;
    @ValueMapValue
    public String logo;

    @ValueMapValue
    private String displayLanguages;
    @Override
    public String getLogo() {
        return logo;
    }
    @Override
    public String[] getLanguage(){
        return languages;
    }
    public Boolean getDisplayLanguage() {
        if(displayLanguages.equals("true")){
            return true;
        }
        else{
            return false;
        }
    }
}