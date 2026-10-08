package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties   {
  @JsonProperty("principalNames")
  private ConfigNodePropertyArray principalNames;

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties principalNames(ConfigNodePropertyArray principalNames) {
    this.principalNames = principalNames;
    return this;
  }

   /**
   * Get principalNames
   * @return principalNames
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPrincipalNames() {
    return principalNames;
  }

  public void setPrincipalNames(ConfigNodePropertyArray principalNames) {
    this.principalNames = principalNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties = (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties) o;
    return Objects.equals(this.principalNames, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.principalNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties {\n");
    
    sb.append("    principalNames: ").append(toIndentedString(principalNames)).append("\n");
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

