package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheFelixSystemreadyImplComponentsCheckProperties   {
  
  private @Valid ConfigNodePropertyArray componentsList = null;
  private @Valid ConfigNodePropertyDropDown type = null;

  /**
   **/
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
   **/
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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

