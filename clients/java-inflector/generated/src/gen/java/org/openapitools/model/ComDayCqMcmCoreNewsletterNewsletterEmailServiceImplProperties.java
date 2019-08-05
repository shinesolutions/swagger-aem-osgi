package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties   {
  @JsonProperty("from.address")
  private ConfigNodePropertyString fromAddress = null;

  @JsonProperty("sender.host")
  private ConfigNodePropertyString senderHost = null;

  @JsonProperty("max.bounce.count")
  private ConfigNodePropertyString maxBounceCount = null;

  /**
   **/
  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties fromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("from.address")
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  /**
   **/
  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties senderHost(ConfigNodePropertyString senderHost) {
    this.senderHost = senderHost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sender.host")
  public ConfigNodePropertyString getSenderHost() {
    return senderHost;
  }
  public void setSenderHost(ConfigNodePropertyString senderHost) {
    this.senderHost = senderHost;
  }

  /**
   **/
  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties maxBounceCount(ConfigNodePropertyString maxBounceCount) {
    this.maxBounceCount = maxBounceCount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max.bounce.count")
  public ConfigNodePropertyString getMaxBounceCount() {
    return maxBounceCount;
  }
  public void setMaxBounceCount(ConfigNodePropertyString maxBounceCount) {
    this.maxBounceCount = maxBounceCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

