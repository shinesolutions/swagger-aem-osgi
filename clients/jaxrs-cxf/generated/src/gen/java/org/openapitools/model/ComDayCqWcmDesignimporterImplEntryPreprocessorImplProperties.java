package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString searchPattern;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString replacePattern;
 /**
   * Get searchPattern
   * @return searchPattern
  **/
  @JsonProperty("search.pattern")
  public ConfigNodePropertyString getSearchPattern() {
    return searchPattern;
  }

  public void setSearchPattern(ConfigNodePropertyString searchPattern) {
    this.searchPattern = searchPattern;
  }

  public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties searchPattern(ConfigNodePropertyString searchPattern) {
    this.searchPattern = searchPattern;
    return this;
  }

 /**
   * Get replacePattern
   * @return replacePattern
  **/
  @JsonProperty("replace.pattern")
  public ConfigNodePropertyString getReplacePattern() {
    return replacePattern;
  }

  public void setReplacePattern(ConfigNodePropertyString replacePattern) {
    this.replacePattern = replacePattern;
  }

  public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties replacePattern(ConfigNodePropertyString replacePattern) {
    this.replacePattern = replacePattern;
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
    ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties = (ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties) o;
    return Objects.equals(this.searchPattern, comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.searchPattern) &&
        Objects.equals(this.replacePattern, comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.replacePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchPattern, replacePattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties {\n");
    
    sb.append("    searchPattern: ").append(toIndentedString(searchPattern)).append("\n");
    sb.append("    replacePattern: ").append(toIndentedString(replacePattern)).append("\n");
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

