package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties   {
  @JsonProperty("fieldWhitelist")
  private ConfigNodePropertyArray fieldWhitelist = null;

  @JsonProperty("attachmentTypeBlacklist")
  private ConfigNodePropertyArray attachmentTypeBlacklist = null;

  public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

   /**
   * Get fieldWhitelist
   * @return fieldWhitelist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }

  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

  public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties attachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    return this;
  }

   /**
   * Get attachmentTypeBlacklist
   * @return attachmentTypeBlacklist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }

  public void setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties = (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties) o;
    return Objects.equals(this.fieldWhitelist, comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.fieldWhitelist) &&
        Objects.equals(this.attachmentTypeBlacklist, comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties.attachmentTypeBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldWhitelist, attachmentTypeBlacklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties {\n");
    
    sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
    sb.append("    attachmentTypeBlacklist: ").append(toIndentedString(attachmentTypeBlacklist)).append("\n");
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

