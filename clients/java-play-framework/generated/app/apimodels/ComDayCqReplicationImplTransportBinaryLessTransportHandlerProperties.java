package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties   {
  @JsonProperty("disabled.cipher.suites")
  private ConfigNodePropertyArray disabledCipherSuites = null;

  @JsonProperty("enabled.cipher.suites")
  private ConfigNodePropertyArray enabledCipherSuites = null;

  public ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties disabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
    return this;
  }

   /**
   * Get disabledCipherSuites
   * @return disabledCipherSuites
  **/
  @Valid
  public ConfigNodePropertyArray getDisabledCipherSuites() {
    return disabledCipherSuites;
  }

  public void setDisabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
  }

  public ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties enabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
    return this;
  }

   /**
   * Get enabledCipherSuites
   * @return enabledCipherSuites
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

