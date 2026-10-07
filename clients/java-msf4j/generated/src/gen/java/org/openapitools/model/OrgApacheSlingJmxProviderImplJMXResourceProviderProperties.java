package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * OrgApacheSlingJmxProviderImplJMXResourceProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJmxProviderImplJMXResourceProviderProperties   {
  @JsonProperty("provider.roots")
  private ConfigNodePropertyString providerRoots;

  public OrgApacheSlingJmxProviderImplJMXResourceProviderProperties providerRoots(ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
    return this;
  }

   /**
   * Get providerRoots
   * @return providerRoots
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getProviderRoots() {
    return providerRoots;
  }

  public void setProviderRoots(ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJmxProviderImplJMXResourceProviderProperties orgApacheSlingJmxProviderImplJMXResourceProviderProperties = (OrgApacheSlingJmxProviderImplJMXResourceProviderProperties) o;
    return Objects.equals(this.providerRoots, orgApacheSlingJmxProviderImplJMXResourceProviderProperties.providerRoots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerRoots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJmxProviderImplJMXResourceProviderProperties {\n");
    
    sb.append("    providerRoots: ").append(toIndentedString(providerRoots)).append("\n");
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

