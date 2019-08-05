package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties   {
  @JsonProperty("default.externalizer.domain")
  private ConfigNodePropertyString defaultExternalizerDomain = null;

  public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties defaultExternalizerDomain(ConfigNodePropertyString defaultExternalizerDomain) {
    this.defaultExternalizerDomain = defaultExternalizerDomain;
    return this;
  }

   /**
   * Get defaultExternalizerDomain
   * @return defaultExternalizerDomain
  **/
  @Valid
  public ConfigNodePropertyString getDefaultExternalizerDomain() {
    return defaultExternalizerDomain;
  }

  public void setDefaultExternalizerDomain(ConfigNodePropertyString defaultExternalizerDomain) {
    this.defaultExternalizerDomain = defaultExternalizerDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties = (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties) o;
    return Objects.equals(defaultExternalizerDomain, comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.defaultExternalizerDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultExternalizerDomain);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties {\n");
    
    sb.append("    defaultExternalizerDomain: ").append(toIndentedString(defaultExternalizerDomain)).append("\n");
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

