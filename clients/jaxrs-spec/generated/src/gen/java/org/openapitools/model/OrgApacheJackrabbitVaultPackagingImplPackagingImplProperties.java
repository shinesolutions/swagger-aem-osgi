package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties   {
  
  private @Valid ConfigNodePropertyArray packageRoots = null;

  /**
   **/
  public OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties packageRoots(ConfigNodePropertyArray packageRoots) {
    this.packageRoots = packageRoots;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("packageRoots")
  public ConfigNodePropertyArray getPackageRoots() {
    return packageRoots;
  }
  public void setPackageRoots(ConfigNodePropertyArray packageRoots) {
    this.packageRoots = packageRoots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

