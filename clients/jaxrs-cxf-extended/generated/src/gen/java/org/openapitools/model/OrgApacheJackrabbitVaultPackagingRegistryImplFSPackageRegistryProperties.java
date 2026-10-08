package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString homePath;
 /**
  * Get homePath
  * @return homePath
  */
  @JsonProperty("homePath")
  public ConfigNodePropertyString getHomePath() {
    return homePath;
  }

  /**
   * Sets the <code>homePath</code> property.
   */
 public void setHomePath(ConfigNodePropertyString homePath) {
    this.homePath = homePath;
  }

  /**
   * Sets the <code>homePath</code> property.
   */
  public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties homePath(ConfigNodePropertyString homePath) {
    this.homePath = homePath;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

