package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties   {
  
  private ConfigNodePropertyString pageviewstatisticsTrackingurl = null;
  private ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("pageviewstatistics.trackingscript.enabled")
  public ConfigNodePropertyString getPageviewstatisticsTrackingscriptEnabled() {
    return pageviewstatisticsTrackingscriptEnabled;
  }
  public void setPageviewstatisticsTrackingscriptEnabled(ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled) {
    this.pageviewstatisticsTrackingscriptEnabled = pageviewstatisticsTrackingscriptEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreStatsPageViewStatisticsImplProperties comDayCqWcmCoreStatsPageViewStatisticsImplProperties = (ComDayCqWcmCoreStatsPageViewStatisticsImplProperties) o;
    return Objects.equals(pageviewstatisticsTrackingurl, comDayCqWcmCoreStatsPageViewStatisticsImplProperties.pageviewstatisticsTrackingurl) &&
        Objects.equals(pageviewstatisticsTrackingscriptEnabled, comDayCqWcmCoreStatsPageViewStatisticsImplProperties.pageviewstatisticsTrackingscriptEnabled);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

