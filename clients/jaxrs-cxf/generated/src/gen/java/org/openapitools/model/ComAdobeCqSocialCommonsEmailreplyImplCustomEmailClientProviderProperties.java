package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
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

public class ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger priorityOrder = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray replyEmailPatterns = null;
 /**
   * Get priorityOrder
   * @return priorityOrder
  **/
  @JsonProperty("priorityOrder")
  public ConfigNodePropertyInteger getPriorityOrder() {
    return priorityOrder;
  }

  public void setPriorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties priorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
    return this;
  }

 /**
   * Get replyEmailPatterns
   * @return replyEmailPatterns
  **/
  @JsonProperty("replyEmailPatterns")
  public ConfigNodePropertyArray getReplyEmailPatterns() {
    return replyEmailPatterns;
  }

  public void setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties replyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties {\n");
    
    sb.append("    priorityOrder: ").append(toIndentedString(priorityOrder)).append("\n");
    sb.append("    replyEmailPatterns: ").append(toIndentedString(replyEmailPatterns)).append("\n");
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

