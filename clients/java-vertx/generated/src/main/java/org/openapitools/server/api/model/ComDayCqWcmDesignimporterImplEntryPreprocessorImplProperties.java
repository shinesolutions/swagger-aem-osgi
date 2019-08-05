package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties   {
  
  private ConfigNodePropertyString searchPattern = null;
  private ConfigNodePropertyString replacePattern = null;

  public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties () {

  }

  public ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties (ConfigNodePropertyString searchPattern, ConfigNodePropertyString replacePattern) {
    this.searchPattern = searchPattern;
    this.replacePattern = replacePattern;
  }

    
  @JsonProperty("search.pattern")
  public ConfigNodePropertyString getSearchPattern() {
    return searchPattern;
  }
  public void setSearchPattern(ConfigNodePropertyString searchPattern) {
    this.searchPattern = searchPattern;
  }

    
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
