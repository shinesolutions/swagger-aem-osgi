package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties   {
  @JsonProperty("offloading.jobcloner.enabled")
  private ConfigNodePropertyBoolean offloadingJobclonerEnabled = null;

  public ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties offloadingJobclonerEnabled(ConfigNodePropertyBoolean offloadingJobclonerEnabled) {
    this.offloadingJobclonerEnabled = offloadingJobclonerEnabled;
    return this;
  }

  /**
   * Get offloadingJobclonerEnabled
   * @return offloadingJobclonerEnabled
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.offloadingJobclonerEnabled, comAdobeGraniteOffloadingImplOffloadingJobClonerProperties.offloadingJobclonerEnabled);
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

