package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties   {
  @JsonProperty("provider.root")
  private ConfigNodePropertyString providerRoot = null;

  public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties providerRoot(ConfigNodePropertyString providerRoot) {
    this.providerRoot = providerRoot;
    return this;
  }

  /**
   * Get providerRoot
   * @return providerRoot
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getProviderRoot() {
    return providerRoot;
  }

  public void setProviderRoot(ConfigNodePropertyString providerRoot) {
    this.providerRoot = providerRoot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties comAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties = (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties) o;
    return Objects.equals(this.providerRoot, comAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.providerRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerRoot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties {\n");
    
    sb.append("    providerRoot: ").append(toIndentedString(providerRoot)).append("\n");
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

