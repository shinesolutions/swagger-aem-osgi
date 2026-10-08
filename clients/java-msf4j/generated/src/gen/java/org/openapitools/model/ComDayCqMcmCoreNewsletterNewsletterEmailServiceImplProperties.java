package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties   {
  @JsonProperty("from.address")
  private ConfigNodePropertyString fromAddress;

  @JsonProperty("sender.host")
  private ConfigNodePropertyString senderHost;

  @JsonProperty("max.bounce.count")
  private ConfigNodePropertyString maxBounceCount;

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties fromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Get fromAddress
   * @return fromAddress
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties senderHost(ConfigNodePropertyString senderHost) {
    this.senderHost = senderHost;
    return this;
  }

   /**
   * Get senderHost
   * @return senderHost
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSenderHost() {
    return senderHost;
  }

  public void setSenderHost(ConfigNodePropertyString senderHost) {
    this.senderHost = senderHost;
  }

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties maxBounceCount(ConfigNodePropertyString maxBounceCount) {
    this.maxBounceCount = maxBounceCount;
    return this;
  }

   /**
   * Get maxBounceCount
   * @return maxBounceCount
  **/
  @ApiModelProperty(value = "")
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

