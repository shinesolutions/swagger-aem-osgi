/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties   {
  
  private ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping;

  /**
   */
  public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties cqDamScene7AssetmimetypeserviceMapping(ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping) {
    this.cqDamScene7AssetmimetypeserviceMapping = cqDamScene7AssetmimetypeserviceMapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.scene7.assetmimetypeservice.mapping")
  public ConfigNodePropertyArray getCqDamScene7AssetmimetypeserviceMapping() {
    return cqDamScene7AssetmimetypeserviceMapping;
  }
  public void setCqDamScene7AssetmimetypeserviceMapping(ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping) {
    this.cqDamScene7AssetmimetypeserviceMapping = cqDamScene7AssetmimetypeserviceMapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties = (ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties) o;
    return Objects.equals(cqDamScene7AssetmimetypeserviceMapping, comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.cqDamScene7AssetmimetypeserviceMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7AssetmimetypeserviceMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties {\n");
    
    sb.append("    cqDamScene7AssetmimetypeserviceMapping: ").append(toIndentedString(cqDamScene7AssetmimetypeserviceMapping)).append("\n");
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

