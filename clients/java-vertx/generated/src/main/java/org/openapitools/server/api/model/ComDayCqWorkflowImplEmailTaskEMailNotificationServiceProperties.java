package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties   {
  
  private ConfigNodePropertyBoolean notifyOnupdate = null;
  private ConfigNodePropertyBoolean notifyOncomplete = null;

  public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties () {

  }

  public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties (ConfigNodePropertyBoolean notifyOnupdate, ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOnupdate = notifyOnupdate;
    this.notifyOncomplete = notifyOncomplete;
  }

    
  @JsonProperty("notify.onupdate")
  public ConfigNodePropertyBoolean getNotifyOnupdate() {
    return notifyOnupdate;
  }
  public void setNotifyOnupdate(ConfigNodePropertyBoolean notifyOnupdate) {
    this.notifyOnupdate = notifyOnupdate;
  }

    
  @JsonProperty("notify.oncomplete")
  public ConfigNodePropertyBoolean getNotifyOncomplete() {
    return notifyOncomplete;
  }
  public void setNotifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties = (ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties) o;
    return Objects.equals(notifyOnupdate, comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.notifyOnupdate) &&
        Objects.equals(notifyOncomplete, comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.notifyOncomplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyOnupdate, notifyOncomplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties {\n");
    
    sb.append("    notifyOnupdate: ").append(toIndentedString(notifyOnupdate)).append("\n");
    sb.append("    notifyOncomplete: ").append(toIndentedString(notifyOncomplete)).append("\n");
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
