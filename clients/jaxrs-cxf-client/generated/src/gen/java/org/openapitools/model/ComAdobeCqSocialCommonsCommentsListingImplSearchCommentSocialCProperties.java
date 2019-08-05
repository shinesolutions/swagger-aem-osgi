package org.openapitools.model;

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

public class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger numUserLimit = null;
 /**
   * Get numUserLimit
   * @return numUserLimit
  **/
  @JsonProperty("numUserLimit")
  public ConfigNodePropertyInteger getNumUserLimit() {
    return numUserLimit;
  }

  public void setNumUserLimit(ConfigNodePropertyInteger numUserLimit) {
    this.numUserLimit = numUserLimit;
  }

  public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties numUserLimit(ConfigNodePropertyInteger numUserLimit) {
    this.numUserLimit = numUserLimit;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties {\n");
    
    sb.append("    numUserLimit: ").append(toIndentedString(numUserLimit)).append("\n");
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

