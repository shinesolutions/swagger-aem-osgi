package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqSecurityACLSetupProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqSecurityACLSetupProperties   {
  @JsonProperty("cq.aclsetup.rules")
  @Valid

  private ConfigNodePropertyArray cqAclsetupRules;

  public ComDayCqSecurityACLSetupProperties cqAclsetupRules(ConfigNodePropertyArray cqAclsetupRules) {
    this.cqAclsetupRules = cqAclsetupRules;
    return this;
  }

   /**
   * Get cqAclsetupRules
   * @return cqAclsetupRules
  **/
  public ConfigNodePropertyArray getCqAclsetupRules() {
    return cqAclsetupRules;
  }

  public void setCqAclsetupRules(ConfigNodePropertyArray cqAclsetupRules) {
    this.cqAclsetupRules = cqAclsetupRules;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

