package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ConfigNodePropertyDropDownType   {
  
  private Object labels = null;
  private Object values = null;

  public ConfigNodePropertyDropDownType () {

  }

  public ConfigNodePropertyDropDownType (Object labels, Object values) {
    this.labels = labels;
    this.values = values;
  }

    
  @JsonProperty("labels")
  public Object getLabels() {
    return labels;
  }
  public void setLabels(Object labels) {
    this.labels = labels;
  }

    
  @JsonProperty("values")
  public Object getValues() {
    return values;
  }
  public void setValues(Object values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigNodePropertyDropDownType configNodePropertyDropDownType = (ConfigNodePropertyDropDownType) o;
    return Objects.equals(labels, configNodePropertyDropDownType.labels) &&
        Objects.equals(values, configNodePropertyDropDownType.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigNodePropertyDropDownType {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
