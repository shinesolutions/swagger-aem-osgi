package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqDamS7imagingImplIsImageServerComponentProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties   {
  @JsonProperty("TcpPort")
  private ConfigNodePropertyString tcpPort = null;

  @JsonProperty("AllowRemoteAccess")
  private ConfigNodePropertyBoolean allowRemoteAccess = null;

  @JsonProperty("MaxRenderRgnPixels")
  private ConfigNodePropertyString maxRenderRgnPixels = null;

  @JsonProperty("MaxMessageSize")
  private ConfigNodePropertyString maxMessageSize = null;

  @JsonProperty("RandomAccessUrlTimeout")
  private ConfigNodePropertyInteger randomAccessUrlTimeout = null;

  @JsonProperty("WorkerThreads")
  private ConfigNodePropertyInteger workerThreads = null;

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties tcpPort(ConfigNodePropertyString tcpPort) {
    this.tcpPort = tcpPort;
    return this;
  }

   /**
   * Get tcpPort
   * @return tcpPort
  **/
  @Valid
  public ConfigNodePropertyString getTcpPort() {
    return tcpPort;
  }

  public void setTcpPort(ConfigNodePropertyString tcpPort) {
    this.tcpPort = tcpPort;
  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties allowRemoteAccess(ConfigNodePropertyBoolean allowRemoteAccess) {
    this.allowRemoteAccess = allowRemoteAccess;
    return this;
  }

   /**
   * Get allowRemoteAccess
   * @return allowRemoteAccess
  **/
  @Valid
  public ConfigNodePropertyBoolean getAllowRemoteAccess() {
    return allowRemoteAccess;
  }

  public void setAllowRemoteAccess(ConfigNodePropertyBoolean allowRemoteAccess) {
    this.allowRemoteAccess = allowRemoteAccess;
  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties maxRenderRgnPixels(ConfigNodePropertyString maxRenderRgnPixels) {
    this.maxRenderRgnPixels = maxRenderRgnPixels;
    return this;
  }

   /**
   * Get maxRenderRgnPixels
   * @return maxRenderRgnPixels
  **/
  @Valid
  public ConfigNodePropertyString getMaxRenderRgnPixels() {
    return maxRenderRgnPixels;
  }

  public void setMaxRenderRgnPixels(ConfigNodePropertyString maxRenderRgnPixels) {
    this.maxRenderRgnPixels = maxRenderRgnPixels;
  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties maxMessageSize(ConfigNodePropertyString maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
    return this;
  }

   /**
   * Get maxMessageSize
   * @return maxMessageSize
  **/
  @Valid
  public ConfigNodePropertyString getMaxMessageSize() {
    return maxMessageSize;
  }

  public void setMaxMessageSize(ConfigNodePropertyString maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties randomAccessUrlTimeout(ConfigNodePropertyInteger randomAccessUrlTimeout) {
    this.randomAccessUrlTimeout = randomAccessUrlTimeout;
    return this;
  }

   /**
   * Get randomAccessUrlTimeout
   * @return randomAccessUrlTimeout
  **/
  @Valid
  public ConfigNodePropertyInteger getRandomAccessUrlTimeout() {
    return randomAccessUrlTimeout;
  }

  public void setRandomAccessUrlTimeout(ConfigNodePropertyInteger randomAccessUrlTimeout) {
    this.randomAccessUrlTimeout = randomAccessUrlTimeout;
  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties workerThreads(ConfigNodePropertyInteger workerThreads) {
    this.workerThreads = workerThreads;
    return this;
  }

   /**
   * Get workerThreads
   * @return workerThreads
  **/
  @Valid
  public ConfigNodePropertyInteger getWorkerThreads() {
    return workerThreads;
  }

  public void setWorkerThreads(ConfigNodePropertyInteger workerThreads) {
    this.workerThreads = workerThreads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamS7imagingImplIsImageServerComponentProperties comAdobeCqDamS7imagingImplIsImageServerComponentProperties = (ComAdobeCqDamS7imagingImplIsImageServerComponentProperties) o;
    return Objects.equals(tcpPort, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.tcpPort) &&
        Objects.equals(allowRemoteAccess, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.allowRemoteAccess) &&
        Objects.equals(maxRenderRgnPixels, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.maxRenderRgnPixels) &&
        Objects.equals(maxMessageSize, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.maxMessageSize) &&
        Objects.equals(randomAccessUrlTimeout, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.randomAccessUrlTimeout) &&
        Objects.equals(workerThreads, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.workerThreads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tcpPort, allowRemoteAccess, maxRenderRgnPixels, maxMessageSize, randomAccessUrlTimeout, workerThreads);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties {\n");
    
    sb.append("    tcpPort: ").append(toIndentedString(tcpPort)).append("\n");
    sb.append("    allowRemoteAccess: ").append(toIndentedString(allowRemoteAccess)).append("\n");
    sb.append("    maxRenderRgnPixels: ").append(toIndentedString(maxRenderRgnPixels)).append("\n");
    sb.append("    maxMessageSize: ").append(toIndentedString(maxMessageSize)).append("\n");
    sb.append("    randomAccessUrlTimeout: ").append(toIndentedString(randomAccessUrlTimeout)).append("\n");
    sb.append("    workerThreads: ").append(toIndentedString(workerThreads)).append("\n");
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

