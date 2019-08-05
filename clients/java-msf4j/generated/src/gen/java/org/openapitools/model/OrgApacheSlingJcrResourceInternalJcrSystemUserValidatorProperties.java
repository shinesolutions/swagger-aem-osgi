package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
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
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

