package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqReplicationImplTransportHttpProperties   {
  @JsonProperty("disabled.cipher.suites")
  private ConfigNodePropertyArray disabledCipherSuites = null;

  @JsonProperty("enabled.cipher.suites")
  private ConfigNodePropertyArray enabledCipherSuites = null;

  /**
   **/
  public ComDayCqReplicationImplTransportHttpProperties disabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
    return this;
  }

  
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
  public ComDayCqReplicationImplTransportHttpProperties enabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
    return this;
  }

  
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
    ComDayCqReplicationImplTransportHttpProperties comDayCqReplicationImplTransportHttpProperties = (ComDayCqReplicationImplTransportHttpProperties) o;
    return Objects.equals(disabledCipherSuites, comDayCqReplicationImplTransportHttpProperties.disabledCipherSuites) &&
        Objects.equals(enabledCipherSuites, comDayCqReplicationImplTransportHttpProperties.enabledCipherSuites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabledCipherSuites, enabledCipherSuites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplTransportHttpProperties {\n");
    
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

