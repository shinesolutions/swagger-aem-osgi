package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties   {
  @JsonProperty("guessTotal")
  private ConfigNodePropertyString guessTotal = null;

  @JsonProperty("tagTitleSearch")
  private ConfigNodePropertyBoolean tagTitleSearch = null;

  /**
   **/
  public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties guessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("guessTotal")
  public ConfigNodePropertyString getGuessTotal() {
    return guessTotal;
  }
  public void setGuessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
  }

  /**
   **/
  public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties tagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tagTitleSearch")
  public ConfigNodePropertyBoolean getTagTitleSearch() {
    return tagTitleSearch;
  }
  public void setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties = (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties) o;
    return Objects.equals(guessTotal, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.guessTotal) &&
        Objects.equals(tagTitleSearch, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.tagTitleSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guessTotal, tagTitleSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties {\n");
    
    sb.append("    guessTotal: ").append(toIndentedString(guessTotal)).append("\n");
    sb.append("    tagTitleSearch: ").append(toIndentedString(tagTitleSearch)).append("\n");
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

