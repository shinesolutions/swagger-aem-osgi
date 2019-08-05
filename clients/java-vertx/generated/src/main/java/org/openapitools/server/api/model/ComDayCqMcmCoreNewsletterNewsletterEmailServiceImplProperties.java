package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties   {
  
  private ConfigNodePropertyString fromAddress = null;
  private ConfigNodePropertyString senderHost = null;
  private ConfigNodePropertyString maxBounceCount = null;

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties () {

  }

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties (ConfigNodePropertyString fromAddress, ConfigNodePropertyString senderHost, ConfigNodePropertyString maxBounceCount) {
    this.fromAddress = fromAddress;
    this.senderHost = senderHost;
    this.maxBounceCount = maxBounceCount;
  }

    
  @JsonProperty("from.address")
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

    
  @JsonProperty("sender.host")
  public ConfigNodePropertyString getSenderHost() {
    return senderHost;
  }
  public void setSenderHost(ConfigNodePropertyString senderHost) {
    this.senderHost = senderHost;
  }

    
  @JsonProperty("max.bounce.count")
  public ConfigNodePropertyString getMaxBounceCount() {
    return maxBounceCount;
  }
  public void setMaxBounceCount(ConfigNodePropertyString maxBounceCount) {
    this.maxBounceCount = maxBounceCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties = (ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties) o;
    return Objects.equals(fromAddress, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.fromAddress) &&
        Objects.equals(senderHost, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.senderHost) &&
        Objects.equals(maxBounceCount, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.maxBounceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAddress, senderHost, maxBounceCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties {\n");
    
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    senderHost: ").append(toIndentedString(senderHost)).append("\n");
    sb.append("    maxBounceCount: ").append(toIndentedString(maxBounceCount)).append("\n");
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
