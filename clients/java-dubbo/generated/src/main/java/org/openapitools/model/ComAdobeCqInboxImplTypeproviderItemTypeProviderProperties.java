package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("inbox.impl.typeprovider.registrypaths")
  private ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths;

  @JsonProperty("inbox.impl.typeprovider.legacypaths")
  private ConfigNodePropertyArray inboxImplTypeproviderLegacypaths;

  @JsonProperty("inbox.impl.typeprovider.defaulturl.failureitem")
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem;

  @JsonProperty("inbox.impl.typeprovider.defaulturl.workitem")
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem;

  @JsonProperty("inbox.impl.typeprovider.defaulturl.task")
  private ConfigNodePropertyString inboxImplTypeproviderDefaulturlTask;

  /**
   * 
   * @return inboxImplTypeproviderRegistrypaths
   */
  public ConfigNodePropertyArray getInboxImplTypeproviderRegistrypaths() {
    return inboxImplTypeproviderRegistrypaths;
  }

  public void setInboxImplTypeproviderRegistrypaths(ConfigNodePropertyArray inboxImplTypeproviderRegistrypaths) {
    this.inboxImplTypeproviderRegistrypaths = inboxImplTypeproviderRegistrypaths;
  }

  /**
   * 
   * @return inboxImplTypeproviderLegacypaths
   */
  public ConfigNodePropertyArray getInboxImplTypeproviderLegacypaths() {
    return inboxImplTypeproviderLegacypaths;
  }

  public void setInboxImplTypeproviderLegacypaths(ConfigNodePropertyArray inboxImplTypeproviderLegacypaths) {
    this.inboxImplTypeproviderLegacypaths = inboxImplTypeproviderLegacypaths;
  }

  /**
   * 
   * @return inboxImplTypeproviderDefaulturlFailureitem
   */
  public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlFailureitem() {
    return inboxImplTypeproviderDefaulturlFailureitem;
  }

  public void setInboxImplTypeproviderDefaulturlFailureitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlFailureitem) {
    this.inboxImplTypeproviderDefaulturlFailureitem = inboxImplTypeproviderDefaulturlFailureitem;
  }

  /**
   * 
   * @return inboxImplTypeproviderDefaulturlWorkitem
   */
  public ConfigNodePropertyString getInboxImplTypeproviderDefaulturlWorkitem() {
    return inboxImplTypeproviderDefaulturlWorkitem;
  }

  public void setInboxImplTypeproviderDefaulturlWorkitem(ConfigNodePropertyString inboxImplTypeproviderDefaulturlWorkitem) {
    this.inboxImplTypeproviderDefaulturlWorkitem = inboxImplTypeproviderDefaulturlWorkitem;
  }

  /**
   * 
   * @return inboxImplTypeproviderDefaulturlTask
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
