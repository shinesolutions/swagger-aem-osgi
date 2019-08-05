package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheFelixSystemreadyImplComponentsCheckProperties   {
  
  private ConfigNodePropertyArray componentsList = null;
  private ConfigNodePropertyDropDown type = null;

  public OrgApacheFelixSystemreadyImplComponentsCheckProperties () {

  }

  public OrgApacheFelixSystemreadyImplComponentsCheckProperties (ConfigNodePropertyArray componentsList, ConfigNodePropertyDropDown type) {
    this.componentsList = componentsList;
    this.type = type;
  }

    
  @JsonProperty("components.list")
  public ConfigNodePropertyArray getComponentsList() {
    return componentsList;
  }
  public void setComponentsList(ConfigNodePropertyArray componentsList) {
    this.componentsList = componentsList;
  }

    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
