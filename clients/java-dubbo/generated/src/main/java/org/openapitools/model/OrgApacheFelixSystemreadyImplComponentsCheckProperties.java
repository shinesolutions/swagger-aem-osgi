package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheFelixSystemreadyImplComponentsCheckProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("components.list")
  private ConfigNodePropertyArray componentsList;

  @JsonProperty("type")
  private ConfigNodePropertyDropDown type;

  /**
   * 
   * @return componentsList
   */
  public ConfigNodePropertyArray getComponentsList() {
    return componentsList;
  }

  public void setComponentsList(ConfigNodePropertyArray componentsList) {
    this.componentsList = componentsList;
  }

  /**
   * 
   * @return type
   */
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
    return Objects.equals(this.componentsList, orgApacheFelixSystemreadyImplComponentsCheckProperties.componentsList) &&
        Objects.equals(this.type, orgApacheFelixSystemreadyImplComponentsCheckProperties.type);
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
