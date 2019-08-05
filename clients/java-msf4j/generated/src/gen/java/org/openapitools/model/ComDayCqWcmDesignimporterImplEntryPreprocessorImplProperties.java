package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties   {
  @JsonProperty("search.pattern")
  private ConfigNodePropertyString searchPattern = null;

  @JsonProperty("replace.pattern")
  private ConfigNodePropertyString replacePattern = null;

  public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties searchPattern(ConfigNodePropertyString searchPattern) {
    this.searchPattern = searchPattern;
    return this;
  }

   /**
   * Get searchPattern
   * @return searchPattern
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSearchPattern() {
    return searchPattern;
  }

  public void setSearchPattern(ConfigNodePropertyString searchPattern) {
    this.searchPattern = searchPattern;
  }

  public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties replacePattern(ConfigNodePropertyString replacePattern) {
    this.replacePattern = replacePattern;
    return this;
  }

   /**
   * Get replacePattern
   * @return replacePattern
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getReplacePattern() {
    return replacePattern;
  }

  public void setReplacePattern(ConfigNodePropertyString replacePattern) {
    this.replacePattern = replacePattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

