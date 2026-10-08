package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConfigNodePropertyInteger
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConfigNodePropertyInteger   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("optional")
  private Boolean optional;

  @JsonProperty("is_set")
  private Boolean isSet;

  @JsonProperty("type")
  private Integer type;

  @JsonProperty("value")
  private Integer value;

  @JsonProperty("description")
  private String description;

  public ConfigNodePropertyInteger name(String name) {
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

  public ConfigNodePropertyInteger optional(Boolean optional) {
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

  public ConfigNodePropertyInteger isSet(Boolean isSet) {
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

  public ConfigNodePropertyInteger type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
   * @return type
  **/
  @ApiModelProperty(value = "Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public ConfigNodePropertyInteger value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Property value
   * @return value
  **/
  @ApiModelProperty(value = "Property value")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public ConfigNodePropertyInteger description(String description) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigNodePropertyInteger configNodePropertyInteger = (ConfigNodePropertyInteger) o;
    return Objects.equals(this.name, configNodePropertyInteger.name) &&
        Objects.equals(this.optional, configNodePropertyInteger.optional) &&
        Objects.equals(this.isSet, configNodePropertyInteger.isSet) &&
        Objects.equals(this.type, configNodePropertyInteger.type) &&
        Objects.equals(this.value, configNodePropertyInteger.value) &&
        Objects.equals(this.description, configNodePropertyInteger.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, isSet, type, value, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigNodePropertyInteger {\n");
    
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

