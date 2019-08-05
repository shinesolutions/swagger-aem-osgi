package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDownType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ConfigNodePropertyDropDown
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ConfigNodePropertyDropDown   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("optional")
  private Boolean optional = null;

  @JsonProperty("is_set")
  private Boolean isSet = null;

  @JsonProperty("type")
  private ConfigNodePropertyDropDownType type = null;

  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("description")
  private String description = null;

  public ConfigNodePropertyDropDown name(String name) {
    this.name = name;
    return this;
  }

   /**
   * property name
   * @return name
  **/
  @ApiModelProperty(value = "property name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConfigNodePropertyDropDown optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * True if optional
   * @return optional
  **/
  @ApiModelProperty(value = "True if optional")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public ConfigNodePropertyDropDown isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

   /**
   * True if property is set
   * @return isSet
  **/
  @ApiModelProperty(value = "True if property is set")
  public Boolean getIsSet() {
    return isSet;
  }

  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

  public ConfigNodePropertyDropDown type(ConfigNodePropertyDropDownType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDownType getType() {
    return type;
  }

  public void setType(ConfigNodePropertyDropDownType type) {
    this.type = type;
  }

  public ConfigNodePropertyDropDown value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Property value
   * @return value
  **/
  @ApiModelProperty(value = "Property value")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public ConfigNodePropertyDropDown description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Property description
   * @return description
  **/
  @ApiModelProperty(value = "Property description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

