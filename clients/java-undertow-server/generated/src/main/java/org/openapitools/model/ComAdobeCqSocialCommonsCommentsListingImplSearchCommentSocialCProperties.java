package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties   {
  
  private ConfigNodePropertyInteger numUserLimit = null;

  /**
   **/
  public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties numUserLimit(ConfigNodePropertyInteger numUserLimit) {
    this.numUserLimit = numUserLimit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("numUserLimit")
  public ConfigNodePropertyInteger getNumUserLimit() {
    return numUserLimit;
  }
  public void setNumUserLimit(ConfigNodePropertyInteger numUserLimit) {
    this.numUserLimit = numUserLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties = (ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties) o;
    return Objects.equals(numUserLimit, comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.numUserLimit);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

