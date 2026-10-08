package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties   {
  @JsonProperty("numUserLimit")
  private ConfigNodePropertyInteger numUserLimit;

  public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties numUserLimit(ConfigNodePropertyInteger numUserLimit) {
    this.numUserLimit = numUserLimit;
    return this;
  }

   /**
   * Get numUserLimit
   * @return numUserLimit
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getNumUserLimit() {
    return numUserLimit;
  }

  public void setNumUserLimit(ConfigNodePropertyInteger numUserLimit) {
    this.numUserLimit = numUserLimit;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

