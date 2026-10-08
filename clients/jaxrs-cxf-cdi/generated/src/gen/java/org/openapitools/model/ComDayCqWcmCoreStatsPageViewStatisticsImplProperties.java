package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties   {
  
  private ConfigNodePropertyString pageviewstatisticsTrackingurl;

  private ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled;

  /**
   **/
  public ComDayCqWcmCoreStatsPageViewStatisticsImplProperties pageviewstatisticsTrackingurl(ConfigNodePropertyString pageviewstatisticsTrackingurl) {
    this.pageviewstatisticsTrackingurl = pageviewstatisticsTrackingurl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pageviewstatistics.trackingurl")
  public ConfigNodePropertyString getPageviewstatisticsTrackingurl() {
    return pageviewstatisticsTrackingurl;
  }
  public void setPageviewstatisticsTrackingurl(ConfigNodePropertyString pageviewstatisticsTrackingurl) {
    this.pageviewstatisticsTrackingurl = pageviewstatisticsTrackingurl;
  }


  /**
   **/
  public ComDayCqWcmCoreStatsPageViewStatisticsImplProperties pageviewstatisticsTrackingscriptEnabled(ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled) {
    this.pageviewstatisticsTrackingscriptEnabled = pageviewstatisticsTrackingscriptEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pageviewstatistics.trackingscript.enabled")
  public ConfigNodePropertyString getPageviewstatisticsTrackingscriptEnabled() {
    return pageviewstatisticsTrackingscriptEnabled;
  }
  public void setPageviewstatisticsTrackingscriptEnabled(ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled) {
    this.pageviewstatisticsTrackingscriptEnabled = pageviewstatisticsTrackingscriptEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreStatsPageViewStatisticsImplProperties comDayCqWcmCoreStatsPageViewStatisticsImplProperties = (ComDayCqWcmCoreStatsPageViewStatisticsImplProperties) o;
    return Objects.equals(this.pageviewstatisticsTrackingurl, comDayCqWcmCoreStatsPageViewStatisticsImplProperties.pageviewstatisticsTrackingurl) &&
        Objects.equals(this.pageviewstatisticsTrackingscriptEnabled, comDayCqWcmCoreStatsPageViewStatisticsImplProperties.pageviewstatisticsTrackingscriptEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageviewstatisticsTrackingurl, pageviewstatisticsTrackingscriptEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties {\n");
    
    sb.append("    pageviewstatisticsTrackingurl: ").append(toIndentedString(pageviewstatisticsTrackingurl)).append("\n");
    sb.append("    pageviewstatisticsTrackingscriptEnabled: ").append(toIndentedString(pageviewstatisticsTrackingscriptEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

