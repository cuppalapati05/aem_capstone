package com.ncgtraining.core.models.impl;

import com.ncgtraining.core.models.HeaderPrimaryModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
@Model(adaptables = Resource.class, adapters = HeaderPrimaryModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderPrimaryModelImpl implements HeaderPrimaryModel {
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
    public String getDate() {
        LocalDate currentDate = LocalDate.now();
        String day = currentDate.format(DateTimeFormatter.ofPattern("EEEE", Locale.ENGLISH));
        String date = String.valueOf(currentDate.getDayOfMonth());
        String month = currentDate.format(DateTimeFormatter.ofPattern("MMMM", Locale.ENGLISH));
        String year = String.valueOf(currentDate.getYear());
        return day+","+date+" "+month+" "+year;
    }
}