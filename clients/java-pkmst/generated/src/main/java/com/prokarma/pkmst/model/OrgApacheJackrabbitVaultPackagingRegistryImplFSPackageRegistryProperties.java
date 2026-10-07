package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties   {
  @JsonProperty("homePath")
  private ConfigNodePropertyString homePath;

  public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties homePath(ConfigNodePropertyString homePath) {
    this.homePath = homePath;
    return this;
  }

  /**
   * Get homePath
   * @return homePath
   */
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.homePath, orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.homePath);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

