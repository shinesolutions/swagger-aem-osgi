package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteRestImplServletDefaultGETServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger defaultLimit;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean useAbsoluteUri;
 /**
  * Get defaultLimit
  * @return defaultLimit
  */
  @JsonProperty("default.limit")
  public ConfigNodePropertyInteger getDefaultLimit() {
    return defaultLimit;
  }

  /**
   * Sets the <code>defaultLimit</code> property.
   */
 public void setDefaultLimit(ConfigNodePropertyInteger defaultLimit) {
    this.defaultLimit = defaultLimit;
  }

  /**
   * Sets the <code>defaultLimit</code> property.
   */
  public ComAdobeGraniteRestImplServletDefaultGETServletProperties defaultLimit(ConfigNodePropertyInteger defaultLimit) {
    this.defaultLimit = defaultLimit;
    return this;
  }

 /**
  * Get useAbsoluteUri
  * @return useAbsoluteUri
  */
  @JsonProperty("use.absolute.uri")
  public ConfigNodePropertyBoolean getUseAbsoluteUri() {
    return useAbsoluteUri;
  }

  /**
   * Sets the <code>useAbsoluteUri</code> property.
   */
 public void setUseAbsoluteUri(ConfigNodePropertyBoolean useAbsoluteUri) {
    this.useAbsoluteUri = useAbsoluteUri;
  }

  /**
   * Sets the <code>useAbsoluteUri</code> property.
   */
  public ComAdobeGraniteRestImplServletDefaultGETServletProperties useAbsoluteUri(ConfigNodePropertyBoolean useAbsoluteUri) {
    this.useAbsoluteUri = useAbsoluteUri;
    return this;
  }


  @Override
  public boolean equals(Object o) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

