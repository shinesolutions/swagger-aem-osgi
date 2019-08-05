package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqDamCoreImplProcessTextExtractionProcessProperties   {
  
  private ConfigNodePropertyArray mimeTypes = null;
  private ConfigNodePropertyInteger maxExtract = null;

  /**
   **/
  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties mimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mimeTypes")
  public ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }
  public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

  /**
   **/
  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties maxExtract(ConfigNodePropertyInteger maxExtract) {
    this.maxExtract = maxExtract;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxExtract")
  public ConfigNodePropertyInteger getMaxExtract() {
    return maxExtract;
  }
  public void setMaxExtract(ConfigNodePropertyInteger maxExtract) {
    this.maxExtract = maxExtract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplProcessTextExtractionProcessProperties comDayCqDamCoreImplProcessTextExtractionProcessProperties = (ComDayCqDamCoreImplProcessTextExtractionProcessProperties) o;
    return Objects.equals(mimeTypes, comDayCqDamCoreImplProcessTextExtractionProcessProperties.mimeTypes) &&
        Objects.equals(maxExtract, comDayCqDamCoreImplProcessTextExtractionProcessProperties.maxExtract);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

