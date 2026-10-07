package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties   {
  
  private ConfigNodePropertyArray principalNames;

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties () {

  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties (ConfigNodePropertyArray principalNames) {
    this.principalNames = principalNames;
  }

    
  @JsonProperty("principalNames")
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
