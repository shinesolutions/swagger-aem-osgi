package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheFelixEventadminImplEventAdminProperties
 */

@JsonTypeName("orgApacheFelixEventadminImplEventAdminProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixEventadminImplEventAdminProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixEventadminTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic;

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminThreadPoolSize(@Nullable ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize) {
    this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminThreadPoolSize
   * @return orgApacheFelixEventadminThreadPoolSize
   */
  @Valid 
  @Schema(name = "org.apache.felix.eventadmin.ThreadPoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.eventadmin.ThreadPoolSize")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixEventadminThreadPoolSize() {
    return orgApacheFelixEventadminThreadPoolSize;
  }

  @JsonProperty("org.apache.felix.eventadmin.ThreadPoolSize")
  public void setOrgApacheFelixEventadminThreadPoolSize(@Nullable ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize) {
    this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminAsyncToSyncThreadRatio(@Nullable ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio) {
    this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminAsyncToSyncThreadRatio
   * @return orgApacheFelixEventadminAsyncToSyncThreadRatio
   */
  @Valid 
  @Schema(name = "org.apache.felix.eventadmin.AsyncToSyncThreadRatio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.eventadmin.AsyncToSyncThreadRatio")
  public @Nullable ConfigNodePropertyFloat getOrgApacheFelixEventadminAsyncToSyncThreadRatio() {
    return orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }

  @JsonProperty("org.apache.felix.eventadmin.AsyncToSyncThreadRatio")
  public void setOrgApacheFelixEventadminAsyncToSyncThreadRatio(@Nullable ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio) {
    this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminTimeout(@Nullable ConfigNodePropertyInteger orgApacheFelixEventadminTimeout) {
    this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminTimeout
   * @return orgApacheFelixEventadminTimeout
   */
  @Valid 
  @Schema(name = "org.apache.felix.eventadmin.Timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.eventadmin.Timeout")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixEventadminTimeout() {
    return orgApacheFelixEventadminTimeout;
  }

  @JsonProperty("org.apache.felix.eventadmin.Timeout")
  public void setOrgApacheFelixEventadminTimeout(@Nullable ConfigNodePropertyInteger orgApacheFelixEventadminTimeout) {
    this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminRequireTopic(@Nullable ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic) {
    this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminRequireTopic
   * @return orgApacheFelixEventadminRequireTopic
   */
  @Valid 
  @Schema(name = "org.apache.felix.eventadmin.RequireTopic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.eventadmin.RequireTopic")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixEventadminRequireTopic() {
    return orgApacheFelixEventadminRequireTopic;
  }

  @JsonProperty("org.apache.felix.eventadmin.RequireTopic")
  public void setOrgApacheFelixEventadminRequireTopic(@Nullable ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic) {
    this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminIgnoreTimeout(@Nullable ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout) {
    this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminIgnoreTimeout
   * @return orgApacheFelixEventadminIgnoreTimeout
   */
  @Valid 
  @Schema(name = "org.apache.felix.eventadmin.IgnoreTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.eventadmin.IgnoreTimeout")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTimeout() {
    return orgApacheFelixEventadminIgnoreTimeout;
  }

  @JsonProperty("org.apache.felix.eventadmin.IgnoreTimeout")
  public void setOrgApacheFelixEventadminIgnoreTimeout(@Nullable ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout) {
    this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
  }

  public OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminIgnoreTopic(@Nullable ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic) {
    this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
    return this;
  }

  /**
   * Get orgApacheFelixEventadminIgnoreTopic
   * @return orgApacheFelixEventadminIgnoreTopic
   */
  @Valid 
  @Schema(name = "org.apache.felix.eventadmin.IgnoreTopic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.eventadmin.IgnoreTopic")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTopic() {
    return orgApacheFelixEventadminIgnoreTopic;
  }

  @JsonProperty("org.apache.felix.eventadmin.IgnoreTopic")
  public void setOrgApacheFelixEventadminIgnoreTopic(@Nullable ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic) {
    this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminImplEventAdminProperties = (OrgApacheFelixEventadminImplEventAdminProperties) o;
    return Objects.equals(this.orgApacheFelixEventadminThreadPoolSize, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminThreadPoolSize) &&
        Objects.equals(this.orgApacheFelixEventadminAsyncToSyncThreadRatio, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminAsyncToSyncThreadRatio) &&
        Objects.equals(this.orgApacheFelixEventadminTimeout, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminTimeout) &&
        Objects.equals(this.orgApacheFelixEventadminRequireTopic, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminRequireTopic) &&
        Objects.equals(this.orgApacheFelixEventadminIgnoreTimeout, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminIgnoreTimeout) &&
        Objects.equals(this.orgApacheFelixEventadminIgnoreTopic, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminIgnoreTopic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheFelixEventadminThreadPoolSize, orgApacheFelixEventadminAsyncToSyncThreadRatio, orgApacheFelixEventadminTimeout, orgApacheFelixEventadminRequireTopic, orgApacheFelixEventadminIgnoreTimeout, orgApacheFelixEventadminIgnoreTopic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixEventadminImplEventAdminProperties {\n");
    sb.append("    orgApacheFelixEventadminThreadPoolSize: ").append(toIndentedString(orgApacheFelixEventadminThreadPoolSize)).append("\n");
    sb.append("    orgApacheFelixEventadminAsyncToSyncThreadRatio: ").append(toIndentedString(orgApacheFelixEventadminAsyncToSyncThreadRatio)).append("\n");
    sb.append("    orgApacheFelixEventadminTimeout: ").append(toIndentedString(orgApacheFelixEventadminTimeout)).append("\n");
    sb.append("    orgApacheFelixEventadminRequireTopic: ").append(toIndentedString(orgApacheFelixEventadminRequireTopic)).append("\n");
    sb.append("    orgApacheFelixEventadminIgnoreTimeout: ").append(toIndentedString(orgApacheFelixEventadminIgnoreTimeout)).append("\n");
    sb.append("    orgApacheFelixEventadminIgnoreTopic: ").append(toIndentedString(orgApacheFelixEventadminIgnoreTopic)).append("\n");
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

