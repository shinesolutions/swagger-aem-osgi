package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
    return Objects.equals(providerRoot, comAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.providerRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerRoot);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

