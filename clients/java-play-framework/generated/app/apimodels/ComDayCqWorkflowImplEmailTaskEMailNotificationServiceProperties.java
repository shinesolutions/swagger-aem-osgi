package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties   {
  @JsonProperty("notify.onupdate")
  private ConfigNodePropertyBoolean notifyOnupdate = null;

  @JsonProperty("notify.oncomplete")
  private ConfigNodePropertyBoolean notifyOncomplete = null;

  public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties notifyOnupdate(ConfigNodePropertyBoolean notifyOnupdate) {
    this.notifyOnupdate = notifyOnupdate;
    return this;
  }

   /**
   * Get notifyOnupdate
   * @return notifyOnupdate
  **/
  @Valid
  public ConfigNodePropertyBoolean getNotifyOnupdate() {
    return notifyOnupdate;
  }

  public void setNotifyOnupdate(ConfigNodePropertyBoolean notifyOnupdate) {
    this.notifyOnupdate = notifyOnupdate;
  }

  public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties notifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
    return this;
  }

   /**
   * Get notifyOncomplete
   * @return notifyOncomplete
  **/
  @Valid
  public ConfigNodePropertyBoolean getNotifyOncomplete() {
    return notifyOncomplete;
  }

  public void setNotifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

