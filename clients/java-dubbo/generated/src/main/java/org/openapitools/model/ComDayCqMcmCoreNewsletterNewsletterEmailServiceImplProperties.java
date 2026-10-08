package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("from.address")
  private ConfigNodePropertyString fromAddress;

  @JsonProperty("sender.host")
  private ConfigNodePropertyString senderHost;

  @JsonProperty("max.bounce.count")
  private ConfigNodePropertyString maxBounceCount;

  /**
   * 
   * @return fromAddress
   */
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  /**
   * 
   * @return senderHost
   */
  public ConfigNodePropertyString getSenderHost() {
    return senderHost;
  }

  public void setSenderHost(ConfigNodePropertyString senderHost) {
    this.senderHost = senderHost;
  }

  /**
   * 
   * @return maxBounceCount
   */
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
    return Objects.equals(this.fromAddress, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.fromAddress) &&
        Objects.equals(this.senderHost, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.senderHost) &&
        Objects.equals(this.maxBounceCount, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.maxBounceCount);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
