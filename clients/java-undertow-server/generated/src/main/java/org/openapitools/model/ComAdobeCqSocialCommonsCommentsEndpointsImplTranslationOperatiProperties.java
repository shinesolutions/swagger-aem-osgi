package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties   {
  
  private ConfigNodePropertyArray fieldWhitelist = null;
  private ConfigNodePropertyArray attachmentTypeBlacklist = null;

  /**
   **/
  public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }
  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties attachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("attachmentTypeBlacklist")
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
    ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties = (ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties) o;
    return Objects.equals(fieldWhitelist, comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.fieldWhitelist) &&
        Objects.equals(attachmentTypeBlacklist, comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.attachmentTypeBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldWhitelist, attachmentTypeBlacklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties {\n");
    
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

