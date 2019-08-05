package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger numberOfRetriesAllowed = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray hcTags = null;
 /**
   * Get numberOfRetriesAllowed
   * @return numberOfRetriesAllowed
  **/
  @JsonProperty("number.of.retries.allowed")
  public ConfigNodePropertyInteger getNumberOfRetriesAllowed() {
    return numberOfRetriesAllowed;
  }

  public void setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
  }

  public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties numberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed) {
    this.numberOfRetriesAllowed = numberOfRetriesAllowed;
    return this;
  }

 /**
   * Get hcTags
   * @return hcTags
  **/
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties {\n");
    
    sb.append("    numberOfRetriesAllowed: ").append(toIndentedString(numberOfRetriesAllowed)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
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

