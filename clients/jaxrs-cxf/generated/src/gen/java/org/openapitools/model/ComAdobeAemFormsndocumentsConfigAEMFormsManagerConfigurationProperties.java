package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates = null;
 /**
   * Get formsManagerConfigIncludeOOTBTemplates
   * @return formsManagerConfigIncludeOOTBTemplates
  **/
  @JsonProperty("formsManagerConfig.includeOOTBTemplates")
  public ConfigNodePropertyBoolean getFormsManagerConfigIncludeOOTBTemplates() {
    return formsManagerConfigIncludeOOTBTemplates;
  }

  public void setFormsManagerConfigIncludeOOTBTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates) {
    this.formsManagerConfigIncludeOOTBTemplates = formsManagerConfigIncludeOOTBTemplates;
  }

  public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties formsManagerConfigIncludeOOTBTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates) {
    this.formsManagerConfigIncludeOOTBTemplates = formsManagerConfigIncludeOOTBTemplates;
    return this;
  }

 /**
   * Get formsManagerConfigIncludeDeprecatedTemplates
   * @return formsManagerConfigIncludeDeprecatedTemplates
  **/
  @JsonProperty("formsManagerConfig.includeDeprecatedTemplates")
  public ConfigNodePropertyBoolean getFormsManagerConfigIncludeDeprecatedTemplates() {
    return formsManagerConfigIncludeDeprecatedTemplates;
  }

  public void setFormsManagerConfigIncludeDeprecatedTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates) {
    this.formsManagerConfigIncludeDeprecatedTemplates = formsManagerConfigIncludeDeprecatedTemplates;
  }

  public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties formsManagerConfigIncludeDeprecatedTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates) {
    this.formsManagerConfigIncludeDeprecatedTemplates = formsManagerConfigIncludeDeprecatedTemplates;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties {\n");
    
    sb.append("    formsManagerConfigIncludeOOTBTemplates: ").append(toIndentedString(formsManagerConfigIncludeOOTBTemplates)).append("\n");
    sb.append("    formsManagerConfigIncludeDeprecatedTemplates: ").append(toIndentedString(formsManagerConfigIncludeDeprecatedTemplates)).append("\n");
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

