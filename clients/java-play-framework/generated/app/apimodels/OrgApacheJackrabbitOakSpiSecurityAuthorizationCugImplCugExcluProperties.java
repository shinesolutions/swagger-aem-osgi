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
 * OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties   {
  @JsonProperty("principalNames")
  @Valid

  private ConfigNodePropertyArray principalNames;

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties principalNames(ConfigNodePropertyArray principalNames) {
    this.principalNames = principalNames;
    return this;
  }

   /**
   * Get principalNames
   * @return principalNames
  **/
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
    return Objects.equals(principalNames, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.principalNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalNames);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

