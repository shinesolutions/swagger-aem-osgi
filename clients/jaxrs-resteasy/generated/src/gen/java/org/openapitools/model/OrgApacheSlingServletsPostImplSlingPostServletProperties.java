package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingServletsPostImplSlingPostServletProperties   {
  
  private ConfigNodePropertyArray servletPostDateFormats;
  private ConfigNodePropertyArray servletPostNodeNameHints;
  private ConfigNodePropertyInteger servletPostNodeNameMaxLength;
  private ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes;
  private ConfigNodePropertyBoolean servletPostAutoCheckout;
  private ConfigNodePropertyBoolean servletPostAutoCheckin;
  private ConfigNodePropertyString servletPostIgnorePattern;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servlet.post.dateFormats")
  @Valid
  public ConfigNodePropertyArray getServletPostDateFormats() {
    return servletPostDateFormats;
  }
  public void setServletPostDateFormats(ConfigNodePropertyArray servletPostDateFormats) {
    this.servletPostDateFormats = servletPostDateFormats;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servlet.post.nodeNameHints")
  @Valid
  public ConfigNodePropertyArray getServletPostNodeNameHints() {
    return servletPostNodeNameHints;
  }
  public void setServletPostNodeNameHints(ConfigNodePropertyArray servletPostNodeNameHints) {
    this.servletPostNodeNameHints = servletPostNodeNameHints;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servlet.post.nodeNameMaxLength")
  @Valid
  public ConfigNodePropertyInteger getServletPostNodeNameMaxLength() {
    return servletPostNodeNameMaxLength;
  }
  public void setServletPostNodeNameMaxLength(ConfigNodePropertyInteger servletPostNodeNameMaxLength) {
    this.servletPostNodeNameMaxLength = servletPostNodeNameMaxLength;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servlet.post.checkinNewVersionableNodes")
  @Valid
  public ConfigNodePropertyBoolean getServletPostCheckinNewVersionableNodes() {
    return servletPostCheckinNewVersionableNodes;
  }
  public void setServletPostCheckinNewVersionableNodes(ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes) {
    this.servletPostCheckinNewVersionableNodes = servletPostCheckinNewVersionableNodes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servlet.post.autoCheckout")
  @Valid
  public ConfigNodePropertyBoolean getServletPostAutoCheckout() {
    return servletPostAutoCheckout;
  }
  public void setServletPostAutoCheckout(ConfigNodePropertyBoolean servletPostAutoCheckout) {
    this.servletPostAutoCheckout = servletPostAutoCheckout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servlet.post.autoCheckin")
  @Valid
  public ConfigNodePropertyBoolean getServletPostAutoCheckin() {
    return servletPostAutoCheckin;
  }
  public void setServletPostAutoCheckin(ConfigNodePropertyBoolean servletPostAutoCheckin) {
    this.servletPostAutoCheckin = servletPostAutoCheckin;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("servlet.post.ignorePattern")
  @Valid
  public ConfigNodePropertyString getServletPostIgnorePattern() {
    return servletPostIgnorePattern;
  }
  public void setServletPostIgnorePattern(ConfigNodePropertyString servletPostIgnorePattern) {
    this.servletPostIgnorePattern = servletPostIgnorePattern;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

