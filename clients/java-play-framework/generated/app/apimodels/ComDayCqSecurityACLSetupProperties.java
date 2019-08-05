package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqSecurityACLSetupProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqSecurityACLSetupProperties   {
  @JsonProperty("cq.aclsetup.rules")
  private ConfigNodePropertyArray cqAclsetupRules = null;

  public ComDayCqSecurityACLSetupProperties cqAclsetupRules(ConfigNodePropertyArray cqAclsetupRules) {
    this.cqAclsetupRules = cqAclsetupRules;
    return this;
  }

   /**
   * Get cqAclsetupRules
   * @return cqAclsetupRules
  **/
  @Valid
  public ConfigNodePropertyArray getCqAclsetupRules() {
    return cqAclsetupRules;
  }

  public void setCqAclsetupRules(ConfigNodePropertyArray cqAclsetupRules) {
    this.cqAclsetupRules = cqAclsetupRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqSecurityACLSetupProperties comDayCqSecurityACLSetupProperties = (ComDayCqSecurityACLSetupProperties) o;
    return Objects.equals(cqAclsetupRules, comDayCqSecurityACLSetupProperties.cqAclsetupRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAclsetupRules);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqSecurityACLSetupProperties {\n");
    
    sb.append("    cqAclsetupRules: ").append(toIndentedString(cqAclsetupRules)).append("\n");
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

