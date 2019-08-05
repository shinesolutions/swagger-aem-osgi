package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties   {
  
  private ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent = null;

  /**
   **/
  public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties cqDamDetectAssetMimeFromContent(ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent) {
    this.cqDamDetectAssetMimeFromContent = cqDamDetectAssetMimeFromContent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.detect.asset.mime.from.content")
  public ConfigNodePropertyBoolean getCqDamDetectAssetMimeFromContent() {
    return cqDamDetectAssetMimeFromContent;
  }
  public void setCqDamDetectAssetMimeFromContent(ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent) {
    this.cqDamDetectAssetMimeFromContent = cqDamDetectAssetMimeFromContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

