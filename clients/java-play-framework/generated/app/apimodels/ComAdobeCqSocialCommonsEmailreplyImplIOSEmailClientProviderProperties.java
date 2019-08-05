package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties   {
  @JsonProperty("priorityOrder")
  private ConfigNodePropertyInteger priorityOrder = null;

  @JsonProperty("replyEmailPatterns")
  private ConfigNodePropertyArray replyEmailPatterns = null;

  public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties priorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
    return this;
  }

   /**
   * Get priorityOrder
   * @return priorityOrder
  **/
  @Valid
  public ConfigNodePropertyInteger getPriorityOrder() {
    return priorityOrder;
  }

  public void setPriorityOrder(ConfigNodePropertyInteger priorityOrder) {
    this.priorityOrder = priorityOrder;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties replyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns) {
    this.replyEmailPatterns = replyEmailPatterns;
    return this;
  }

   /**
   * Get replyEmailPatterns
   * @return replyEmailPatterns
  **/
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
    ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties = (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties) o;
    return Objects.equals(priorityOrder, comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.priorityOrder) &&
        Objects.equals(replyEmailPatterns, comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties.replyEmailPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityOrder, replyEmailPatterns);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties {\n");
    
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

