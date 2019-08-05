package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties   {
  
  private @Valid ConfigNodePropertyString name = null;
  private @Valid ConfigNodePropertyString description = null;
  private @Valid ConfigNodePropertyBoolean enabled = null;

  /**
   **/
  public OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties name(ConfigNodePropertyString name) {
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
  public OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties description(ConfigNodePropertyString description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public ConfigNodePropertyString getDescription() {
    return description;
  }
  public void setDescription(ConfigNodePropertyString description) {
    this.description = description;
  }

  /**
   **/
  public OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties orgApacheSlingFeatureflagsImplConfiguredFeatureProperties = (OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties) o;
    return Objects.equals(name, orgApacheSlingFeatureflagsImplConfiguredFeatureProperties.name) &&
        Objects.equals(description, orgApacheSlingFeatureflagsImplConfiguredFeatureProperties.description) &&
        Objects.equals(enabled, orgApacheSlingFeatureflagsImplConfiguredFeatureProperties.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

