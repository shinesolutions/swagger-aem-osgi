package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString packageBuilderTarget;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
  * Get packageBuilderTarget
  * @return packageBuilderTarget
  */
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  /**
   * Sets the <code>packageBuilderTarget</code> property.
   */
 public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  /**
   * Sets the <code>packageBuilderTarget</code> property.
   */
  public OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
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
    OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties orgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties = (OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.name) &&
        Objects.equals(this.packageBuilderTarget, orgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.packageBuilderTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, packageBuilderTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageBuilderTarget: ").append(toIndentedString(packageBuilderTarget)).append("\n");
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

