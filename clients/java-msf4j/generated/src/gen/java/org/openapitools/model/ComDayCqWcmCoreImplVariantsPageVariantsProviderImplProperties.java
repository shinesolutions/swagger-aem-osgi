package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
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
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.defaultExternalizerDomain, comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.defaultExternalizerDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultExternalizerDomain);
  }

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

