package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties   {
  
  private @Valid ConfigNodePropertyBoolean offloadingOffloaderEnabled = null;

  /**
   **/
  public ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties offloadingOffloaderEnabled(ConfigNodePropertyBoolean offloadingOffloaderEnabled) {
    this.offloadingOffloaderEnabled = offloadingOffloaderEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("offloading.offloader.enabled")
  public ConfigNodePropertyBoolean getOffloadingOffloaderEnabled() {
    return offloadingOffloaderEnabled;
  }
  public void setOffloadingOffloaderEnabled(ConfigNodePropertyBoolean offloadingOffloaderEnabled) {
    this.offloadingOffloaderEnabled = offloadingOffloaderEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties = (ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties) o;
    return Objects.equals(offloadingOffloaderEnabled, comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.offloadingOffloaderEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offloadingOffloaderEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties {\n");
    
    sb.append("    offloadingOffloaderEnabled: ").append(toIndentedString(offloadingOffloaderEnabled)).append("\n");
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

