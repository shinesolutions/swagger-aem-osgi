/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixSystemreadyImplComponentsCheckProperties   {
  
  private ConfigNodePropertyArray componentsList;
  private ConfigNodePropertyDropDown type;

  /**
   */
  public OrgApacheFelixSystemreadyImplComponentsCheckProperties componentsList(ConfigNodePropertyArray componentsList) {
    this.componentsList = componentsList;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("components.list")
  public ConfigNodePropertyArray getComponentsList() {
    return componentsList;
  }
  public void setComponentsList(ConfigNodePropertyArray componentsList) {
    this.componentsList = componentsList;
  }

  /**
   */
  public OrgApacheFelixSystemreadyImplComponentsCheckProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public ConfigNodePropertyDropDown getType() {
    return type;
  }
  public void setType(ConfigNodePropertyDropDown type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixSystemreadyImplComponentsCheckProperties orgApacheFelixSystemreadyImplComponentsCheckProperties = (OrgApacheFelixSystemreadyImplComponentsCheckProperties) o;
    return Objects.equals(componentsList, orgApacheFelixSystemreadyImplComponentsCheckProperties.componentsList) &&
        Objects.equals(type, orgApacheFelixSystemreadyImplComponentsCheckProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentsList, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadyImplComponentsCheckProperties {\n");
    
    sb.append("    componentsList: ").append(toIndentedString(componentsList)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

