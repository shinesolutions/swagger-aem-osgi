package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqMcmImplMCMConfigurationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqMcmImplMCMConfigurationProperties   {
  @JsonProperty("experience.indirection")
  private ConfigNodePropertyArray experienceIndirection = null;

  @JsonProperty("touchpoint.indirection")
  private ConfigNodePropertyArray touchpointIndirection = null;

  public ComDayCqMcmImplMCMConfigurationProperties experienceIndirection(ConfigNodePropertyArray experienceIndirection) {
    this.experienceIndirection = experienceIndirection;
    return this;
  }

  /**
   * Get experienceIndirection
   * @return experienceIndirection
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getExperienceIndirection() {
    return experienceIndirection;
  }

  public void setExperienceIndirection(ConfigNodePropertyArray experienceIndirection) {
    this.experienceIndirection = experienceIndirection;
  }

  public ComDayCqMcmImplMCMConfigurationProperties touchpointIndirection(ConfigNodePropertyArray touchpointIndirection) {
    this.touchpointIndirection = touchpointIndirection;
    return this;
  }

  /**
   * Get touchpointIndirection
   * @return touchpointIndirection
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getTouchpointIndirection() {
    return touchpointIndirection;
  }

  public void setTouchpointIndirection(ConfigNodePropertyArray touchpointIndirection) {
    this.touchpointIndirection = touchpointIndirection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMcmImplMCMConfigurationProperties comDayCqMcmImplMCMConfigurationProperties = (ComDayCqMcmImplMCMConfigurationProperties) o;
    return Objects.equals(this.experienceIndirection, comDayCqMcmImplMCMConfigurationProperties.experienceIndirection) &&
        Objects.equals(this.touchpointIndirection, comDayCqMcmImplMCMConfigurationProperties.touchpointIndirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experienceIndirection, touchpointIndirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmImplMCMConfigurationProperties {\n");
    
    sb.append("    experienceIndirection: ").append(toIndentedString(experienceIndirection)).append("\n");
    sb.append("    touchpointIndirection: ").append(toIndentedString(touchpointIndirection)).append("\n");
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

