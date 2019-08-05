package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplProcessTextExtractionProcessProperties   {
  
  private ConfigNodePropertyArray mimeTypes = null;
  private ConfigNodePropertyInteger maxExtract = null;

  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties () {

  }

  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties (ConfigNodePropertyArray mimeTypes, ConfigNodePropertyInteger maxExtract) {
    this.mimeTypes = mimeTypes;
    this.maxExtract = maxExtract;
  }

    
  @JsonProperty("mimeTypes")
  public ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }
  public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

    
  @JsonProperty("maxExtract")
  public ConfigNodePropertyInteger getMaxExtract() {
    return maxExtract;
  }
  public void setMaxExtract(ConfigNodePropertyInteger maxExtract) {
    this.maxExtract = maxExtract;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
