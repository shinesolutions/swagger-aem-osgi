package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties   {
  
  private ConfigNodePropertyString homePath = null;

  public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties () {

  }

  public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties (ConfigNodePropertyString homePath) {
    this.homePath = homePath;
  }

    
  @JsonProperty("homePath")
  public ConfigNodePropertyString getHomePath() {
    return homePath;
  }
  public void setHomePath(ConfigNodePropertyString homePath) {
    this.homePath = homePath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties = (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties) o;
    return Objects.equals(homePath, orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.homePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties {\n");
    
    sb.append("    homePath: ").append(toIndentedString(homePath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
