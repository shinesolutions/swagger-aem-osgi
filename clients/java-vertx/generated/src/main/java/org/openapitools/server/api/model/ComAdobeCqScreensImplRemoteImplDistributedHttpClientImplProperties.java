package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties   {
  
  private ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout = null;

  public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties () {

  }

  public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties (ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout) {
    this.comAdobeAemScreensImplRemoteRequestTimeout = comAdobeAemScreensImplRemoteRequestTimeout;
  }

    
  @JsonProperty("com.adobe.aem.screens.impl.remote.request_timeout")
  public ConfigNodePropertyInteger getComAdobeAemScreensImplRemoteRequestTimeout() {
    return comAdobeAemScreensImplRemoteRequestTimeout;
  }
  public void setComAdobeAemScreensImplRemoteRequestTimeout(ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout) {
    this.comAdobeAemScreensImplRemoteRequestTimeout = comAdobeAemScreensImplRemoteRequestTimeout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties = (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties) o;
    return Objects.equals(comAdobeAemScreensImplRemoteRequestTimeout, comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.comAdobeAemScreensImplRemoteRequestTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeAemScreensImplRemoteRequestTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {\n");
    
    sb.append("    comAdobeAemScreensImplRemoteRequestTimeout: ").append(toIndentedString(comAdobeAemScreensImplRemoteRequestTimeout)).append("\n");
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
