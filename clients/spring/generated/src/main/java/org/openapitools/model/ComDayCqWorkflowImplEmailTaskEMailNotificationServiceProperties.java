package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
 */

@JsonTypeName("comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean notifyOnupdate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean notifyOncomplete;

  public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties notifyOnupdate(@Nullable ConfigNodePropertyBoolean notifyOnupdate) {
    this.notifyOnupdate = notifyOnupdate;
    return this;
  }

  /**
   * Get notifyOnupdate
   * @return notifyOnupdate
   */
  @Valid 
  @Schema(name = "notify.onupdate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notify.onupdate")
  public @Nullable ConfigNodePropertyBoolean getNotifyOnupdate() {
    return notifyOnupdate;
  }

  @JsonProperty("notify.onupdate")
  public void setNotifyOnupdate(@Nullable ConfigNodePropertyBoolean notifyOnupdate) {
    this.notifyOnupdate = notifyOnupdate;
  }

  public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties notifyOncomplete(@Nullable ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
    return this;
  }

  /**
   * Get notifyOncomplete
   * @return notifyOncomplete
   */
  @Valid 
  @Schema(name = "notify.oncomplete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notify.oncomplete")
  public @Nullable ConfigNodePropertyBoolean getNotifyOncomplete() {
    return notifyOncomplete;
  }

  @JsonProperty("notify.oncomplete")
  public void setNotifyOncomplete(@Nullable ConfigNodePropertyBoolean notifyOncomplete) {
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
    return Objects.equals(this.notifyOnupdate, comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.notifyOnupdate) &&
        Objects.equals(this.notifyOncomplete, comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.notifyOncomplete);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

