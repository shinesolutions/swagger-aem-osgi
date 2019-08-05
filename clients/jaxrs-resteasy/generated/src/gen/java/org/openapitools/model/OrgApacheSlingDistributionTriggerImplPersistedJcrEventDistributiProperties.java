package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString path = null;
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyString nuggetsPath = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nuggetsPath")
  public ConfigNodePropertyString getNuggetsPath() {
    return nuggetsPath;
  }
  public void setNuggetsPath(ConfigNodePropertyString nuggetsPath) {
    this.nuggetsPath = nuggetsPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties = (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.name) &&
        Objects.equals(path, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.path) &&
        Objects.equals(serviceName, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.serviceName) &&
        Objects.equals(nuggetsPath, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.nuggetsPath);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

