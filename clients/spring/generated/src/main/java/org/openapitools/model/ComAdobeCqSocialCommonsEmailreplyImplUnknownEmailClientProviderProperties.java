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
 * ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties   {
  @JsonProperty("replyEmailPatterns")
  private ConfigNodePropertyArray replyEmailPatterns = null;

  @JsonProperty("priorityOrder")
  private ConfigNodePropertyInteger priorityOrder = null;

  public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties replyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
    return this;
  }

  /**
   * Get replyEmailPatterns
   * @return replyEmailPatterns
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getReplyEmailPatterns() {
    return replyEmailPatterns;
  }

  public void setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties priorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
    return this;
  }

  /**
   * Get priorityOrder
   * @return priorityOrder
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getPriorityOrder() {
    return priorityOrder;
  }

  public void setPriorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

