package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("allow.only.system.user")
  private ConfigNodePropertyBoolean allowOnlySystemUser;

  /**
   * 
   * @return allowOnlySystemUser
   */
  public ConfigNodePropertyBoolean getAllowOnlySystemUser() {
    return allowOnlySystemUser;
  }

  public void setAllowOnlySystemUser(ConfigNodePropertyBoolean allowOnlySystemUser) {
    this.allowOnlySystemUser = allowOnlySystemUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties = (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties) o;
    return Objects.equals(this.allowOnlySystemUser, orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.allowOnlySystemUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOnlySystemUser);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
