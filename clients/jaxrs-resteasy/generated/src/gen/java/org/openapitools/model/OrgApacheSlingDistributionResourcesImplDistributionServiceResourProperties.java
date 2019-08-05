package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties   {
  
  private ConfigNodePropertyString providerRoots = null;
  private ConfigNodePropertyString kind = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.roots")
  public ConfigNodePropertyString getProviderRoots() {
    return providerRoots;
  }
  public void setProviderRoots(ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("kind")
  public ConfigNodePropertyString getKind() {
    return kind;
  }
  public void setKind(ConfigNodePropertyString kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties = (OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties) o;
    return Objects.equals(providerRoots, orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.providerRoots) &&
        Objects.equals(kind, orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerRoots, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties {\n");
    
    sb.append("    providerRoots: ").append(toIndentedString(providerRoots)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

