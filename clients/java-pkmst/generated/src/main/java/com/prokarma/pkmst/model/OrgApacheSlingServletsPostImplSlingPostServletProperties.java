package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingServletsPostImplSlingPostServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingServletsPostImplSlingPostServletProperties   {
  @JsonProperty("servlet.post.dateFormats")
  private ConfigNodePropertyArray servletPostDateFormats = null;

  @JsonProperty("servlet.post.nodeNameHints")
  private ConfigNodePropertyArray servletPostNodeNameHints = null;

  @JsonProperty("servlet.post.nodeNameMaxLength")
  private ConfigNodePropertyInteger servletPostNodeNameMaxLength = null;

  @JsonProperty("servlet.post.checkinNewVersionableNodes")
  private ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes = null;

  @JsonProperty("servlet.post.autoCheckout")
  private ConfigNodePropertyBoolean servletPostAutoCheckout = null;

  @JsonProperty("servlet.post.autoCheckin")
  private ConfigNodePropertyBoolean servletPostAutoCheckin = null;

  @JsonProperty("servlet.post.ignorePattern")
  private ConfigNodePropertyString servletPostIgnorePattern = null;

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostDateFormats(ConfigNodePropertyArray servletPostDateFormats) {
    this.servletPostDateFormats = servletPostDateFormats;
    return this;
  }

   /**
   * Get servletPostDateFormats
   * @return servletPostDateFormats
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getServletPostDateFormats() {
    return servletPostDateFormats;
  }

  public void setServletPostDateFormats(ConfigNodePropertyArray servletPostDateFormats) {
    this.servletPostDateFormats = servletPostDateFormats;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostNodeNameHints(ConfigNodePropertyArray servletPostNodeNameHints) {
    this.servletPostNodeNameHints = servletPostNodeNameHints;
    return this;
  }

   /**
   * Get servletPostNodeNameHints
   * @return servletPostNodeNameHints
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getServletPostNodeNameHints() {
    return servletPostNodeNameHints;
  }

  public void setServletPostNodeNameHints(ConfigNodePropertyArray servletPostNodeNameHints) {
    this.servletPostNodeNameHints = servletPostNodeNameHints;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostNodeNameMaxLength(ConfigNodePropertyInteger servletPostNodeNameMaxLength) {
    this.servletPostNodeNameMaxLength = servletPostNodeNameMaxLength;
    return this;
  }

   /**
   * Get servletPostNodeNameMaxLength
   * @return servletPostNodeNameMaxLength
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getServletPostNodeNameMaxLength() {
    return servletPostNodeNameMaxLength;
  }

  public void setServletPostNodeNameMaxLength(ConfigNodePropertyInteger servletPostNodeNameMaxLength) {
    this.servletPostNodeNameMaxLength = servletPostNodeNameMaxLength;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostCheckinNewVersionableNodes(ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes) {
    this.servletPostCheckinNewVersionableNodes = servletPostCheckinNewVersionableNodes;
    return this;
  }

   /**
   * Get servletPostCheckinNewVersionableNodes
   * @return servletPostCheckinNewVersionableNodes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getServletPostCheckinNewVersionableNodes() {
    return servletPostCheckinNewVersionableNodes;
  }

  public void setServletPostCheckinNewVersionableNodes(ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes) {
    this.servletPostCheckinNewVersionableNodes = servletPostCheckinNewVersionableNodes;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostAutoCheckout(ConfigNodePropertyBoolean servletPostAutoCheckout) {
    this.servletPostAutoCheckout = servletPostAutoCheckout;
    return this;
  }

   /**
   * Get servletPostAutoCheckout
   * @return servletPostAutoCheckout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getServletPostAutoCheckout() {
    return servletPostAutoCheckout;
  }

  public void setServletPostAutoCheckout(ConfigNodePropertyBoolean servletPostAutoCheckout) {
    this.servletPostAutoCheckout = servletPostAutoCheckout;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostAutoCheckin(ConfigNodePropertyBoolean servletPostAutoCheckin) {
    this.servletPostAutoCheckin = servletPostAutoCheckin;
    return this;
  }

   /**
   * Get servletPostAutoCheckin
   * @return servletPostAutoCheckin
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getServletPostAutoCheckin() {
    return servletPostAutoCheckin;
  }

  public void setServletPostAutoCheckin(ConfigNodePropertyBoolean servletPostAutoCheckin) {
    this.servletPostAutoCheckin = servletPostAutoCheckin;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostIgnorePattern(ConfigNodePropertyString servletPostIgnorePattern) {
    this.servletPostIgnorePattern = servletPostIgnorePattern;
    return this;
  }

   /**
   * Get servletPostIgnorePattern
   * @return servletPostIgnorePattern
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getServletPostIgnorePattern() {
    return servletPostIgnorePattern;
  }

  public void setServletPostIgnorePattern(ConfigNodePropertyString servletPostIgnorePattern) {
    this.servletPostIgnorePattern = servletPostIgnorePattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServletsPostImplSlingPostServletProperties orgApacheSlingServletsPostImplSlingPostServletProperties = (OrgApacheSlingServletsPostImplSlingPostServletProperties) o;
    return Objects.equals(this.servletPostDateFormats, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostDateFormats) &&
        Objects.equals(this.servletPostNodeNameHints, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostNodeNameHints) &&
        Objects.equals(this.servletPostNodeNameMaxLength, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostNodeNameMaxLength) &&
        Objects.equals(this.servletPostCheckinNewVersionableNodes, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostCheckinNewVersionableNodes) &&
        Objects.equals(this.servletPostAutoCheckout, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostAutoCheckout) &&
        Objects.equals(this.servletPostAutoCheckin, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostAutoCheckin) &&
        Objects.equals(this.servletPostIgnorePattern, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostIgnorePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servletPostDateFormats, servletPostNodeNameHints, servletPostNodeNameMaxLength, servletPostCheckinNewVersionableNodes, servletPostAutoCheckout, servletPostAutoCheckin, servletPostIgnorePattern);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

