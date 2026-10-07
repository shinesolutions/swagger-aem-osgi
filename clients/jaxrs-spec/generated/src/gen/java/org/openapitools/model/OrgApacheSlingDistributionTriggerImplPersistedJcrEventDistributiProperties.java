package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties   {
  private ConfigNodePropertyString name;
  private ConfigNodePropertyString path;
  private ConfigNodePropertyString serviceName;
  private ConfigNodePropertyString nuggetsPath;

  public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties() {
  }

  /**
   **/
  public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  @Valid public ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  @Valid public ConfigNodePropertyString getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   **/
  public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceName")
  @Valid public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  @JsonProperty("serviceName")
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  /**
   **/
  public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties nuggetsPath(ConfigNodePropertyString nuggetsPath) {
    this.nuggetsPath = nuggetsPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nuggetsPath")
  @Valid public ConfigNodePropertyString getNuggetsPath() {
    return nuggetsPath;
  }

  @JsonProperty("nuggetsPath")
  public void setNuggetsPath(ConfigNodePropertyString nuggetsPath) {
    this.nuggetsPath = nuggetsPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties = (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.name) &&
        Objects.equals(this.path, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.path) &&
        Objects.equals(this.serviceName, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.serviceName) &&
        Objects.equals(this.nuggetsPath, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.nuggetsPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, serviceName, nuggetsPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    nuggetsPath: ").append(toIndentedString(nuggetsPath)).append("\n");
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
