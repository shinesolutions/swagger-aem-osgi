package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmCoreMvtMVTStatisticsImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreMvtMVTStatisticsImplProperties   {
  @JsonProperty("mvtstatistics.trackingurl")
  private ConfigNodePropertyString mvtstatisticsTrackingurl;

  public ComDayCqWcmCoreMvtMVTStatisticsImplProperties mvtstatisticsTrackingurl(ConfigNodePropertyString mvtstatisticsTrackingurl) {
    this.mvtstatisticsTrackingurl = mvtstatisticsTrackingurl;
    return this;
  }

  /**
   * Get mvtstatisticsTrackingurl
   * @return mvtstatisticsTrackingurl
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getMvtstatisticsTrackingurl() {
    return mvtstatisticsTrackingurl;
  }

  public void setMvtstatisticsTrackingurl(ConfigNodePropertyString mvtstatisticsTrackingurl) {
    this.mvtstatisticsTrackingurl = mvtstatisticsTrackingurl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreMvtMVTStatisticsImplProperties comDayCqWcmCoreMvtMVTStatisticsImplProperties = (ComDayCqWcmCoreMvtMVTStatisticsImplProperties) o;
    return Objects.equals(this.mvtstatisticsTrackingurl, comDayCqWcmCoreMvtMVTStatisticsImplProperties.mvtstatisticsTrackingurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mvtstatisticsTrackingurl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreMvtMVTStatisticsImplProperties {\n");
    
    sb.append("    mvtstatisticsTrackingurl: ").append(toIndentedString(mvtstatisticsTrackingurl)).append("\n");
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

