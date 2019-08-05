package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties   {
  
  private @Valid ConfigNodePropertyString name = null;
  private @Valid ConfigNodePropertyString path = null;

  /**
   **/
  public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
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
  public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties orgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties = (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.name) &&
        Objects.equals(path, orgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

