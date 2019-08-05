package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



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


  /**
   **/
  public OrgApacheSlingServletsGetDefaultGetServletProperties aliases(ConfigNodePropertyArray aliases) {
    this.aliases = aliases;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("aliases")
  public ConfigNodePropertyArray getAliases() {
    return aliases;
  }
  public void setAliases(ConfigNodePropertyArray aliases) {
    this.aliases = aliases;
  }


  /**
   **/
  public OrgApacheSlingServletsGetDefaultGetServletProperties index(ConfigNodePropertyBoolean index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("index")
  public ConfigNodePropertyBoolean getIndex() {
    return index;
  }
  public void setIndex(ConfigNodePropertyBoolean index) {
    this.index = index;
  }


  /**
   **/
  public OrgApacheSlingServletsGetDefaultGetServletProperties indexFiles(ConfigNodePropertyArray indexFiles) {
    this.indexFiles = indexFiles;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("index.files")
  public ConfigNodePropertyArray getIndexFiles() {
    return indexFiles;
  }
  public void setIndexFiles(ConfigNodePropertyArray indexFiles) {
    this.indexFiles = indexFiles;
  }


  /**
   **/
  public OrgApacheSlingServletsGetDefaultGetServletProperties enableHtml(ConfigNodePropertyBoolean enableHtml) {
    this.enableHtml = enableHtml;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enable.html")
  public ConfigNodePropertyBoolean getEnableHtml() {
    return enableHtml;
  }
  public void setEnableHtml(ConfigNodePropertyBoolean enableHtml) {
    this.enableHtml = enableHtml;
  }


  /**
   **/
  public OrgApacheSlingServletsGetDefaultGetServletProperties enableJson(ConfigNodePropertyBoolean enableJson) {
    this.enableJson = enableJson;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enable.json")
  public ConfigNodePropertyBoolean getEnableJson() {
    return enableJson;
  }
  public void setEnableJson(ConfigNodePropertyBoolean enableJson) {
    this.enableJson = enableJson;
  }


  /**
   **/
  public OrgApacheSlingServletsGetDefaultGetServletProperties enableTxt(ConfigNodePropertyBoolean enableTxt) {
    this.enableTxt = enableTxt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enable.txt")
  public ConfigNodePropertyBoolean getEnableTxt() {
    return enableTxt;
  }
  public void setEnableTxt(ConfigNodePropertyBoolean enableTxt) {
    this.enableTxt = enableTxt;
  }


  /**
   **/
  public OrgApacheSlingServletsGetDefaultGetServletProperties enableXml(ConfigNodePropertyBoolean enableXml) {
    this.enableXml = enableXml;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enable.xml")
  public ConfigNodePropertyBoolean getEnableXml() {
    return enableXml;
  }
  public void setEnableXml(ConfigNodePropertyBoolean enableXml) {
    this.enableXml = enableXml;
  }


  /**
   **/
  public OrgApacheSlingServletsGetDefaultGetServletProperties jsonMaximumresults(ConfigNodePropertyInteger jsonMaximumresults) {
    this.jsonMaximumresults = jsonMaximumresults;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("json.maximumresults")
  public ConfigNodePropertyInteger getJsonMaximumresults() {
    return jsonMaximumresults;
  }
  public void setJsonMaximumresults(ConfigNodePropertyInteger jsonMaximumresults) {
    this.jsonMaximumresults = jsonMaximumresults;
  }


  /**
   **/
  public OrgApacheSlingServletsGetDefaultGetServletProperties ecmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ecmaSuport")
  public ConfigNodePropertyBoolean getEcmaSuport() {
    return ecmaSuport;
  }
  public void setEcmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

