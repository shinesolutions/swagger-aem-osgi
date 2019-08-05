package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxRetry = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray fieldWhitelist = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray attachmentTypeBlacklist = null;
 /**
   * Get maxRetry
   * @return maxRetry
  **/
  @JsonProperty("MaxRetry")
  public ConfigNodePropertyInteger getMaxRetry() {
    return maxRetry;
  }

  public void setMaxRetry(ConfigNodePropertyInteger maxRetry) {
    this.maxRetry = maxRetry;
  }

  public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties maxRetry(ConfigNodePropertyInteger maxRetry) {
    this.maxRetry = maxRetry;
    return this;
  }

 /**
   * Get fieldWhitelist
   * @return fieldWhitelist
  **/
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }

  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

  public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

 /**
   * Get attachmentTypeBlacklist
   * @return attachmentTypeBlacklist
  **/
  @JsonProperty("attachmentTypeBlacklist")
  public ConfigNodePropertyArray getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }

  public void setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties attachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties {\n");
    
    sb.append("    maxRetry: ").append(toIndentedString(maxRetry)).append("\n");
    sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
    sb.append("    attachmentTypeBlacklist: ").append(toIndentedString(attachmentTypeBlacklist)).append("\n");
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

