package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties   {
  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("configRefResourceNames")
  private ConfigNodePropertyArray configRefResourceNames = null;

  @JsonProperty("configRefPropertyNames")
  private ConfigNodePropertyArray configRefPropertyNames = null;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties configRefResourceNames(ConfigNodePropertyArray configRefResourceNames) {
    this.configRefResourceNames = configRefResourceNames;
    return this;
  }

   /**
   * Get configRefResourceNames
   * @return configRefResourceNames
  **/
  @Valid
  public ConfigNodePropertyArray getConfigRefResourceNames() {
    return configRefResourceNames;
  }

  public void setConfigRefResourceNames(ConfigNodePropertyArray configRefResourceNames) {
    this.configRefResourceNames = configRefResourceNames;
  }

  public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties configRefPropertyNames(ConfigNodePropertyArray configRefPropertyNames) {
    this.configRefPropertyNames = configRefPropertyNames;
    return this;
  }

   /**
   * Get configRefPropertyNames
   * @return configRefPropertyNames
  **/
  @Valid
  public ConfigNodePropertyArray getConfigRefPropertyNames() {
    return configRefPropertyNames;
  }

  public void setConfigRefPropertyNames(ConfigNodePropertyArray configRefPropertyNames) {
    this.configRefPropertyNames = configRefPropertyNames;
  }

  public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties = (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties) o;
    return Objects.equals(enabled, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.enabled) &&
        Objects.equals(configRefResourceNames, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.configRefResourceNames) &&
        Objects.equals(configRefPropertyNames, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.configRefPropertyNames) &&
        Objects.equals(serviceRanking, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.serviceRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, configRefResourceNames, configRefPropertyNames, serviceRanking);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    configRefResourceNames: ").append(toIndentedString(configRefResourceNames)).append("\n");
    sb.append("    configRefPropertyNames: ").append(toIndentedString(configRefPropertyNames)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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

