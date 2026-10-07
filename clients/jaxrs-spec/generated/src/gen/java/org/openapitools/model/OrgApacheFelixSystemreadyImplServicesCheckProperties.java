package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheFelixSystemreadyImplServicesCheckProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixSystemreadyImplServicesCheckProperties   {
  private ConfigNodePropertyArray servicesList;
  private ConfigNodePropertyDropDown type;

  public OrgApacheFelixSystemreadyImplServicesCheckProperties() {
  }

  /**
   **/
  public OrgApacheFelixSystemreadyImplServicesCheckProperties servicesList(ConfigNodePropertyArray servicesList) {
    this.servicesList = servicesList;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("services.list")
  @Valid public ConfigNodePropertyArray getServicesList() {
    return servicesList;
  }

  @JsonProperty("services.list")
  public void setServicesList(ConfigNodePropertyArray servicesList) {
    this.servicesList = servicesList;
  }

  /**
   **/
  public OrgApacheFelixSystemreadyImplServicesCheckProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  @Valid public ConfigNodePropertyDropDown getType() {
    return type;
  }

  @JsonProperty("type")
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
    return Objects.equals(this.servicesList, orgApacheFelixSystemreadyImplServicesCheckProperties.servicesList) &&
        Objects.equals(this.type, orgApacheFelixSystemreadyImplServicesCheckProperties.type);
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
