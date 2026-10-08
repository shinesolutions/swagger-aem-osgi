package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqWcmCoreStatsPageViewStatisticsImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties   {
  @JsonProperty("pageviewstatistics.trackingurl")
  @Valid

  private ConfigNodePropertyString pageviewstatisticsTrackingurl;

  @JsonProperty("pageviewstatistics.trackingscript.enabled")
  @Valid

  private ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled;

  public ComDayCqWcmCoreStatsPageViewStatisticsImplProperties pageviewstatisticsTrackingurl(ConfigNodePropertyString pageviewstatisticsTrackingurl) {
    this.pageviewstatisticsTrackingurl = pageviewstatisticsTrackingurl;
    return this;
  }

   /**
   * Get pageviewstatisticsTrackingurl
   * @return pageviewstatisticsTrackingurl
  **/
  public ConfigNodePropertyString getPageviewstatisticsTrackingurl() {
    return pageviewstatisticsTrackingurl;
  }

  public void setPageviewstatisticsTrackingurl(ConfigNodePropertyString pageviewstatisticsTrackingurl) {
    this.pageviewstatisticsTrackingurl = pageviewstatisticsTrackingurl;
  }

  public ComDayCqWcmCoreStatsPageViewStatisticsImplProperties pageviewstatisticsTrackingscriptEnabled(ConfigNodePropertyString pageviewstatisticsTrackingscriptEnabled) {
    this.pageviewstatisticsTrackingscriptEnabled = pageviewstatisticsTrackingscriptEnabled;
    return this;
  }

   /**
   * Get pageviewstatisticsTrackingscriptEnabled
   * @return pageviewstatisticsTrackingscriptEnabled
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

