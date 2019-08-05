package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString pathBuilderTarget = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString suggestBasepath = null;
 /**
   * Get pathBuilderTarget
   * @return pathBuilderTarget
  **/
  @JsonProperty("pathBuilder.target")
  public ConfigNodePropertyString getPathBuilderTarget() {
    return pathBuilderTarget;
  }

  public void setPathBuilderTarget(ConfigNodePropertyString pathBuilderTarget) {
    this.pathBuilderTarget = pathBuilderTarget;
  }

  public ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties pathBuilderTarget(ConfigNodePropertyString pathBuilderTarget) {
    this.pathBuilderTarget = pathBuilderTarget;
    return this;
  }

 /**
   * Get suggestBasepath
   * @return suggestBasepath
  **/
  @JsonProperty("suggest.basepath")
  public ConfigNodePropertyString getSuggestBasepath() {
    return suggestBasepath;
  }

  public void setSuggestBasepath(ConfigNodePropertyString suggestBasepath) {
    this.suggestBasepath = suggestBasepath;
  }

  public ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties suggestBasepath(ConfigNodePropertyString suggestBasepath) {
    this.suggestBasepath = suggestBasepath;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {\n");
    
    sb.append("    pathBuilderTarget: ").append(toIndentedString(pathBuilderTarget)).append("\n");
    sb.append("    suggestBasepath: ").append(toIndentedString(suggestBasepath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

