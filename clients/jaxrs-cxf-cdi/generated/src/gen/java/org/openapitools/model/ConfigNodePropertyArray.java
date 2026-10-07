package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ConfigNodePropertyArray   {
  
  private String name;

  private Boolean optional;

  private Boolean isSet;

  private Integer type;

  private List<String> values = new ArrayList<>();

  private String description;

  /**
   * property name
   **/
  public ConfigNodePropertyArray name(String name) {
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
  public ConfigNodePropertyArray optional(Boolean optional) {
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
  public ConfigNodePropertyArray isSet(Boolean isSet) {
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
   * Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)
   **/
  public ConfigNodePropertyArray type(Integer type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)")
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }


  /**
   * Property value
   **/
  public ConfigNodePropertyArray values(List<String> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(value = "Property value")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  public ConfigNodePropertyArray addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }


  /**
   * Property description
   **/
  public ConfigNodePropertyArray description(String description) {
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
    ConfigNodePropertyArray configNodePropertyArray = (ConfigNodePropertyArray) o;
    return Objects.equals(this.name, configNodePropertyArray.name) &&
        Objects.equals(this.optional, configNodePropertyArray.optional) &&
        Objects.equals(this.isSet, configNodePropertyArray.isSet) &&
        Objects.equals(this.type, configNodePropertyArray.type) &&
        Objects.equals(this.values, configNodePropertyArray.values) &&
        Objects.equals(this.description, configNodePropertyArray.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, isSet, type, values, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigNodePropertyArray {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

