package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties
 */

@JsonTypeName("orgApacheJackrabbitVaultPackagingImplPackagingImplProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties {

  private ConfigNodePropertyArray packageRoots;

  public OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties packageRoots(ConfigNodePropertyArray packageRoots) {
    this.packageRoots = packageRoots;
    return this;
  }

  /**
   * Get packageRoots
   * @return packageRoots
   */
  @Valid 
  @Schema(name = "packageRoots", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageRoots")
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

