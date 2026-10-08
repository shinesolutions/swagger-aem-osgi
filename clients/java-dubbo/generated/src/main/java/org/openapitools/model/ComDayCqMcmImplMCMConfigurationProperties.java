package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqMcmImplMCMConfigurationProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("experience.indirection")
  private ConfigNodePropertyArray experienceIndirection;

  @JsonProperty("touchpoint.indirection")
  private ConfigNodePropertyArray touchpointIndirection;

  /**
   * 
   * @return experienceIndirection
   */
  public ConfigNodePropertyArray getExperienceIndirection() {
    return experienceIndirection;
  }

  public void setExperienceIndirection(ConfigNodePropertyArray experienceIndirection) {
    this.experienceIndirection = experienceIndirection;
  }

  /**
   * 
   * @return touchpointIndirection
   */
  public ConfigNodePropertyArray getTouchpointIndirection() {
    return touchpointIndirection;
  }

  public void setTouchpointIndirection(ConfigNodePropertyArray touchpointIndirection) {
    this.touchpointIndirection = touchpointIndirection;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
