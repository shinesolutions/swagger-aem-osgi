package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConfigNodePropertyDropDownType;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ConfigNodePropertyDropDown   {
  
  private String name;

  private Boolean optional;

  private Boolean isSet;

  private ConfigNodePropertyDropDownType type;

  private Object value = null;

  private String description;

  /**
   * property name
   **/
  public ConfigNodePropertyDropDown name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "property name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * True if optional
   **/
  public ConfigNodePropertyDropDown optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  
  @ApiModelProperty(value = "True if optional")
  @JsonProperty("optional")
  public Boolean getOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  /**
   * True if property is set
   **/
  public ConfigNodePropertyDropDown isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

  
  @ApiModelProperty(value = "True if property is set")
  @JsonProperty("is_set")
  public Boolean getIsSet() {
    return isSet;
  }
  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }


  /**
   **/
  public ConfigNodePropertyDropDown type(ConfigNodePropertyDropDownType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public ConfigNodePropertyDropDownType getType() {
    return type;
  }
  public void setType(ConfigNodePropertyDropDownType type) {
    this.type = type;
  }


  /**
   * Property value
   **/
  public ConfigNodePropertyDropDown value(Object value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "Property value")
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }
  public void setValue(Object value) {
    this.value = value;
  }


  /**
   * Property description
   **/
  public ConfigNodePropertyDropDown description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Property description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

