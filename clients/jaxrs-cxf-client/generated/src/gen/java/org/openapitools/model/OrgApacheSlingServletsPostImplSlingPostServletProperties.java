package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingServletsPostImplSlingPostServletProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray servletPostDateFormats = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray servletPostNodeNameHints = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger servletPostNodeNameMaxLength = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean servletPostAutoCheckout = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean servletPostAutoCheckin = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString servletPostIgnorePattern = null;
 /**
   * Get servletPostDateFormats
   * @return servletPostDateFormats
  **/
  @JsonProperty("servlet.post.dateFormats")
  public ConfigNodePropertyArray getServletPostDateFormats() {
    return servletPostDateFormats;
  }

  public void setServletPostDateFormats(ConfigNodePropertyArray servletPostDateFormats) {
    this.servletPostDateFormats = servletPostDateFormats;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostDateFormats(ConfigNodePropertyArray servletPostDateFormats) {
    this.servletPostDateFormats = servletPostDateFormats;
    return this;
  }

 /**
   * Get servletPostNodeNameHints
   * @return servletPostNodeNameHints
  **/
  @JsonProperty("servlet.post.nodeNameHints")
  public ConfigNodePropertyArray getServletPostNodeNameHints() {
    return servletPostNodeNameHints;
  }

  public void setServletPostNodeNameHints(ConfigNodePropertyArray servletPostNodeNameHints) {
    this.servletPostNodeNameHints = servletPostNodeNameHints;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostNodeNameHints(ConfigNodePropertyArray servletPostNodeNameHints) {
    this.servletPostNodeNameHints = servletPostNodeNameHints;
    return this;
  }

 /**
   * Get servletPostNodeNameMaxLength
   * @return servletPostNodeNameMaxLength
  **/
  @JsonProperty("servlet.post.nodeNameMaxLength")
  public ConfigNodePropertyInteger getServletPostNodeNameMaxLength() {
    return servletPostNodeNameMaxLength;
  }

  public void setServletPostNodeNameMaxLength(ConfigNodePropertyInteger servletPostNodeNameMaxLength) {
    this.servletPostNodeNameMaxLength = servletPostNodeNameMaxLength;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostNodeNameMaxLength(ConfigNodePropertyInteger servletPostNodeNameMaxLength) {
    this.servletPostNodeNameMaxLength = servletPostNodeNameMaxLength;
    return this;
  }

 /**
   * Get servletPostCheckinNewVersionableNodes
   * @return servletPostCheckinNewVersionableNodes
  **/
  @JsonProperty("servlet.post.checkinNewVersionableNodes")
  public ConfigNodePropertyBoolean getServletPostCheckinNewVersionableNodes() {
    return servletPostCheckinNewVersionableNodes;
  }

  public void setServletPostCheckinNewVersionableNodes(ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes) {
    this.servletPostCheckinNewVersionableNodes = servletPostCheckinNewVersionableNodes;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostCheckinNewVersionableNodes(ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes) {
    this.servletPostCheckinNewVersionableNodes = servletPostCheckinNewVersionableNodes;
    return this;
  }

 /**
   * Get servletPostAutoCheckout
   * @return servletPostAutoCheckout
  **/
  @JsonProperty("servlet.post.autoCheckout")
  public ConfigNodePropertyBoolean getServletPostAutoCheckout() {
    return servletPostAutoCheckout;
  }

  public void setServletPostAutoCheckout(ConfigNodePropertyBoolean servletPostAutoCheckout) {
    this.servletPostAutoCheckout = servletPostAutoCheckout;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostAutoCheckout(ConfigNodePropertyBoolean servletPostAutoCheckout) {
    this.servletPostAutoCheckout = servletPostAutoCheckout;
    return this;
  }

 /**
   * Get servletPostAutoCheckin
   * @return servletPostAutoCheckin
  **/
  @JsonProperty("servlet.post.autoCheckin")
  public ConfigNodePropertyBoolean getServletPostAutoCheckin() {
    return servletPostAutoCheckin;
  }

  public void setServletPostAutoCheckin(ConfigNodePropertyBoolean servletPostAutoCheckin) {
    this.servletPostAutoCheckin = servletPostAutoCheckin;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostAutoCheckin(ConfigNodePropertyBoolean servletPostAutoCheckin) {
    this.servletPostAutoCheckin = servletPostAutoCheckin;
    return this;
  }

 /**
   * Get servletPostIgnorePattern
   * @return servletPostIgnorePattern
  **/
  @JsonProperty("servlet.post.ignorePattern")
  public ConfigNodePropertyString getServletPostIgnorePattern() {
    return servletPostIgnorePattern;
  }

  public void setServletPostIgnorePattern(ConfigNodePropertyString servletPostIgnorePattern) {
    this.servletPostIgnorePattern = servletPostIgnorePattern;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostIgnorePattern(ConfigNodePropertyString servletPostIgnorePattern) {
    this.servletPostIgnorePattern = servletPostIgnorePattern;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServletsPostImplSlingPostServletProperties {\n");
    
    sb.append("    servletPostDateFormats: ").append(toIndentedString(servletPostDateFormats)).append("\n");
    sb.append("    servletPostNodeNameHints: ").append(toIndentedString(servletPostNodeNameHints)).append("\n");
    sb.append("    servletPostNodeNameMaxLength: ").append(toIndentedString(servletPostNodeNameMaxLength)).append("\n");
    sb.append("    servletPostCheckinNewVersionableNodes: ").append(toIndentedString(servletPostCheckinNewVersionableNodes)).append("\n");
    sb.append("    servletPostAutoCheckout: ").append(toIndentedString(servletPostAutoCheckout)).append("\n");
    sb.append("    servletPostAutoCheckin: ").append(toIndentedString(servletPostAutoCheckin)).append("\n");
    sb.append("    servletPostIgnorePattern: ").append(toIndentedString(servletPostIgnorePattern)).append("\n");
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

