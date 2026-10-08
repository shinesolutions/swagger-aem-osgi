package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties   {
  @JsonProperty("name.whitelist")
  private ConfigNodePropertyString nameWhitelist;

  @JsonProperty("allow.expressions")
  private ConfigNodePropertyBoolean allowExpressions;

  public ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties nameWhitelist(ConfigNodePropertyString nameWhitelist) {
    this.nameWhitelist = nameWhitelist;
    return this;
  }

  /**
   * Get nameWhitelist
   * @return nameWhitelist
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getNameWhitelist() {
    return nameWhitelist;
  }

  public void setNameWhitelist(ConfigNodePropertyString nameWhitelist) {
    this.nameWhitelist = nameWhitelist;
  }

  public ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties allowExpressions(ConfigNodePropertyBoolean allowExpressions) {
    this.allowExpressions = allowExpressions;
    return this;
  }

  /**
   * Get allowExpressions
   * @return allowExpressions
   */
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.nameWhitelist, comDayCqWcmFoundationFormsImplFormsHandlingServletProperties.nameWhitelist) &&
        Objects.equals(this.allowExpressions, comDayCqWcmFoundationFormsImplFormsHandlingServletProperties.allowExpressions);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

