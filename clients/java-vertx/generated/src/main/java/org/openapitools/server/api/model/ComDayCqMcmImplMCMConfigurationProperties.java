package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqMcmImplMCMConfigurationProperties   {
  
  private ConfigNodePropertyArray experienceIndirection = null;
  private ConfigNodePropertyArray touchpointIndirection = null;

  public ComDayCqMcmImplMCMConfigurationProperties () {

  }

  public ComDayCqMcmImplMCMConfigurationProperties (ConfigNodePropertyArray experienceIndirection, ConfigNodePropertyArray touchpointIndirection) {
    this.experienceIndirection = experienceIndirection;
    this.touchpointIndirection = touchpointIndirection;
  }

    
  @JsonProperty("experience.indirection")
  public ConfigNodePropertyArray getExperienceIndirection() {
    return experienceIndirection;
  }
  public void setExperienceIndirection(ConfigNodePropertyArray experienceIndirection) {
    this.experienceIndirection = experienceIndirection;
  }

    
  @JsonProperty("touchpoint.indirection")
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
    return Objects.equals(experienceIndirection, comDayCqMcmImplMCMConfigurationProperties.experienceIndirection) &&
        Objects.equals(touchpointIndirection, comDayCqMcmImplMCMConfigurationProperties.touchpointIndirection);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
