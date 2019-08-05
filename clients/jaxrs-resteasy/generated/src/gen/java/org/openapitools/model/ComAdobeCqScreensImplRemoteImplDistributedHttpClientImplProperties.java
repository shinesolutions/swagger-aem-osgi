package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties   {
  
  private ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.aem.screens.impl.remote.request_timeout")
  public ConfigNodePropertyInteger getComAdobeAemScreensImplRemoteRequestTimeout() {
    return comAdobeAemScreensImplRemoteRequestTimeout;
  }
  public void setComAdobeAemScreensImplRemoteRequestTimeout(ConfigNodePropertyInteger comAdobeAemScreensImplRemoteRequestTimeout) {
    this.comAdobeAemScreensImplRemoteRequestTimeout = comAdobeAemScreensImplRemoteRequestTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

