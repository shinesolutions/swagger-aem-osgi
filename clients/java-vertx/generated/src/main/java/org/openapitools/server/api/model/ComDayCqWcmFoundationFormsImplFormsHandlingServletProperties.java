package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties   {
  
  private ConfigNodePropertyString nameWhitelist = null;
  private ConfigNodePropertyBoolean allowExpressions = null;

  public ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties () {

  }

  public ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties (ConfigNodePropertyString nameWhitelist, ConfigNodePropertyBoolean allowExpressions) {
    this.nameWhitelist = nameWhitelist;
    this.allowExpressions = allowExpressions;
  }

    
  @JsonProperty("name.whitelist")
  public ConfigNodePropertyString getNameWhitelist() {
    return nameWhitelist;
  }
  public void setNameWhitelist(ConfigNodePropertyString nameWhitelist) {
    this.nameWhitelist = nameWhitelist;
  }

    
  @JsonProperty("allow.expressions")
  public ConfigNodePropertyBoolean getAllowExpressions() {
    return allowExpressions;
  }
  public void setAllowExpressions(ConfigNodePropertyBoolean allowExpressions) {
    this.allowExpressions = allowExpressions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties comDayCqWcmFoundationFormsImplFormsHandlingServletProperties = (ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties) o;
    return Objects.equals(nameWhitelist, comDayCqWcmFoundationFormsImplFormsHandlingServletProperties.nameWhitelist) &&
        Objects.equals(allowExpressions, comDayCqWcmFoundationFormsImplFormsHandlingServletProperties.allowExpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameWhitelist, allowExpressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties {\n");
    
    sb.append("    nameWhitelist: ").append(toIndentedString(nameWhitelist)).append("\n");
    sb.append("    allowExpressions: ").append(toIndentedString(allowExpressions)).append("\n");
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
