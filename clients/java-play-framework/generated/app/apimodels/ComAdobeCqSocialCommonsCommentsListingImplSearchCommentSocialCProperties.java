package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties   {
  @JsonProperty("numUserLimit")
  @Valid

  private ConfigNodePropertyInteger numUserLimit;

  public ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties numUserLimit(ConfigNodePropertyInteger numUserLimit) {
    this.numUserLimit = numUserLimit;
    return this;
  }

   /**
   * Get numUserLimit
   * @return numUserLimit
  **/
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
    return Objects.equals(numUserLimit, comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.numUserLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numUserLimit);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

