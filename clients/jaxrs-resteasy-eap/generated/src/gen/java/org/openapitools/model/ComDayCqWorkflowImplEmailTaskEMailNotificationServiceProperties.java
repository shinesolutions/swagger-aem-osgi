package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties   {
  

  private ConfigNodePropertyBoolean notifyOnupdate = null;

  private ConfigNodePropertyBoolean notifyOncomplete = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notify.onupdate")
  public ConfigNodePropertyBoolean getNotifyOnupdate() {
    return notifyOnupdate;
  }
  public void setNotifyOnupdate(ConfigNodePropertyBoolean notifyOnupdate) {
    this.notifyOnupdate = notifyOnupdate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

