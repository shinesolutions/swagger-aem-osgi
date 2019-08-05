package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigNodePropertyDropDownType  {
  
  @ApiModelProperty(value = "Drop Down label")
 /**
   * Drop Down label
  **/
  private Object labels = null;

  @ApiModelProperty(value = "Drown Down value")
 /**
   * Drown Down value
  **/
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

