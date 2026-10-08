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
 * OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties   {
  @JsonProperty("packageRoots")
  @Valid

  private ConfigNodePropertyArray packageRoots;

  public OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties packageRoots(ConfigNodePropertyArray packageRoots) {
    this.packageRoots = packageRoots;
    return this;
  }

   /**
   * Get packageRoots
   * @return packageRoots
  **/
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
    return Objects.equals(packageRoots, orgApacheJackrabbitVaultPackagingImplPackagingImplProperties.packageRoots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageRoots);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

