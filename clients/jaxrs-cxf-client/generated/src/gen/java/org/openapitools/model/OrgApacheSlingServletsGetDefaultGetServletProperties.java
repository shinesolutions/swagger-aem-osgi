package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingServletsGetDefaultGetServletProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray aliases;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean index;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray indexFiles;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean enableHtml;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean enableJson;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean enableTxt;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean enableXml;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger jsonMaximumresults;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean ecmaSuport;
 /**
   * Get aliases
   * @return aliases
  **/
  @JsonProperty("aliases")
  public ConfigNodePropertyArray getAliases() {
    return aliases;
  }

  public void setAliases(ConfigNodePropertyArray aliases) {
    this.aliases = aliases;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties aliases(ConfigNodePropertyArray aliases) {
    this.aliases = aliases;
    return this;
  }

 /**
   * Get index
   * @return index
  **/
  @JsonProperty("index")
  public ConfigNodePropertyBoolean getIndex() {
    return index;
  }

  public void setIndex(ConfigNodePropertyBoolean index) {
    this.index = index;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties index(ConfigNodePropertyBoolean index) {
    this.index = index;
    return this;
  }

 /**
   * Get indexFiles
   * @return indexFiles
  **/
  @JsonProperty("index.files")
  public ConfigNodePropertyArray getIndexFiles() {
    return indexFiles;
  }

  public void setIndexFiles(ConfigNodePropertyArray indexFiles) {
    this.indexFiles = indexFiles;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties indexFiles(ConfigNodePropertyArray indexFiles) {
    this.indexFiles = indexFiles;
    return this;
  }

 /**
   * Get enableHtml
   * @return enableHtml
  **/
  @JsonProperty("enable.html")
  public ConfigNodePropertyBoolean getEnableHtml() {
    return enableHtml;
  }

  public void setEnableHtml(ConfigNodePropertyBoolean enableHtml) {
    this.enableHtml = enableHtml;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableHtml(ConfigNodePropertyBoolean enableHtml) {
    this.enableHtml = enableHtml;
    return this;
  }

 /**
   * Get enableJson
   * @return enableJson
  **/
  @JsonProperty("enable.json")
  public ConfigNodePropertyBoolean getEnableJson() {
    return enableJson;
  }

  public void setEnableJson(ConfigNodePropertyBoolean enableJson) {
    this.enableJson = enableJson;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableJson(ConfigNodePropertyBoolean enableJson) {
    this.enableJson = enableJson;
    return this;
  }

 /**
   * Get enableTxt
   * @return enableTxt
  **/
  @JsonProperty("enable.txt")
  public ConfigNodePropertyBoolean getEnableTxt() {
    return enableTxt;
  }

  public void setEnableTxt(ConfigNodePropertyBoolean enableTxt) {
    this.enableTxt = enableTxt;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableTxt(ConfigNodePropertyBoolean enableTxt) {
    this.enableTxt = enableTxt;
    return this;
  }

 /**
   * Get enableXml
   * @return enableXml
  **/
  @JsonProperty("enable.xml")
  public ConfigNodePropertyBoolean getEnableXml() {
    return enableXml;
  }

  public void setEnableXml(ConfigNodePropertyBoolean enableXml) {
    this.enableXml = enableXml;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableXml(ConfigNodePropertyBoolean enableXml) {
    this.enableXml = enableXml;
    return this;
  }

 /**
   * Get jsonMaximumresults
   * @return jsonMaximumresults
  **/
  @JsonProperty("json.maximumresults")
  public ConfigNodePropertyInteger getJsonMaximumresults() {
    return jsonMaximumresults;
  }

  public void setJsonMaximumresults(ConfigNodePropertyInteger jsonMaximumresults) {
    this.jsonMaximumresults = jsonMaximumresults;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties jsonMaximumresults(ConfigNodePropertyInteger jsonMaximumresults) {
    this.jsonMaximumresults = jsonMaximumresults;
    return this;
  }

 /**
   * Get ecmaSuport
   * @return ecmaSuport
  **/
  @JsonProperty("ecmaSuport")
  public ConfigNodePropertyBoolean getEcmaSuport() {
    return ecmaSuport;
  }

  public void setEcmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties ecmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
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
    OrgApacheSlingServletsGetDefaultGetServletProperties orgApacheSlingServletsGetDefaultGetServletProperties = (OrgApacheSlingServletsGetDefaultGetServletProperties) o;
    return Objects.equals(this.aliases, orgApacheSlingServletsGetDefaultGetServletProperties.aliases) &&
        Objects.equals(this.index, orgApacheSlingServletsGetDefaultGetServletProperties.index) &&
        Objects.equals(this.indexFiles, orgApacheSlingServletsGetDefaultGetServletProperties.indexFiles) &&
        Objects.equals(this.enableHtml, orgApacheSlingServletsGetDefaultGetServletProperties.enableHtml) &&
        Objects.equals(this.enableJson, orgApacheSlingServletsGetDefaultGetServletProperties.enableJson) &&
        Objects.equals(this.enableTxt, orgApacheSlingServletsGetDefaultGetServletProperties.enableTxt) &&
        Objects.equals(this.enableXml, orgApacheSlingServletsGetDefaultGetServletProperties.enableXml) &&
        Objects.equals(this.jsonMaximumresults, orgApacheSlingServletsGetDefaultGetServletProperties.jsonMaximumresults) &&
        Objects.equals(this.ecmaSuport, orgApacheSlingServletsGetDefaultGetServletProperties.ecmaSuport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, index, indexFiles, enableHtml, enableJson, enableTxt, enableXml, jsonMaximumresults, ecmaSuport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServletsGetDefaultGetServletProperties {\n");
    
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    indexFiles: ").append(toIndentedString(indexFiles)).append("\n");
    sb.append("    enableHtml: ").append(toIndentedString(enableHtml)).append("\n");
    sb.append("    enableJson: ").append(toIndentedString(enableJson)).append("\n");
    sb.append("    enableTxt: ").append(toIndentedString(enableTxt)).append("\n");
    sb.append("    enableXml: ").append(toIndentedString(enableXml)).append("\n");
    sb.append("    jsonMaximumresults: ").append(toIndentedString(jsonMaximumresults)).append("\n");
    sb.append("    ecmaSuport: ").append(toIndentedString(ecmaSuport)).append("\n");
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

