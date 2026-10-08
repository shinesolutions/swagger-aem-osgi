package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray replyEmailPatterns;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger priorityOrder;
 /**
  * Get replyEmailPatterns
  * @return replyEmailPatterns
  */
  @JsonProperty("replyEmailPatterns")
  public ConfigNodePropertyArray getReplyEmailPatterns() {
    return replyEmailPatterns;
  }

  /**
   * Sets the <code>replyEmailPatterns</code> property.
   */
 public void setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
  }

  /**
   * Sets the <code>replyEmailPatterns</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties replyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
    return this;
  }

 /**
  * Get priorityOrder
  * @return priorityOrder
  */
  @JsonProperty("priorityOrder")
  public ConfigNodePropertyInteger getPriorityOrder() {
    return priorityOrder;
  }

  /**
   * Sets the <code>priorityOrder</code> property.
   */
 public void setPriorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
  }

  /**
   * Sets the <code>priorityOrder</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties priorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
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
    ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties = (ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties) o;
    return Objects.equals(this.replyEmailPatterns, comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.replyEmailPatterns) &&
        Objects.equals(this.priorityOrder, comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.priorityOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replyEmailPatterns, priorityOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties {\n");
    
    sb.append("    replyEmailPatterns: ").append(toIndentedString(replyEmailPatterns)).append("\n");
    sb.append("    priorityOrder: ").append(toIndentedString(priorityOrder)).append("\n");
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

