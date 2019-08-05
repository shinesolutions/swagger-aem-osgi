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

public class ComDayCqDamCoreImplServletGuidLookupFilterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled = null;
 /**
   * Get cqDamCoreGuidlookupfilterEnabled
   * @return cqDamCoreGuidlookupfilterEnabled
  **/
  @JsonProperty("cq.dam.core.guidlookupfilter.enabled")
  public ConfigNodePropertyBoolean getCqDamCoreGuidlookupfilterEnabled() {
    return cqDamCoreGuidlookupfilterEnabled;
  }

  public void setCqDamCoreGuidlookupfilterEnabled(ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled) {
    this.cqDamCoreGuidlookupfilterEnabled = cqDamCoreGuidlookupfilterEnabled;
  }

  public ComDayCqDamCoreImplServletGuidLookupFilterProperties cqDamCoreGuidlookupfilterEnabled(ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled) {
    this.cqDamCoreGuidlookupfilterEnabled = cqDamCoreGuidlookupfilterEnabled;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletGuidLookupFilterProperties {\n");
    
    sb.append("    cqDamCoreGuidlookupfilterEnabled: ").append(toIndentedString(cqDamCoreGuidlookupfilterEnabled)).append("\n");
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

