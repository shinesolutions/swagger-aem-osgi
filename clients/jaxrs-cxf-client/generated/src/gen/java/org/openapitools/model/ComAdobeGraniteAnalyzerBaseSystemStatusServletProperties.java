package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean disabled = null;
 /**
   * Get disabled
   * @return disabled
  **/
  @JsonProperty("disabled")
  public ConfigNodePropertyBoolean getDisabled() {
    return disabled;
  }

  public void setDisabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
  }

  public ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties disabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties {\n");
    
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

