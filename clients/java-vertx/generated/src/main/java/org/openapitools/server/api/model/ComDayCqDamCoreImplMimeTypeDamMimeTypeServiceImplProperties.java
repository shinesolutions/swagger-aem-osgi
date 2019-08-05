package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties   {
  
  private ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent = null;

  public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties () {

  }

  public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties (ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent) {
    this.cqDamDetectAssetMimeFromContent = cqDamDetectAssetMimeFromContent;
  }

    
  @JsonProperty("cq.dam.detect.asset.mime.from.content")
  public ConfigNodePropertyBoolean getCqDamDetectAssetMimeFromContent() {
    return cqDamDetectAssetMimeFromContent;
  }
  public void setCqDamDetectAssetMimeFromContent(ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent) {
    this.cqDamDetectAssetMimeFromContent = cqDamDetectAssetMimeFromContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties = (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties) o;
    return Objects.equals(cqDamDetectAssetMimeFromContent, comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.cqDamDetectAssetMimeFromContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamDetectAssetMimeFromContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties {\n");
    
    sb.append("    cqDamDetectAssetMimeFromContent: ").append(toIndentedString(cqDamDetectAssetMimeFromContent)).append("\n");
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
