package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray inboxImplTypeproviderLegacypaths;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask;
 /**
  * Get inboxImplTypeproviderRegistrypaths
  * @return inboxImplTypeproviderRegistrypaths
  */
  @JsonProperty("inbox.impl.typeprovider.registrypaths")
  public ConfigNodePropertyArray getInboxImplTypeproviderRegistrypaths() {
    return inboxImplTypeproviderRegistrypaths;
  }

  /**
   * Sets the <code>inboxImplTypeproviderRegistrypaths</code> property.
   */
 public void setInboxImplTypeproviderRegistrypaths(ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths) {
    this.inboxImplTypeproviderRegistrypaths = inboxImplTypeproviderRegistrypaths;
  }

  /**
   * Sets the <code>inboxImplTypeproviderRegistrypaths</code> property.
   */
  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties inboxImplTypeproviderRegistrypaths(ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths) {
    this.inboxImplTypeproviderRegistrypaths = inboxImplTypeproviderRegistrypaths;
    return this;
  }

 /**
  * Get inboxImplTypeproviderLegacypaths
  * @return inboxImplTypeproviderLegacypaths
  */
  @JsonProperty("inbox.impl.typeprovider.legacypaths")
  public ConfigNodePropertyArray getInboxImplTypeproviderLegacypaths() {
    return inboxImplTypeproviderLegacypaths;
  }

  /**
   * Sets the <code>inboxImplTypeproviderLegacypaths</code> property.
   */
 public void setInboxImplTypeproviderLegacypaths(ConfigNodePropertyArray inboxImplTypeproviderLegacypaths) {
    this.inboxImplTypeproviderLegacypaths = inboxImplTypeproviderLegacypaths;
  }

  /**
   * Sets the <code>inboxImplTypeproviderLegacypaths</code> property.
   */
  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties inboxImplTypeproviderLegacypaths(ConfigNodePropertyArray inboxImplTypeproviderLegacypaths) {
    this.inboxImplTypeproviderLegacypaths = inboxImplTypeproviderLegacypaths;
    return this;
  }

 /**
  * Get inboxImplTypeproviderDefaulturlFailureitem
  * @return inboxImplTypeproviderDefaulturlFailureitem
  */
  @JsonProperty("inbox.impl.typeprovider.defaulturl.failureitem")
  public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlFailureitem() {
    return inboxImplTypeproviderDefaulturlFailureitem;
  }

  /**
   * Sets the <code>inboxImplTypeproviderDefaulturlFailureitem</code> property.
   */
 public void setInboxImplTypeproviderDefaulturlFailureitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem) {
    this.inboxImplTypeproviderDefaulturlFailureitem = inboxImplTypeproviderDefaulturlFailureitem;
  }

  /**
   * Sets the <code>inboxImplTypeproviderDefaulturlFailureitem</code> property.
   */
  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties inboxImplTypeproviderDefaulturlFailureitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem) {
    this.inboxImplTypeproviderDefaulturlFailureitem = inboxImplTypeproviderDefaulturlFailureitem;
    return this;
  }

 /**
  * Get inboxImplTypeproviderDefaulturlWorkitem
  * @return inboxImplTypeproviderDefaulturlWorkitem
  */
  @JsonProperty("inbox.impl.typeprovider.defaulturl.workitem")
  public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlWorkitem() {
    return inboxImplTypeproviderDefaulturlWorkitem;
  }

  /**
   * Sets the <code>inboxImplTypeproviderDefaulturlWorkitem</code> property.
   */
 public void setInboxImplTypeproviderDefaulturlWorkitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem) {
    this.inboxImplTypeproviderDefaulturlWorkitem = inboxImplTypeproviderDefaulturlWorkitem;
  }

  /**
   * Sets the <code>inboxImplTypeproviderDefaulturlWorkitem</code> property.
   */
  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties inboxImplTypeproviderDefaulturlWorkitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem) {
    this.inboxImplTypeproviderDefaulturlWorkitem = inboxImplTypeproviderDefaulturlWorkitem;
    return this;
  }

 /**
  * Get inboxImplTypeproviderDefaulturlTask
  * @return inboxImplTypeproviderDefaulturlTask
  */
  @JsonProperty("inbox.impl.typeprovider.defaulturl.task")
  public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlTask() {
    return inboxImplTypeproviderDefaulturlTask;
  }

  /**
   * Sets the <code>inboxImplTypeproviderDefaulturlTask</code> property.
   */
 public void setInboxImplTypeproviderDefaulturlTask(ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask) {
    this.inboxImplTypeproviderDefaulturlTask = inboxImplTypeproviderDefaulturlTask;
  }

  /**
   * Sets the <code>inboxImplTypeproviderDefaulturlTask</code> property.
   */
  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties inboxImplTypeproviderDefaulturlTask(ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask) {
    this.inboxImplTypeproviderDefaulturlTask = inboxImplTypeproviderDefaulturlTask;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties comAdobeCqInboxImplTypeproviderItemTypeProviderProperties = (ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties) o;
    return Objects.equals(this.inboxImplTypeproviderRegistrypaths, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.inboxImplTypeproviderRegistrypaths) &&
        Objects.equals(this.inboxImplTypeproviderLegacypaths, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.inboxImplTypeproviderLegacypaths) &&
        Objects.equals(this.inboxImplTypeproviderDefaulturlFailureitem, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.inboxImplTypeproviderDefaulturlFailureitem) &&
        Objects.equals(this.inboxImplTypeproviderDefaulturlWorkitem, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.inboxImplTypeproviderDefaulturlWorkitem) &&
        Objects.equals(this.inboxImplTypeproviderDefaulturlTask, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.inboxImplTypeproviderDefaulturlTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboxImplTypeproviderRegistrypaths, inboxImplTypeproviderLegacypaths, inboxImplTypeproviderDefaulturlFailureitem, inboxImplTypeproviderDefaulturlWorkitem, inboxImplTypeproviderDefaulturlTask);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

