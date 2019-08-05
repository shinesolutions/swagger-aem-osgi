package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties   {
  
  private ConfigNodePropertyString pathBuilderTarget = null;
  private ConfigNodePropertyString suggestBasepath = null;

  public ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties () {

  }

  public ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties (ConfigNodePropertyString pathBuilderTarget, ConfigNodePropertyString suggestBasepath) {
    this.pathBuilderTarget = pathBuilderTarget;
    this.suggestBasepath = suggestBasepath;
  }

    
  @JsonProperty("pathBuilder.target")
  public ConfigNodePropertyString getPathBuilderTarget() {
    return pathBuilderTarget;
  }
  public void setPathBuilderTarget(ConfigNodePropertyString pathBuilderTarget) {
    this.pathBuilderTarget = pathBuilderTarget;
  }

    
  @JsonProperty("suggest.basepath")
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
    return Objects.equals(pathBuilderTarget, comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.pathBuilderTarget) &&
        Objects.equals(suggestBasepath, comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.suggestBasepath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathBuilderTarget, suggestBasepath);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
