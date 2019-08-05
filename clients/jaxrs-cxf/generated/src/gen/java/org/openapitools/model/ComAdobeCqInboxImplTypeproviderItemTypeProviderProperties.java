package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray inboxImplTypeproviderLegacypaths = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask = null;
 /**
   * Get inboxImplTypeproviderRegistrypaths
   * @return inboxImplTypeproviderRegistrypaths
  **/
  @JsonProperty("inbox.impl.typeprovider.registrypaths")
  public ConfigNodePropertyArray getInboxImplTypeproviderRegistrypaths() {
    return inboxImplTypeproviderRegistrypaths;
  }

  public void setInboxImplTypeproviderRegistrypaths(ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths) {
    this.inboxImplTypeproviderRegistrypaths = inboxImplTypeproviderRegistrypaths;
  }

  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties inboxImplTypeproviderRegistrypaths(ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths) {
    this.inboxImplTypeproviderRegistrypaths = inboxImplTypeproviderRegistrypaths;
    return this;
  }

 /**
   * Get inboxImplTypeproviderLegacypaths
   * @return inboxImplTypeproviderLegacypaths
  **/
  @JsonProperty("inbox.impl.typeprovider.legacypaths")
  public ConfigNodePropertyArray getInboxImplTypeproviderLegacypaths() {
    return inboxImplTypeproviderLegacypaths;
  }

  public void setInboxImplTypeproviderLegacypaths(ConfigNodePropertyArray inboxImplTypeproviderLegacypaths) {
    this.inboxImplTypeproviderLegacypaths = inboxImplTypeproviderLegacypaths;
  }

  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties inboxImplTypeproviderLegacypaths(ConfigNodePropertyArray inboxImplTypeproviderLegacypaths) {
    this.inboxImplTypeproviderLegacypaths = inboxImplTypeproviderLegacypaths;
    return this;
  }

 /**
   * Get inboxImplTypeproviderDefaulturlFailureitem
   * @return inboxImplTypeproviderDefaulturlFailureitem
  **/
  @JsonProperty("inbox.impl.typeprovider.defaulturl.failureitem")
  public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlFailureitem() {
    return inboxImplTypeproviderDefaulturlFailureitem;
  }

  public void setInboxImplTypeproviderDefaulturlFailureitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem) {
    this.inboxImplTypeproviderDefaulturlFailureitem = inboxImplTypeproviderDefaulturlFailureitem;
  }

  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties inboxImplTypeproviderDefaulturlFailureitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem) {
    this.inboxImplTypeproviderDefaulturlFailureitem = inboxImplTypeproviderDefaulturlFailureitem;
    return this;
  }

 /**
   * Get inboxImplTypeproviderDefaulturlWorkitem
   * @return inboxImplTypeproviderDefaulturlWorkitem
  **/
  @JsonProperty("inbox.impl.typeprovider.defaulturl.workitem")
  public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlWorkitem() {
    return inboxImplTypeproviderDefaulturlWorkitem;
  }

  public void setInboxImplTypeproviderDefaulturlWorkitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem) {
    this.inboxImplTypeproviderDefaulturlWorkitem = inboxImplTypeproviderDefaulturlWorkitem;
  }

  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties inboxImplTypeproviderDefaulturlWorkitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem) {
    this.inboxImplTypeproviderDefaulturlWorkitem = inboxImplTypeproviderDefaulturlWorkitem;
    return this;
  }

 /**
   * Get inboxImplTypeproviderDefaulturlTask
   * @return inboxImplTypeproviderDefaulturlTask
  **/
  @JsonProperty("inbox.impl.typeprovider.defaulturl.task")
  public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlTask() {
    return inboxImplTypeproviderDefaulturlTask;
  }

  public void setInboxImplTypeproviderDefaulturlTask(ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask) {
    this.inboxImplTypeproviderDefaulturlTask = inboxImplTypeproviderDefaulturlTask;
  }

  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties inboxImplTypeproviderDefaulturlTask(ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask) {
    this.inboxImplTypeproviderDefaulturlTask = inboxImplTypeproviderDefaulturlTask;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties {\n");
    
    sb.append("    inboxImplTypeproviderRegistrypaths: ").append(toIndentedString(inboxImplTypeproviderRegistrypaths)).append("\n");
    sb.append("    inboxImplTypeproviderLegacypaths: ").append(toIndentedString(inboxImplTypeproviderLegacypaths)).append("\n");
    sb.append("    inboxImplTypeproviderDefaulturlFailureitem: ").append(toIndentedString(inboxImplTypeproviderDefaulturlFailureitem)).append("\n");
    sb.append("    inboxImplTypeproviderDefaulturlWorkitem: ").append(toIndentedString(inboxImplTypeproviderDefaulturlWorkitem)).append("\n");
    sb.append("    inboxImplTypeproviderDefaulturlTask: ").append(toIndentedString(inboxImplTypeproviderDefaulturlTask)).append("\n");
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

