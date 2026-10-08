package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConfigNodePropertyDropDownType  {
  
 /**
  * Drop Down label
  */
  @ApiModelProperty(value = "Drop Down label")

  private Object labels = null;

 /**
  * Drown Down value
  */
  @ApiModelProperty(value = "Drown Down value")

  private Object values = null;
 /**
   * Drop Down label
   * @return labels
  **/
  @JsonProperty("labels")
  public Object getLabels() {
    return labels;
  }

  public void setLabels(Object labels) {
    this.labels = labels;
  }

  public ConfigNodePropertyDropDownType labels(Object labels) {
    this.labels = labels;
    return this;
  }

 /**
   * Drown Down value
   * @return values
  **/
  @JsonProperty("values")
  public Object getValues() {
    return values;
  }

  public void setValues(Object values) {
    this.values = values;
  }

  public ConfigNodePropertyDropDownType values(Object values) {
    this.values = values;
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
    ConfigNodePropertyDropDownType configNodePropertyDropDownType = (ConfigNodePropertyDropDownType) o;
    return Objects.equals(this.labels, configNodePropertyDropDownType.labels) &&
        Objects.equals(this.values, configNodePropertyDropDownType.values);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

