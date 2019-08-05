package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString searchPattern = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString replacePattern = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

