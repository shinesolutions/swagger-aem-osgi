package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComDayCqDamCoreImplServletBatchMetadataServletProperties   {
  
  private ConfigNodePropertyArray cqDamBatchMetadataAssetDefault;
  private ConfigNodePropertyArray cqDamBatchMetadataCollectionDefault;
  private ConfigNodePropertyInteger cqDamBatchMetadataMaxresources;

  public ComDayCqDamCoreImplServletBatchMetadataServletProperties () {

  }

  public ComDayCqDamCoreImplServletBatchMetadataServletProperties (ConfigNodePropertyArray cqDamBatchMetadataAssetDefault, ConfigNodePropertyArray cqDamBatchMetadataCollectionDefault, ConfigNodePropertyInteger cqDamBatchMetadataMaxresources) {
    this.cqDamBatchMetadataAssetDefault = cqDamBatchMetadataAssetDefault;
    this.cqDamBatchMetadataCollectionDefault = cqDamBatchMetadataCollectionDefault;
    this.cqDamBatchMetadataMaxresources = cqDamBatchMetadataMaxresources;
  }

    
  @JsonProperty("cq.dam.batch.metadata.asset.default")
  public ConfigNodePropertyArray getCqDamBatchMetadataAssetDefault() {
    return cqDamBatchMetadataAssetDefault;
  }
  public void setCqDamBatchMetadataAssetDefault(ConfigNodePropertyArray cqDamBatchMetadataAssetDefault) {
    this.cqDamBatchMetadataAssetDefault = cqDamBatchMetadataAssetDefault;
  }

    
  @JsonProperty("cq.dam.batch.metadata.collection.default")
  public ConfigNodePropertyArray getCqDamBatchMetadataCollectionDefault() {
    return cqDamBatchMetadataCollectionDefault;
  }
  public void setCqDamBatchMetadataCollectionDefault(ConfigNodePropertyArray cqDamBatchMetadataCollectionDefault) {
    this.cqDamBatchMetadataCollectionDefault = cqDamBatchMetadataCollectionDefault;
  }

    
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
    return Objects.equals(cqDamBatchMetadataAssetDefault, comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataAssetDefault) &&
        Objects.equals(cqDamBatchMetadataCollectionDefault, comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataCollectionDefault) &&
        Objects.equals(cqDamBatchMetadataMaxresources, comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataMaxresources);
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
