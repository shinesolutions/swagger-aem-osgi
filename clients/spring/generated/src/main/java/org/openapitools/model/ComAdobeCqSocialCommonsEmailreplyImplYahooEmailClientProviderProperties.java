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
 * ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties   {
  @JsonProperty("priorityOrder")
  private ConfigNodePropertyInteger priorityOrder = null;

  @JsonProperty("replyEmailPatterns")
  private ConfigNodePropertyArray replyEmailPatterns = null;

  public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties priorityOrder(ConfigNodePropertyInteger priorityOrder) {
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

  public ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties replyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties = (ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties) o;
    return Objects.equals(this.priorityOrder, comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.priorityOrder) &&
        Objects.equals(this.replyEmailPatterns, comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.replyEmailPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityOrder, replyEmailPatterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties {\n");
    
    sb.append("    priorityOrder: ").append(toIndentedString(priorityOrder)).append("\n");
    sb.append("    replyEmailPatterns: ").append(toIndentedString(replyEmailPatterns)).append("\n");
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

