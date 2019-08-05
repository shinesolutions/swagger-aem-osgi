package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ConfigNodePropertyDropDownType   {
  
  private Object labels = null;

  private Object values = null;


  /**
   * Drop Down label
   **/
  public ConfigNodePropertyDropDownType labels(Object labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(value = "Drop Down label")
  @JsonProperty("labels")
  public Object getLabels() {
    return labels;
  }
  public void setLabels(Object labels) {
    this.labels = labels;
  }


  /**
   * Drown Down value
   **/
  public ConfigNodePropertyDropDownType values(Object values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(value = "Drown Down value")
  @JsonProperty("values")
  public Object getValues() {
    return values;
  }
  public void setValues(Object values) {
    this.values = values;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

