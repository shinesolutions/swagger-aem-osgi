package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties   {
  @JsonProperty("MaxRetry")
  private ConfigNodePropertyInteger maxRetry = null;

  @JsonProperty("fieldWhitelist")
  private ConfigNodePropertyArray fieldWhitelist = null;

  @JsonProperty("attachmentTypeBlacklist")
  private ConfigNodePropertyArray attachmentTypeBlacklist = null;

  public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties maxRetry(ConfigNodePropertyInteger maxRetry) {
    this.maxRetry = maxRetry;
    return this;
  }

  /**
   * Get maxRetry
   * @return maxRetry
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getMaxRetry() {
    return maxRetry;
  }

  public void setMaxRetry(ConfigNodePropertyInteger maxRetry) {
    this.maxRetry = maxRetry;
  }

  public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

  /**
   * Get fieldWhitelist
   * @return fieldWhitelist
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }

  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

  public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties attachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    return this;
  }

  /**
   * Get attachmentTypeBlacklist
   * @return attachmentTypeBlacklist
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

