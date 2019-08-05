package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyDropDownType;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ConfigNodePropertyDropDown   {
  
  private String name = null;
  private Boolean optional = null;
  private Boolean isSet = null;
  private ConfigNodePropertyDropDownType type = null;
  private Object value = null;
  private String description = null;

  /**
   * property name
   **/
  
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
  
  @ApiModelProperty(value = "Property description")
  @JsonProperty("description")
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
    return Objects.equals(name, configNodePropertyDropDown.name) &&
        Objects.equals(optional, configNodePropertyDropDown.optional) &&
        Objects.equals(isSet, configNodePropertyDropDown.isSet) &&
        Objects.equals(type, configNodePropertyDropDown.type) &&
        Objects.equals(value, configNodePropertyDropDown.value) &&
        Objects.equals(description, configNodePropertyDropDown.description);
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

