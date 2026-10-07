package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmCoreImplCommandsWCMCommandServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties   {
  @JsonProperty("wcmcommandservlet.delete_whitelist")
  private ConfigNodePropertyArray wcmcommandservletDeleteWhitelist;

  public ComDayCqWcmCoreImplCommandsWCMCommandServletProperties wcmcommandservletDeleteWhitelist(ConfigNodePropertyArray wcmcommandservletDeleteWhitelist) {
    this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
    return this;
  }

  /**
   * Get wcmcommandservletDeleteWhitelist
   * @return wcmcommandservletDeleteWhitelist
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getWcmcommandservletDeleteWhitelist() {
    return wcmcommandservletDeleteWhitelist;
  }

  public void setWcmcommandservletDeleteWhitelist(ConfigNodePropertyArray wcmcommandservletDeleteWhitelist) {
    this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

