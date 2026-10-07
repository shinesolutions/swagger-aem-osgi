package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("com.adobe.aem.screens.impl.remote.request_timeout")
  private ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout;

  /**
   * 
   * @return comAdobeAemScreensImplRemoteRequestTimeout
   */
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
    return Objects.equals(this.comAdobeAemScreensImplRemoteRequestTimeout, comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.comAdobeAemScreensImplRemoteRequestTimeout);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
