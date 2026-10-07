package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties   {
  @JsonProperty("enabled")
  @Valid

  private ConfigNodePropertyBoolean enabled;

  @JsonProperty("configPropertyInheritancePropertyNames")
  @Valid

  private ConfigNodePropertyArray configPropertyInheritancePropertyNames;

  public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties configPropertyInheritancePropertyNames(ConfigNodePropertyArray configPropertyInheritancePropertyNames) {
    this.configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
    return this;
  }

   /**
   * Get configPropertyInheritancePropertyNames
   * @return configPropertyInheritancePropertyNames
  **/
  public ConfigNodePropertyArray getConfigPropertyInheritancePropertyNames() {
    return configPropertyInheritancePropertyNames;
  }

  public void setConfigPropertyInheritancePropertyNames(ConfigNodePropertyArray configPropertyInheritancePropertyNames) {
    this.configPropertyInheritancePropertyNames = configPropertyInheritancePropertyNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties = (OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties) o;
    return Objects.equals(enabled, orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.enabled) &&
        Objects.equals(configPropertyInheritancePropertyNames, orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.configPropertyInheritancePropertyNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, configPropertyInheritancePropertyNames);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    configPropertyInheritancePropertyNames: ").append(toIndentedString(configPropertyInheritancePropertyNames)).append("\n");
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

