package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreMvtMVTStatisticsImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString mvtstatisticsTrackingurl;
 /**
   * Get mvtstatisticsTrackingurl
   * @return mvtstatisticsTrackingurl
  **/
  @JsonProperty("mvtstatistics.trackingurl")
  public ConfigNodePropertyString getMvtstatisticsTrackingurl() {
    return mvtstatisticsTrackingurl;
  }

  public void setMvtstatisticsTrackingurl(ConfigNodePropertyString mvtstatisticsTrackingurl) {
    this.mvtstatisticsTrackingurl = mvtstatisticsTrackingurl;
  }

  public ComDayCqWcmCoreMvtMVTStatisticsImplProperties mvtstatisticsTrackingurl(ConfigNodePropertyString mvtstatisticsTrackingurl) {
    this.mvtstatisticsTrackingurl = mvtstatisticsTrackingurl;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

