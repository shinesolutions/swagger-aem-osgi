package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray codeupgradetasks = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray codeupgradetaskfilters = null;
 /**
   * Get codeupgradetasks
   * @return codeupgradetasks
  **/
  @JsonProperty("codeupgradetasks")
  public ConfigNodePropertyArray getCodeupgradetasks() {
    return codeupgradetasks;
  }

  public void setCodeupgradetasks(ConfigNodePropertyArray codeupgradetasks) {
    this.codeupgradetasks = codeupgradetasks;
  }

  public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties codeupgradetasks(ConfigNodePropertyArray codeupgradetasks) {
    this.codeupgradetasks = codeupgradetasks;
    return this;
  }

 /**
   * Get codeupgradetaskfilters
   * @return codeupgradetaskfilters
  **/
  @JsonProperty("codeupgradetaskfilters")
  public ConfigNodePropertyArray getCodeupgradetaskfilters() {
    return codeupgradetaskfilters;
  }

  public void setCodeupgradetaskfilters(ConfigNodePropertyArray codeupgradetaskfilters) {
    this.codeupgradetaskfilters = codeupgradetaskfilters;
  }

  public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties codeupgradetaskfilters(ConfigNodePropertyArray codeupgradetaskfilters) {
    this.codeupgradetaskfilters = codeupgradetaskfilters;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties {\n");
    
    sb.append("    codeupgradetasks: ").append(toIndentedString(codeupgradetasks)).append("\n");
    sb.append("    codeupgradetaskfilters: ").append(toIndentedString(codeupgradetaskfilters)).append("\n");
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

