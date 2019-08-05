package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
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

public class OrgApacheSlingXssImplXSSFilterImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString policyPath = null;
 /**
   * Get policyPath
   * @return policyPath
  **/
  @JsonProperty("policyPath")
  public ConfigNodePropertyString getPolicyPath() {
    return policyPath;
  }

  public void setPolicyPath(ConfigNodePropertyString policyPath) {
    this.policyPath = policyPath;
  }

  public OrgApacheSlingXssImplXSSFilterImplProperties policyPath(ConfigNodePropertyString policyPath) {
    this.policyPath = policyPath;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingXssImplXSSFilterImplProperties {\n");
    
    sb.append("    policyPath: ").append(toIndentedString(policyPath)).append("\n");
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

