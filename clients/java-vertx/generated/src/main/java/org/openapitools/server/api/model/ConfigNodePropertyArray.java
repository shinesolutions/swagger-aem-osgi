package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ConfigNodePropertyArray   {
  
  private String name = null;
  private Boolean optional = null;
  private Boolean isSet = null;
  private Integer type = null;
  private List<String> values = new ArrayList<>();
  private String description = null;

  public ConfigNodePropertyArray () {

  }

  public ConfigNodePropertyArray (String name, Boolean optional, Boolean isSet, Integer type, List<String> values, String description) {
    this.name = name;
    this.optional = optional;
    this.isSet = isSet;
    this.type = type;
    this.values = values;
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

    
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
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
    ConfigNodePropertyArray configNodePropertyArray = (ConfigNodePropertyArray) o;
    return Objects.equals(name, configNodePropertyArray.name) &&
        Objects.equals(optional, configNodePropertyArray.optional) &&
        Objects.equals(isSet, configNodePropertyArray.isSet) &&
        Objects.equals(type, configNodePropertyArray.type) &&
        Objects.equals(values, configNodePropertyArray.values) &&
        Objects.equals(description, configNodePropertyArray.description);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
