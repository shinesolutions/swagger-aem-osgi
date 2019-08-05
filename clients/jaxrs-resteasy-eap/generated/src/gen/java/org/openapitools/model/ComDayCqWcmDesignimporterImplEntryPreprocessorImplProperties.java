package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties   {
  

  private ConfigNodePropertyString searchPattern = null;

  private ConfigNodePropertyString replacePattern = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("search.pattern")
  public ConfigNodePropertyString getSearchPattern() {
    return searchPattern;
  }
  public void setSearchPattern(ConfigNodePropertyString searchPattern) {
    this.searchPattern = searchPattern;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("replace.pattern")
  public ConfigNodePropertyString getReplacePattern() {
    return replacePattern;
  }
  public void setReplacePattern(ConfigNodePropertyString replacePattern) {
    this.replacePattern = replacePattern;
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
    return Objects.equals(searchPattern, comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.searchPattern) &&
        Objects.equals(replacePattern, comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.replacePattern);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

