package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties   {
  
  private ConfigNodePropertyString homePath;

  /**
   **/
  public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties homePath(ConfigNodePropertyString homePath) {
    this.homePath = homePath;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

