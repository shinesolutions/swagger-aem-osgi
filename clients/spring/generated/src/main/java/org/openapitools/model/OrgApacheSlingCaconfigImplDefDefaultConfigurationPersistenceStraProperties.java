package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties   {
  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  public OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties = (OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties) o;
    return Objects.equals(this.enabled, orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties {\n");
    
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

