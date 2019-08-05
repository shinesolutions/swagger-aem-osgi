package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties   {
  @JsonProperty("allow.only.system.user")
  private ConfigNodePropertyBoolean allowOnlySystemUser = null;

  public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties allowOnlySystemUser(ConfigNodePropertyBoolean allowOnlySystemUser) {
    this.allowOnlySystemUser = allowOnlySystemUser;
    return this;
  }

   /**
   * Get allowOnlySystemUser
   * @return allowOnlySystemUser
  **/
  @Valid
  public ConfigNodePropertyBoolean getAllowOnlySystemUser() {
    return allowOnlySystemUser;
  }

  public void setAllowOnlySystemUser(ConfigNodePropertyBoolean allowOnlySystemUser) {
    this.allowOnlySystemUser = allowOnlySystemUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties = (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties) o;
    return Objects.equals(allowOnlySystemUser, orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.allowOnlySystemUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOnlySystemUser);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties {\n");
    
    sb.append("    allowOnlySystemUser: ").append(toIndentedString(allowOnlySystemUser)).append("\n");
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

