package apimodels;

import apimodels.ConfigNodePropertyDropDownType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConfigNodePropertyDropDown
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConfigNodePropertyDropDown   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("optional")
  
  private Boolean optional;

  @JsonProperty("is_set")
  
  private Boolean isSet;

  @JsonProperty("type")
  @Valid

  private ConfigNodePropertyDropDownType type;

  @JsonProperty("value")
  
  private Object value = null;

  @JsonProperty("description")
  
  private String description;

  public ConfigNodePropertyDropDown name(String name) {
    this.name = name;
    return this;
  }

   /**
   * property name
   * @return name
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

