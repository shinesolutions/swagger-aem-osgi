package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteRestImplServletDefaultGETServletProperties   {
  
  private ConfigNodePropertyInteger defaultLimit = null;
  private ConfigNodePropertyBoolean useAbsoluteUri = null;

  public ComAdobeGraniteRestImplServletDefaultGETServletProperties () {

  }

  public ComAdobeGraniteRestImplServletDefaultGETServletProperties (ConfigNodePropertyInteger defaultLimit, ConfigNodePropertyBoolean useAbsoluteUri) {
    this.defaultLimit = defaultLimit;
    this.useAbsoluteUri = useAbsoluteUri;
  }

    
  @JsonProperty("default.limit")
  public ConfigNodePropertyInteger getDefaultLimit() {
    return defaultLimit;
  }
  public void setDefaultLimit(ConfigNodePropertyInteger defaultLimit) {
    this.defaultLimit = defaultLimit;
  }

    
  @JsonProperty("use.absolute.uri")
  public ConfigNodePropertyBoolean getUseAbsoluteUri() {
    return useAbsoluteUri;
  }
  public void setUseAbsoluteUri(ConfigNodePropertyBoolean useAbsoluteUri) {
    this.useAbsoluteUri = useAbsoluteUri;
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
    return Objects.equals(defaultLimit, comAdobeGraniteRestImplServletDefaultGETServletProperties.defaultLimit) &&
        Objects.equals(useAbsoluteUri, comAdobeGraniteRestImplServletDefaultGETServletProperties.useAbsoluteUri);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
