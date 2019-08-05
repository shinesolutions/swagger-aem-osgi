package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties   {
  
  private ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths = null;
  private ConfigNodePropertyArray inboxImplTypeproviderLegacypaths = null;
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem = null;
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem = null;
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask = null;

  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties () {

  }

  public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties (ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths, ConfigNodePropertyArray inboxImplTypeproviderLegacypaths, ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem, ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem, ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask) {
    this.inboxImplTypeproviderRegistrypaths = inboxImplTypeproviderRegistrypaths;
    this.inboxImplTypeproviderLegacypaths = inboxImplTypeproviderLegacypaths;
    this.inboxImplTypeproviderDefaulturlFailureitem = inboxImplTypeproviderDefaulturlFailureitem;
    this.inboxImplTypeproviderDefaulturlWorkitem = inboxImplTypeproviderDefaulturlWorkitem;
    this.inboxImplTypeproviderDefaulturlTask = inboxImplTypeproviderDefaulturlTask;
  }

    
  @JsonProperty("inbox.impl.typeprovider.registrypaths")
  public ConfigNodePropertyArray getInboxImplTypeproviderRegistrypaths() {
    return inboxImplTypeproviderRegistrypaths;
  }
  public void setInboxImplTypeproviderRegistrypaths(ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths) {
    this.inboxImplTypeproviderRegistrypaths = inboxImplTypeproviderRegistrypaths;
  }

    
  @JsonProperty("inbox.impl.typeprovider.legacypaths")
  public ConfigNodePropertyArray getInboxImplTypeproviderLegacypaths() {
    return inboxImplTypeproviderLegacypaths;
  }
  public void setInboxImplTypeproviderLegacypaths(ConfigNodePropertyArray inboxImplTypeproviderLegacypaths) {
    this.inboxImplTypeproviderLegacypaths = inboxImplTypeproviderLegacypaths;
  }

    
  @JsonProperty("inbox.impl.typeprovider.defaulturl.failureitem")
  public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlFailureitem() {
    return inboxImplTypeproviderDefaulturlFailureitem;
  }
  public void setInboxImplTypeproviderDefaulturlFailureitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem) {
    this.inboxImplTypeproviderDefaulturlFailureitem = inboxImplTypeproviderDefaulturlFailureitem;
  }

    
  @JsonProperty("inbox.impl.typeprovider.defaulturl.workitem")
  public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlWorkitem() {
    return inboxImplTypeproviderDefaulturlWorkitem;
  }
  public void setInboxImplTypeproviderDefaulturlWorkitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem) {
    this.inboxImplTypeproviderDefaulturlWorkitem = inboxImplTypeproviderDefaulturlWorkitem;
  }

    
  @JsonProperty("inbox.impl.typeprovider.defaulturl.task")
  public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlTask() {
    return inboxImplTypeproviderDefaulturlTask;
  }
  public void setInboxImplTypeproviderDefaulturlTask(ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask) {
    this.inboxImplTypeproviderDefaulturlTask = inboxImplTypeproviderDefaulturlTask;
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
    return Objects.equals(inboxImplTypeproviderRegistrypaths, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.inboxImplTypeproviderRegistrypaths) &&
        Objects.equals(inboxImplTypeproviderLegacypaths, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.inboxImplTypeproviderLegacypaths) &&
        Objects.equals(inboxImplTypeproviderDefaulturlFailureitem, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.inboxImplTypeproviderDefaulturlFailureitem) &&
        Objects.equals(inboxImplTypeproviderDefaulturlWorkitem, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.inboxImplTypeproviderDefaulturlWorkitem) &&
        Objects.equals(inboxImplTypeproviderDefaulturlTask, comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.inboxImplTypeproviderDefaulturlTask);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
