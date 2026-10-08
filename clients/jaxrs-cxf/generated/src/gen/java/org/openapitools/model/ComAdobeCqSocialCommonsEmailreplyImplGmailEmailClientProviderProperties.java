package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger priorityOrder;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray replyEmailPatterns;
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

  public ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties priorityOrder(ConfigNodePropertyInteger priorityOrder) {
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

  public ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties replyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
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
    ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties = (ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties) o;
    return Objects.equals(this.priorityOrder, comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties.priorityOrder) &&
        Objects.equals(this.replyEmailPatterns, comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties.replyEmailPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityOrder, replyEmailPatterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties {\n");
    
    sb.append("    priorityOrder: ").append(toIndentedString(priorityOrder)).append("\n");
    sb.append("    replyEmailPatterns: ").append(toIndentedString(replyEmailPatterns)).append("\n");
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

