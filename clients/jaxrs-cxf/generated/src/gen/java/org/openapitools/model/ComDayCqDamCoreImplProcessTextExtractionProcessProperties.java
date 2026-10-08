package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplProcessTextExtractionProcessProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray mimeTypes;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger maxExtract;
 /**
   * Get mimeTypes
   * @return mimeTypes
  **/
  @JsonProperty("mimeTypes")
  public ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }

  public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties mimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

 /**
   * Get maxExtract
   * @return maxExtract
  **/
  @JsonProperty("maxExtract")
  public ConfigNodePropertyInteger getMaxExtract() {
    return maxExtract;
  }

  public void setMaxExtract(ConfigNodePropertyInteger maxExtract) {
    this.maxExtract = maxExtract;
  }

  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties maxExtract(ConfigNodePropertyInteger maxExtract) {
    this.maxExtract = maxExtract;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplProcessTextExtractionProcessProperties comDayCqDamCoreImplProcessTextExtractionProcessProperties = (ComDayCqDamCoreImplProcessTextExtractionProcessProperties) o;
    return Objects.equals(this.mimeTypes, comDayCqDamCoreImplProcessTextExtractionProcessProperties.mimeTypes) &&
        Objects.equals(this.maxExtract, comDayCqDamCoreImplProcessTextExtractionProcessProperties.maxExtract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeTypes, maxExtract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplProcessTextExtractionProcessProperties {\n");
    
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
    sb.append("    maxExtract: ").append(toIndentedString(maxExtract)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

