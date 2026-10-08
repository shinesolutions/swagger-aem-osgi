package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties   {
  @JsonProperty("from.address")
  @Valid

  private ConfigNodePropertyString fromAddress;

  @JsonProperty("sender.host")
  @Valid

  private ConfigNodePropertyString senderHost;

  @JsonProperty("max.bounce.count")
  @Valid

  private ConfigNodePropertyString maxBounceCount;

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties fromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Get fromAddress
   * @return fromAddress
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

