package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger maxRetry;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray fieldWhitelist;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray attachmentTypeBlacklist;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties = (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties) o;
    return Objects.equals(this.maxRetry, comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.maxRetry) &&
        Objects.equals(this.fieldWhitelist, comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.fieldWhitelist) &&
        Objects.equals(this.attachmentTypeBlacklist, comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.attachmentTypeBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRetry, fieldWhitelist, attachmentTypeBlacklist);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

