package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConfigNodePropertyDropDownType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConfigNodePropertyDropDown  {
  
 /**
  * property name
  */
  @ApiModelProperty(value = "property name")

  private String name;

 /**
  * True if optional
  */
  @ApiModelProperty(value = "True if optional")

  private Boolean optional;

 /**
  * True if property is set
  */
  @ApiModelProperty(value = "True if property is set")

  private Boolean isSet;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyDropDownType type;

 /**
  * Property value
  */
  @ApiModelProperty(value = "Property value")

  private Object value = null;

 /**
  * Property description
  */
  @ApiModelProperty(value = "Property description")

  private String description;
 /**
   * property name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConfigNodePropertyDropDown name(String name) {
    this.name = name;
    return this;
  }

 /**
   * True if optional
   * @return optional
  **/
  @JsonProperty("optional")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public ConfigNodePropertyDropDown optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

 /**
   * True if property is set
   * @return isSet
  **/
  @JsonProperty("is_set")
  public Boolean getIsSet() {
    return isSet;
  }

  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

  public ConfigNodePropertyDropDown isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public ConfigNodePropertyDropDownType getType() {
    return type;
  }

  public void setType(ConfigNodePropertyDropDownType type) {
    this.type = type;
  }

  public ConfigNodePropertyDropDown type(ConfigNodePropertyDropDownType type) {
    this.type = type;
    return this;
  }

 /**
   * Property value
   * @return value
  **/
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public ConfigNodePropertyDropDown value(Object value) {
    this.value = value;
    return this;
  }

 /**
   * Property description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConfigNodePropertyDropDown description(String description) {
    this.description = description;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigNodePropertyDropDown configNodePropertyDropDown = (ConfigNodePropertyDropDown) o;
    return Objects.equals(this.name, configNodePropertyDropDown.name) &&
        Objects.equals(this.optional, configNodePropertyDropDown.optional) &&
        Objects.equals(this.isSet, configNodePropertyDropDown.isSet) &&
        Objects.equals(this.type, configNodePropertyDropDown.type) &&
        Objects.equals(this.value, configNodePropertyDropDown.value) &&
        Objects.equals(this.description, configNodePropertyDropDown.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, isSet, type, value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigNodePropertyDropDown {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

