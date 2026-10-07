package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamCoreImplServletBatchMetadataServletProperties
 */

@JsonTypeName("comDayCqDamCoreImplServletBatchMetadataServletProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletBatchMetadataServletProperties {

  private ConfigNodePropertyArray cqDamBatchMetadataAssetDefault;

  private ConfigNodePropertyArray cqDamBatchMetadataCollectionDefault;

  private ConfigNodePropertyInteger cqDamBatchMetadataMaxresources;

  public ComDayCqDamCoreImplServletBatchMetadataServletProperties cqDamBatchMetadataAssetDefault(ConfigNodePropertyArray cqDamBatchMetadataAssetDefault) {
    this.cqDamBatchMetadataAssetDefault = cqDamBatchMetadataAssetDefault;
    return this;
  }

  /**
   * Get cqDamBatchMetadataAssetDefault
   * @return cqDamBatchMetadataAssetDefault
   */
  @Valid 
  @Schema(name = "cq.dam.batch.metadata.asset.default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.batch.metadata.asset.default")
  public ConfigNodePropertyArray getCqDamBatchMetadataAssetDefault() {
    return cqDamBatchMetadataAssetDefault;
  }

  public void setCqDamBatchMetadataAssetDefault(ConfigNodePropertyArray cqDamBatchMetadataAssetDefault) {
    this.cqDamBatchMetadataAssetDefault = cqDamBatchMetadataAssetDefault;
  }

  public ComDayCqDamCoreImplServletBatchMetadataServletProperties cqDamBatchMetadataCollectionDefault(ConfigNodePropertyArray cqDamBatchMetadataCollectionDefault) {
    this.cqDamBatchMetadataCollectionDefault = cqDamBatchMetadataCollectionDefault;
    return this;
  }

  /**
   * Get cqDamBatchMetadataCollectionDefault
   * @return cqDamBatchMetadataCollectionDefault
   */
  @Valid 
  @Schema(name = "cq.dam.batch.metadata.collection.default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.batch.metadata.collection.default")
  public ConfigNodePropertyArray getCqDamBatchMetadataCollectionDefault() {
    return cqDamBatchMetadataCollectionDefault;
  }

  public void setCqDamBatchMetadataCollectionDefault(ConfigNodePropertyArray cqDamBatchMetadataCollectionDefault) {
    this.cqDamBatchMetadataCollectionDefault = cqDamBatchMetadataCollectionDefault;
  }

  public ComDayCqDamCoreImplServletBatchMetadataServletProperties cqDamBatchMetadataMaxresources(ConfigNodePropertyInteger cqDamBatchMetadataMaxresources) {
    this.cqDamBatchMetadataMaxresources = cqDamBatchMetadataMaxresources;
    return this;
  }

  /**
   * Get cqDamBatchMetadataMaxresources
   * @return cqDamBatchMetadataMaxresources
   */
  @Valid 
  @Schema(name = "cq.dam.batch.metadata.maxresources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.batch.metadata.maxresources")
  public ConfigNodePropertyInteger getCqDamBatchMetadataMaxresources() {
    return cqDamBatchMetadataMaxresources;
  }

  public void setCqDamBatchMetadataMaxresources(ConfigNodePropertyInteger cqDamBatchMetadataMaxresources) {
    this.cqDamBatchMetadataMaxresources = cqDamBatchMetadataMaxresources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletBatchMetadataServletProperties comDayCqDamCoreImplServletBatchMetadataServletProperties = (ComDayCqDamCoreImplServletBatchMetadataServletProperties) o;
    return Objects.equals(this.cqDamBatchMetadataAssetDefault, comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataAssetDefault) &&
        Objects.equals(this.cqDamBatchMetadataCollectionDefault, comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataCollectionDefault) &&
        Objects.equals(this.cqDamBatchMetadataMaxresources, comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataMaxresources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchMetadataAssetDefault, cqDamBatchMetadataCollectionDefault, cqDamBatchMetadataMaxresources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletBatchMetadataServletProperties {\n");
    sb.append("    cqDamBatchMetadataAssetDefault: ").append(toIndentedString(cqDamBatchMetadataAssetDefault)).append("\n");
    sb.append("    cqDamBatchMetadataCollectionDefault: ").append(toIndentedString(cqDamBatchMetadataCollectionDefault)).append("\n");
    sb.append("    cqDamBatchMetadataMaxresources: ").append(toIndentedString(cqDamBatchMetadataMaxresources)).append("\n");
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

