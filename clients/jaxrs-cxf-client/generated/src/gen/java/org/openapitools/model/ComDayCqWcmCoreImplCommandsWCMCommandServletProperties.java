package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray wcmcommandservletDeleteWhitelist;
 /**
   * Get wcmcommandservletDeleteWhitelist
   * @return wcmcommandservletDeleteWhitelist
  **/
  @JsonProperty("wcmcommandservlet.delete_whitelist")
  public ConfigNodePropertyArray getWcmcommandservletDeleteWhitelist() {
    return wcmcommandservletDeleteWhitelist;
  }

  public void setWcmcommandservletDeleteWhitelist(ConfigNodePropertyArray wcmcommandservletDeleteWhitelist) {
    this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
  }

  public ComDayCqWcmCoreImplCommandsWCMCommandServletProperties wcmcommandservletDeleteWhitelist(ConfigNodePropertyArray wcmcommandservletDeleteWhitelist) {
    this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
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
    ComDayCqWcmCoreImplCommandsWCMCommandServletProperties comDayCqWcmCoreImplCommandsWCMCommandServletProperties = (ComDayCqWcmCoreImplCommandsWCMCommandServletProperties) o;
    return Objects.equals(this.wcmcommandservletDeleteWhitelist, comDayCqWcmCoreImplCommandsWCMCommandServletProperties.wcmcommandservletDeleteWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wcmcommandservletDeleteWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties {\n");
    
    sb.append("    wcmcommandservletDeleteWhitelist: ").append(toIndentedString(wcmcommandservletDeleteWhitelist)).append("\n");
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

