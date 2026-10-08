package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString accountName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString containerName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString accessKey;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString rootPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString connectionURL;

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties accountName(@Nullable ConfigNodePropertyString accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
   */
  @Valid 
  @Schema(name = "accountName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountName")
  public @Nullable ConfigNodePropertyString getAccountName() {
    return accountName;
  }

  @JsonProperty("accountName")
  public void setAccountName(@Nullable ConfigNodePropertyString accountName) {
    this.accountName = accountName;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties containerName(@Nullable ConfigNodePropertyString containerName) {
    this.containerName = containerName;
    return this;
  }

  /**
   * Get containerName
   * @return containerName
   */
  @Valid 
  @Schema(name = "containerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("containerName")
  public @Nullable ConfigNodePropertyString getContainerName() {
    return containerName;
  }

  @JsonProperty("containerName")
  public void setContainerName(@Nullable ConfigNodePropertyString containerName) {
    this.containerName = containerName;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties accessKey(@Nullable ConfigNodePropertyString accessKey) {
    this.accessKey = accessKey;
    return this;
  }

  /**
   * Get accessKey
   * @return accessKey
   */
  @Valid 
  @Schema(name = "accessKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accessKey")
  public @Nullable ConfigNodePropertyString getAccessKey() {
    return accessKey;
  }

  @JsonProperty("accessKey")
  public void setAccessKey(@Nullable ConfigNodePropertyString accessKey) {
    this.accessKey = accessKey;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties rootPath(@Nullable ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
    return this;
  }

  /**
   * Get rootPath
   * @return rootPath
   */
  @Valid 
  @Schema(name = "rootPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootPath")
  public @Nullable ConfigNodePropertyString getRootPath() {
    return rootPath;
  }

  @JsonProperty("rootPath")
  public void setRootPath(@Nullable ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
  }

  public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties connectionURL(@Nullable ConfigNodePropertyString connectionURL) {
    this.connectionURL = connectionURL;
    return this;
  }

  /**
   * Get connectionURL
   * @return connectionURL
   */
  @Valid 
  @Schema(name = "connectionURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionURL")
  public @Nullable ConfigNodePropertyString getConnectionURL() {
    return connectionURL;
  }

  @JsonProperty("connectionURL")
  public void setConnectionURL(@Nullable ConfigNodePropertyString connectionURL) {
    this.connectionURL = connectionURL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties = (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties) o;
    return Objects.equals(this.accountName, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.accountName) &&
        Objects.equals(this.containerName, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.containerName) &&
        Objects.equals(this.accessKey, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.accessKey) &&
        Objects.equals(this.rootPath, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.rootPath) &&
        Objects.equals(this.connectionURL, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.connectionURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, containerName, accessKey, rootPath, connectionURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    rootPath: ").append(toIndentedString(rootPath)).append("\n");
    sb.append("    connectionURL: ").append(toIndentedString(connectionURL)).append("\n");
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

