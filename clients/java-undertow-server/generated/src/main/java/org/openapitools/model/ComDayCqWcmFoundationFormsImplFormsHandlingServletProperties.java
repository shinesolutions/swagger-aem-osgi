package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties   {
  
  private ConfigNodePropertyString nameWhitelist = null;
  private ConfigNodePropertyBoolean allowExpressions = null;

  /**
   **/
  public ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties nameWhitelist(ConfigNodePropertyString nameWhitelist) {
    this.nameWhitelist = nameWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name.whitelist")
  public ConfigNodePropertyString getNameWhitelist() {
    return nameWhitelist;
  }
  public void setNameWhitelist(ConfigNodePropertyString nameWhitelist) {
    this.nameWhitelist = nameWhitelist;
  }

  /**
   **/
  public ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties allowExpressions(ConfigNodePropertyBoolean allowExpressions) {
    this.allowExpressions = allowExpressions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allow.expressions")
  public ConfigNodePropertyBoolean getAllowExpressions() {
    return allowExpressions;
  }
  public void setAllowExpressions(ConfigNodePropertyBoolean allowExpressions) {
    this.allowExpressions = allowExpressions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

