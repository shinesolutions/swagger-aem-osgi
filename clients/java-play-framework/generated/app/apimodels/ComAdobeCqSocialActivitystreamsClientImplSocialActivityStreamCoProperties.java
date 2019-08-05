package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties   {
  @JsonProperty("priority")
  private ConfigNodePropertyInteger priority = null;

  public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Valid
  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties = (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties) o;
    return Objects.equals(priority, comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

