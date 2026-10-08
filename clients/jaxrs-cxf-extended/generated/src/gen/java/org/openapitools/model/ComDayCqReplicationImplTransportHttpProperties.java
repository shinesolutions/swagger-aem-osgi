package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqReplicationImplTransportHttpProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray disabledCipherSuites;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray enabledCipherSuites;
 /**
  * Get disabledCipherSuites
  * @return disabledCipherSuites
  */
  @JsonProperty("disabled.cipher.suites")
  public ConfigNodePropertyArray getDisabledCipherSuites() {
    return disabledCipherSuites;
  }

  /**
   * Sets the <code>disabledCipherSuites</code> property.
   */
 public void setDisabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
  }

  /**
   * Sets the <code>disabledCipherSuites</code> property.
   */
  public ComDayCqReplicationImplTransportHttpProperties disabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
    return this;
  }

 /**
  * Get enabledCipherSuites
  * @return enabledCipherSuites
  */
  @JsonProperty("enabled.cipher.suites")
  public ConfigNodePropertyArray getEnabledCipherSuites() {
    return enabledCipherSuites;
  }

  /**
   * Sets the <code>enabledCipherSuites</code> property.
   */
 public void setEnabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
  }

  /**
   * Sets the <code>enabledCipherSuites</code> property.
   */
  public ComDayCqReplicationImplTransportHttpProperties enabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
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
    ComDayCqReplicationImplTransportHttpProperties comDayCqReplicationImplTransportHttpProperties = (ComDayCqReplicationImplTransportHttpProperties) o;
    return Objects.equals(this.disabledCipherSuites, comDayCqReplicationImplTransportHttpProperties.disabledCipherSuites) &&
        Objects.equals(this.enabledCipherSuites, comDayCqReplicationImplTransportHttpProperties.enabledCipherSuites);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

