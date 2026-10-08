package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConfigNodePropertyInteger  {
  
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

 /**
  * Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
  */
  @ApiModelProperty(value = "Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)")

  private Integer type;

 /**
  * Property value
  */
  @ApiModelProperty(value = "Property value")

  private Integer value;

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

  public ConfigNodePropertyInteger name(String name) {
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

  public ConfigNodePropertyInteger optional(Boolean optional) {
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

  public ConfigNodePropertyInteger isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

 /**
   * Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)
   * @return type
  **/
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public ConfigNodePropertyInteger type(Integer type) {
    this.type = type;
    return this;
  }

 /**
   * Property value
   * @return value
  **/
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public ConfigNodePropertyInteger value(Integer value) {
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

  public ConfigNodePropertyInteger description(String description) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

