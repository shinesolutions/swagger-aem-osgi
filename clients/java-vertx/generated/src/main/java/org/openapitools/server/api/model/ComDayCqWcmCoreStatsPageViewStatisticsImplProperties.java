package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties   {
  
  private ConfigNodePropertyString pageviewstatisticsTrackingurl = null;
  private ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled = null;

  public ComDayCqWcmCoreStatsPageViewStatisticsImplProperties () {

  }

  public ComDayCqWcmCoreStatsPageViewStatisticsImplProperties (ConfigNodePropertyString pageviewstatisticsTrackingurl, ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled) {
    this.pageviewstatisticsTrackingurl = pageviewstatisticsTrackingurl;
    this.pageviewstatisticsTrackingscriptEnabled = pageviewstatisticsTrackingscriptEnabled;
  }

    
  @JsonProperty("pageviewstatistics.trackingurl")
  public ConfigNodePropertyString getPageviewstatisticsTrackingurl() {
    return pageviewstatisticsTrackingurl;
  }
  public void setPageviewstatisticsTrackingurl(ConfigNodePropertyString pageviewstatisticsTrackingurl) {
    this.pageviewstatisticsTrackingurl = pageviewstatisticsTrackingurl;
  }

    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
