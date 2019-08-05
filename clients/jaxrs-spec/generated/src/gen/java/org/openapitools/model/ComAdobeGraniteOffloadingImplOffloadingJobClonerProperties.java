package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties   {
  
  private @Valid ConfigNodePropertyBoolean offloadingJobclonerEnabled = null;

  /**
   **/
  public ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties offloadingJobclonerEnabled(ConfigNodePropertyBoolean offloadingJobclonerEnabled) {
    this.offloadingJobclonerEnabled = offloadingJobclonerEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("offloading.jobcloner.enabled")
  public ConfigNodePropertyBoolean getOffloadingJobclonerEnabled() {
    return offloadingJobclonerEnabled;
  }
  public void setOffloadingJobclonerEnabled(ConfigNodePropertyBoolean offloadingJobclonerEnabled) {
    this.offloadingJobclonerEnabled = offloadingJobclonerEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties comAdobeGraniteOffloadingImplOffloadingJobClonerProperties = (ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties) o;
    return Objects.equals(offloadingJobclonerEnabled, comAdobeGraniteOffloadingImplOffloadingJobClonerProperties.offloadingJobclonerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offloadingJobclonerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {\n");
    
    sb.append("    offloadingJobclonerEnabled: ").append(toIndentedString(offloadingJobclonerEnabled)).append("\n");
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

