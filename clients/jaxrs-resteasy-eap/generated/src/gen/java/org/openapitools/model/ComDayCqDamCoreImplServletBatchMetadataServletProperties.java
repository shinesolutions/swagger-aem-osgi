package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqDamCoreImplServletBatchMetadataServletProperties   {
  

  private ConfigNodePropertyArray cqDamBatchMetadataAssetDefault = null;

  private ConfigNodePropertyArray cqDamBatchMetadataCollectionDefault = null;

  private ConfigNodePropertyInteger cqDamBatchMetadataMaxresources = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.batch.metadata.asset.default")
  public ConfigNodePropertyArray getCqDamBatchMetadataAssetDefault() {
    return cqDamBatchMetadataAssetDefault;
  }
  public void setCqDamBatchMetadataAssetDefault(ConfigNodePropertyArray cqDamBatchMetadataAssetDefault) {
    this.cqDamBatchMetadataAssetDefault = cqDamBatchMetadataAssetDefault;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.batch.metadata.collection.default")
  public ConfigNodePropertyArray getCqDamBatchMetadataCollectionDefault() {
    return cqDamBatchMetadataCollectionDefault;
  }
  public void setCqDamBatchMetadataCollectionDefault(ConfigNodePropertyArray cqDamBatchMetadataCollectionDefault) {
    this.cqDamBatchMetadataCollectionDefault = cqDamBatchMetadataCollectionDefault;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

