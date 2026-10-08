package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingJmxProviderImplJMXResourceProviderProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("provider.roots")
  private ConfigNodePropertyString providerRoots;

  /**
   * 
   * @return providerRoots
   */
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
