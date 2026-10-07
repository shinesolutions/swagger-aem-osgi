package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger numUserLimit;
 /**
   * Get numUserLimit
   * @return numUserLimit
  **/
  @JsonProperty("numUserLimit")
  public ConfigNodePropertyInteger getNumUserLimit() {
    return numUserLimit;
  }

  public void setNumUserLimit(ConfigNodePropertyInteger numUserLimit) {
    this.numUserLimit = numUserLimit;
  }

  public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties numUserLimit(ConfigNodePropertyInteger numUserLimit) {
    this.numUserLimit = numUserLimit;
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
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties = (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties) o;
    return Objects.equals(this.numUserLimit, comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.numUserLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numUserLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties {\n");
    
    sb.append("    numUserLimit: ").append(toIndentedString(numUserLimit)).append("\n");
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

