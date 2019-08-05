package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties   {
  
  private ConfigNodePropertyArray disabledCipherSuites = null;
  private ConfigNodePropertyArray enabledCipherSuites = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("disabled.cipher.suites")
  public ConfigNodePropertyArray getDisabledCipherSuites() {
    return disabledCipherSuites;
  }
  public void setDisabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled.cipher.suites")
  public ConfigNodePropertyArray getEnabledCipherSuites() {
    return enabledCipherSuites;
  }
  public void setEnabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties = (ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties) o;
    return Objects.equals(disabledCipherSuites, comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.disabledCipherSuites) &&
        Objects.equals(enabledCipherSuites, comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.enabledCipherSuites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabledCipherSuites, enabledCipherSuites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties {\n");
    
    sb.append("    disabledCipherSuites: ").append(toIndentedString(disabledCipherSuites)).append("\n");
    sb.append("    enabledCipherSuites: ").append(toIndentedString(enabledCipherSuites)).append("\n");
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

