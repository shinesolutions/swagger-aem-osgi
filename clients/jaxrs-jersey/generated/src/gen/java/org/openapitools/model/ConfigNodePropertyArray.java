/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * ConfigNodePropertyArray
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-05T00:58:47.028Z[GMT]")
public class ConfigNodePropertyArray   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("optional")
  private Boolean optional = null;

  @JsonProperty("is_set")
  private Boolean isSet = null;

  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("values")
  private List<String> values = null;

  @JsonProperty("description")
  private String description = null;

  public ConfigNodePropertyArray name(String name) {
    this.name = name;
    return this;
  }

  /**
   * property name
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "property name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConfigNodePropertyArray optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  /**
   * True if optional
   * @return optional
   **/
  @JsonProperty("optional")
  @ApiModelProperty(value = "True if optional")
  public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public ConfigNodePropertyArray isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

  /**
   * True if property is set
   * @return isSet
   **/
  @JsonProperty("is_set")
  @ApiModelProperty(value = "True if property is set")
  public Boolean getIsSet() {
    return isSet;
  }

  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

  public ConfigNodePropertyArray type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)
   * @return type
   **/
  @JsonProperty("type")
  @ApiModelProperty(value = "Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public ConfigNodePropertyArray values(List<String> values) {
    this.values = values;
    return this;
  }

  public ConfigNodePropertyArray addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Property value
   * @return values
   **/
  @JsonProperty("values")
  @ApiModelProperty(value = "Property value")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public ConfigNodePropertyArray description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Property description
   * @return description
   **/
  @JsonProperty("description")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
