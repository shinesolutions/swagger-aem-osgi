package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString fromAddress = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString senderHost = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString maxBounceCount = null;
 /**
   * Get fromAddress
   * @return fromAddress
  **/
  @JsonProperty("from.address")
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties fromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

 /**
   * Get senderHost
   * @return senderHost
  **/
  @JsonProperty("sender.host")
  public ConfigNodePropertyString getSenderHost() {
    return senderHost;
  }

  public void setSenderHost(ConfigNodePropertyString senderHost) {
    this.senderHost = senderHost;
  }

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties senderHost(ConfigNodePropertyString senderHost) {
    this.senderHost = senderHost;
    return this;
  }

 /**
   * Get maxBounceCount
   * @return maxBounceCount
  **/
  @JsonProperty("max.bounce.count")
  public ConfigNodePropertyString getMaxBounceCount() {
    return maxBounceCount;
  }

  public void setMaxBounceCount(ConfigNodePropertyString maxBounceCount) {
    this.maxBounceCount = maxBounceCount;
  }

  public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties maxBounceCount(ConfigNodePropertyString maxBounceCount) {
    this.maxBounceCount = maxBounceCount;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

