package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingServletsGetDefaultGetServletProperties   {
  
  private ConfigNodePropertyArray aliases = null;
  private ConfigNodePropertyBoolean index = null;
  private ConfigNodePropertyArray indexFiles = null;
  private ConfigNodePropertyBoolean enableHtml = null;
  private ConfigNodePropertyBoolean enableJson = null;
  private ConfigNodePropertyBoolean enableTxt = null;
  private ConfigNodePropertyBoolean enableXml = null;
  private ConfigNodePropertyInteger jsonMaximumresults = null;
  private ConfigNodePropertyBoolean ecmaSuport = null;

  public OrgApacheSlingServletsGetDefaultGetServletProperties () {

  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties (ConfigNodePropertyArray aliases, ConfigNodePropertyBoolean index, ConfigNodePropertyArray indexFiles, ConfigNodePropertyBoolean enableHtml, ConfigNodePropertyBoolean enableJson, ConfigNodePropertyBoolean enableTxt, ConfigNodePropertyBoolean enableXml, ConfigNodePropertyInteger jsonMaximumresults, ConfigNodePropertyBoolean ecmaSuport) {
    this.aliases = aliases;
    this.index = index;
    this.indexFiles = indexFiles;
    this.enableHtml = enableHtml;
    this.enableJson = enableJson;
    this.enableTxt = enableTxt;
    this.enableXml = enableXml;
    this.jsonMaximumresults = jsonMaximumresults;
    this.ecmaSuport = ecmaSuport;
  }

    
  @JsonProperty("aliases")
  public ConfigNodePropertyArray getAliases() {
    return aliases;
  }
  public void setAliases(ConfigNodePropertyArray aliases) {
    this.aliases = aliases;
  }

    
  @JsonProperty("index")
  public ConfigNodePropertyBoolean getIndex() {
    return index;
  }
  public void setIndex(ConfigNodePropertyBoolean index) {
    this.index = index;
  }

    
  @JsonProperty("index.files")
  public ConfigNodePropertyArray getIndexFiles() {
    return indexFiles;
  }
  public void setIndexFiles(ConfigNodePropertyArray indexFiles) {
    this.indexFiles = indexFiles;
  }

    
  @JsonProperty("enable.html")
  public ConfigNodePropertyBoolean getEnableHtml() {
    return enableHtml;
  }
  public void setEnableHtml(ConfigNodePropertyBoolean enableHtml) {
    this.enableHtml = enableHtml;
  }

    
  @JsonProperty("enable.json")
  public ConfigNodePropertyBoolean getEnableJson() {
    return enableJson;
  }
  public void setEnableJson(ConfigNodePropertyBoolean enableJson) {
    this.enableJson = enableJson;
  }

    
  @JsonProperty("enable.txt")
  public ConfigNodePropertyBoolean getEnableTxt() {
    return enableTxt;
  }
  public void setEnableTxt(ConfigNodePropertyBoolean enableTxt) {
    this.enableTxt = enableTxt;
  }

    
  @JsonProperty("enable.xml")
  public ConfigNodePropertyBoolean getEnableXml() {
    return enableXml;
  }
  public void setEnableXml(ConfigNodePropertyBoolean enableXml) {
    this.enableXml = enableXml;
  }

    
  @JsonProperty("json.maximumresults")
  public ConfigNodePropertyInteger getJsonMaximumresults() {
    return jsonMaximumresults;
  }
  public void setJsonMaximumresults(ConfigNodePropertyInteger jsonMaximumresults) {
    this.jsonMaximumresults = jsonMaximumresults;
  }

    
  @JsonProperty("ecmaSuport")
  public ConfigNodePropertyBoolean getEcmaSuport() {
    return ecmaSuport;
  }
  public void setEcmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
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
    return Objects.equals(aliases, orgApacheSlingServletsGetDefaultGetServletProperties.aliases) &&
        Objects.equals(index, orgApacheSlingServletsGetDefaultGetServletProperties.index) &&
        Objects.equals(indexFiles, orgApacheSlingServletsGetDefaultGetServletProperties.indexFiles) &&
        Objects.equals(enableHtml, orgApacheSlingServletsGetDefaultGetServletProperties.enableHtml) &&
        Objects.equals(enableJson, orgApacheSlingServletsGetDefaultGetServletProperties.enableJson) &&
        Objects.equals(enableTxt, orgApacheSlingServletsGetDefaultGetServletProperties.enableTxt) &&
        Objects.equals(enableXml, orgApacheSlingServletsGetDefaultGetServletProperties.enableXml) &&
        Objects.equals(jsonMaximumresults, orgApacheSlingServletsGetDefaultGetServletProperties.jsonMaximumresults) &&
        Objects.equals(ecmaSuport, orgApacheSlingServletsGetDefaultGetServletProperties.ecmaSuport);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
