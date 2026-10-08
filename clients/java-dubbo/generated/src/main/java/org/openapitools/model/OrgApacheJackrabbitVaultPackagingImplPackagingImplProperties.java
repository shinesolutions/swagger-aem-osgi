package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("packageRoots")
  private ConfigNodePropertyArray packageRoots;

  /**
   * 
   * @return packageRoots
   */
  public ConfigNodePropertyArray getPackageRoots() {
    return packageRoots;
  }

  public void setPackageRoots(ConfigNodePropertyArray packageRoots) {
    this.packageRoots = packageRoots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties orgApacheJackrabbitVaultPackagingImplPackagingImplProperties = (OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties) o;
    return Objects.equals(this.packageRoots, orgApacheJackrabbitVaultPackagingImplPackagingImplProperties.packageRoots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageRoots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties {\n");
    
    sb.append("    packageRoots: ").append(toIndentedString(packageRoots)).append("\n");
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
