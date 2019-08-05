package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean notifyOnupdate = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean notifyOncomplete = null;
 /**
   * Get notifyOnupdate
   * @return notifyOnupdate
  **/
  @JsonProperty("notify.onupdate")
  public ConfigNodePropertyBoolean getNotifyOnupdate() {
    return notifyOnupdate;
  }

  public void setNotifyOnupdate(ConfigNodePropertyBoolean notifyOnupdate) {
    this.notifyOnupdate = notifyOnupdate;
  }

  public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties notifyOnupdate(ConfigNodePropertyBoolean notifyOnupdate) {
    this.notifyOnupdate = notifyOnupdate;
    return this;
  }

 /**
   * Get notifyOncomplete
   * @return notifyOncomplete
  **/
  @JsonProperty("notify.oncomplete")
  public ConfigNodePropertyBoolean getNotifyOncomplete() {
    return notifyOncomplete;
  }

  public void setNotifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
  }

  public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties notifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

