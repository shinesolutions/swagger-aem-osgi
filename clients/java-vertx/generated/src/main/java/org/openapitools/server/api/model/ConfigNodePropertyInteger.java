package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ConfigNodePropertyInteger   {
  
  private String name = null;
  private Boolean optional = null;
  private Boolean isSet = null;
  private Integer type = null;
  private Integer value = null;
  private String description = null;

  public ConfigNodePropertyInteger () {

  }

  public ConfigNodePropertyInteger (String name, Boolean optional, Boolean isSet, Integer type, Integer value, String description) {
    this.name = name;
    this.optional = optional;
    this.isSet = isSet;
    this.type = type;
    this.value = value;
    this.description = description;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("optional")
  public Boolean getOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

    
  @JsonProperty("is_set")
  public Boolean getIsSet() {
    return isSet;
  }
  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

    
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }

    
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }

    
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
    ConfigNodePropertyInteger configNodePropertyInteger = (ConfigNodePropertyInteger) o;
    return Objects.equals(name, configNodePropertyInteger.name) &&
        Objects.equals(optional, configNodePropertyInteger.optional) &&
        Objects.equals(isSet, configNodePropertyInteger.isSet) &&
        Objects.equals(type, configNodePropertyInteger.type) &&
        Objects.equals(value, configNodePropertyInteger.value) &&
        Objects.equals(description, configNodePropertyInteger.description);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
