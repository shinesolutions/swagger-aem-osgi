package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties   {
  @JsonProperty("com.adobe.aem.screens.impl.remote.request_timeout")
  @Valid

  private ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout;

  public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties comAdobeAemScreensImplRemoteRequestTimeout(ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout) {
    this.comAdobeAemScreensImplRemoteRequestTimeout = comAdobeAemScreensImplRemoteRequestTimeout;
    return this;
  }

   /**
   * Get comAdobeAemScreensImplRemoteRequestTimeout
   * @return comAdobeAemScreensImplRemoteRequestTimeout
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

