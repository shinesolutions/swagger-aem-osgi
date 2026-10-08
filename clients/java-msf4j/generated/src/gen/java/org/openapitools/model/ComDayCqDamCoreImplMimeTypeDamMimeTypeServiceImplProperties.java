package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties   {
  @JsonProperty("cq.dam.detect.asset.mime.from.content")
  private ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent;

  public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties cqDamDetectAssetMimeFromContent(ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent) {
    this.cqDamDetectAssetMimeFromContent = cqDamDetectAssetMimeFromContent;
    return this;
  }

   /**
   * Get cqDamDetectAssetMimeFromContent
   * @return cqDamDetectAssetMimeFromContent
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.cqDamDetectAssetMimeFromContent, comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.cqDamDetectAssetMimeFromContent);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

