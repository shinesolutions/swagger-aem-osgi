package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString guessTotal;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean tagTitleSearch;
 /**
  * Get guessTotal
  * @return guessTotal
  */
  @JsonProperty("guessTotal")
  public ConfigNodePropertyString getGuessTotal() {
    return guessTotal;
  }

  /**
   * Sets the <code>guessTotal</code> property.
   */
 public void setGuessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
  }

  /**
   * Sets the <code>guessTotal</code> property.
   */
  public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties guessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
    return this;
  }

 /**
  * Get tagTitleSearch
  * @return tagTitleSearch
  */
  @JsonProperty("tagTitleSearch")
  public ConfigNodePropertyBoolean getTagTitleSearch() {
    return tagTitleSearch;
  }

  /**
   * Sets the <code>tagTitleSearch</code> property.
   */
 public void setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
  }

  /**
   * Sets the <code>tagTitleSearch</code> property.
   */
  public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties tagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties = (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties) o;
    return Objects.equals(this.guessTotal, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.guessTotal) &&
        Objects.equals(this.tagTitleSearch, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.tagTitleSearch);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

