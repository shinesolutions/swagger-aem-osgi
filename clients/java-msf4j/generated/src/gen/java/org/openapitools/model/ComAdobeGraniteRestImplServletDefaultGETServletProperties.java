package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * ComAdobeGraniteRestImplServletDefaultGETServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeGraniteRestImplServletDefaultGETServletProperties   {
  @JsonProperty("default.limit")
  private ConfigNodePropertyInteger defaultLimit = null;

  @JsonProperty("use.absolute.uri")
  private ConfigNodePropertyBoolean useAbsoluteUri = null;

  public ComAdobeGraniteRestImplServletDefaultGETServletProperties defaultLimit(ConfigNodePropertyInteger defaultLimit) {
    this.defaultLimit = defaultLimit;
    return this;
  }

   /**
   * Get defaultLimit
   * @return defaultLimit
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getDefaultLimit() {
    return defaultLimit;
  }

  public void setDefaultLimit(ConfigNodePropertyInteger defaultLimit) {
    this.defaultLimit = defaultLimit;
  }

  public ComAdobeGraniteRestImplServletDefaultGETServletProperties useAbsoluteUri(ConfigNodePropertyBoolean useAbsoluteUri) {
    this.useAbsoluteUri = useAbsoluteUri;
    return this;
  }

   /**
   * Get useAbsoluteUri
   * @return useAbsoluteUri
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUseAbsoluteUri() {
    return useAbsoluteUri;
  }

  public void setUseAbsoluteUri(ConfigNodePropertyBoolean useAbsoluteUri) {
    this.useAbsoluteUri = useAbsoluteUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRestImplServletDefaultGETServletProperties comAdobeGraniteRestImplServletDefaultGETServletProperties = (ComAdobeGraniteRestImplServletDefaultGETServletProperties) o;
    return Objects.equals(this.defaultLimit, comAdobeGraniteRestImplServletDefaultGETServletProperties.defaultLimit) &&
        Objects.equals(this.useAbsoluteUri, comAdobeGraniteRestImplServletDefaultGETServletProperties.useAbsoluteUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLimit, useAbsoluteUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRestImplServletDefaultGETServletProperties {\n");
    
    sb.append("    defaultLimit: ").append(toIndentedString(defaultLimit)).append("\n");
    sb.append("    useAbsoluteUri: ").append(toIndentedString(useAbsoluteUri)).append("\n");
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

