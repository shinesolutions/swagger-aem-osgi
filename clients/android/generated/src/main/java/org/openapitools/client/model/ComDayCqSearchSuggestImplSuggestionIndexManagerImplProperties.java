/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {
  
  @SerializedName("pathBuilder.target")
  private ConfigNodePropertyString pathBuilderTarget = null;
  @SerializedName("suggest.basepath")
  private ConfigNodePropertyString suggestBasepath = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPathBuilderTarget() {
    return pathBuilderTarget;
  }
  public void setPathBuilderTarget(ConfigNodePropertyString pathBuilderTarget) {
    this.pathBuilderTarget = pathBuilderTarget;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSuggestBasepath() {
    return suggestBasepath;
  }
  public void setSuggestBasepath(ConfigNodePropertyString suggestBasepath) {
    this.suggestBasepath = suggestBasepath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties = (ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties) o;
    return (this.pathBuilderTarget == null ? comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.pathBuilderTarget == null : this.pathBuilderTarget.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.pathBuilderTarget)) &&
        (this.suggestBasepath == null ? comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.suggestBasepath == null : this.suggestBasepath.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.suggestBasepath));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pathBuilderTarget == null ? 0: this.pathBuilderTarget.hashCode());
    result = 31 * result + (this.suggestBasepath == null ? 0: this.suggestBasepath.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {\n");
    
    sb.append("  pathBuilderTarget: ").append(pathBuilderTarget).append("\n");
    sb.append("  suggestBasepath: ").append(suggestBasepath).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}