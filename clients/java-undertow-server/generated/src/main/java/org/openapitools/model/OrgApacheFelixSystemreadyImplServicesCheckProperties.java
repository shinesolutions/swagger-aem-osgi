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
public class OrgApacheFelixSystemreadyImplServicesCheckProperties   {
  
  private ConfigNodePropertyArray servicesList;
  private ConfigNodePropertyDropDown type;

  /**
   */
  public OrgApacheFelixSystemreadyImplServicesCheckProperties servicesList(ConfigNodePropertyArray servicesList) {
    this.servicesList = servicesList;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("services.list")
  public ConfigNodePropertyArray getServicesList() {
    return servicesList;
  }
  public void setServicesList(ConfigNodePropertyArray servicesList) {
    this.servicesList = servicesList;
  }

  /**
   */
  public OrgApacheFelixSystemreadyImplServicesCheckProperties type(ConfigNodePropertyDropDown type) {
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
    OrgApacheFelixSystemreadyImplServicesCheckProperties orgApacheFelixSystemreadyImplServicesCheckProperties = (OrgApacheFelixSystemreadyImplServicesCheckProperties) o;
    return Objects.equals(servicesList, orgApacheFelixSystemreadyImplServicesCheckProperties.servicesList) &&
        Objects.equals(type, orgApacheFelixSystemreadyImplServicesCheckProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicesList, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadyImplServicesCheckProperties {\n");
    
    sb.append("    servicesList: ").append(toIndentedString(servicesList)).append("\n");
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

