package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingFeatureflagsFeatureProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingFeatureflagsFeatureProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name;

  @JsonProperty("description")
  private ConfigNodePropertyString description;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled;

  public OrgApacheSlingFeatureflagsFeatureProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingFeatureflagsFeatureProperties description(ConfigNodePropertyString description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDescription() {
    return description;
  }

  public void setDescription(ConfigNodePropertyString description) {
    this.description = description;
  }

  public OrgApacheSlingFeatureflagsFeatureProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingFeatureflagsFeatureProperties orgApacheSlingFeatureflagsFeatureProperties = (OrgApacheSlingFeatureflagsFeatureProperties) o;
    return Objects.equals(this.name, orgApacheSlingFeatureflagsFeatureProperties.name) &&
        Objects.equals(this.description, orgApacheSlingFeatureflagsFeatureProperties.description) &&
        Objects.equals(this.enabled, orgApacheSlingFeatureflagsFeatureProperties.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingFeatureflagsFeatureProperties {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

