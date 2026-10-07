package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties   {
  @JsonProperty("replyEmailPatterns")
  private ConfigNodePropertyArray replyEmailPatterns;

  @JsonProperty("priorityOrder")
  private ConfigNodePropertyInteger priorityOrder;

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties replyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("replyEmailPatterns")
  public ConfigNodePropertyArray getReplyEmailPatterns() {
    return replyEmailPatterns;
  }
  public void setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties priorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("priorityOrder")
  public ConfigNodePropertyInteger getPriorityOrder() {
    return priorityOrder;
  }
  public void setPriorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
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
    return Objects.equals(replyEmailPatterns, comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.replyEmailPatterns) &&
        Objects.equals(priorityOrder, comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.priorityOrder);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

