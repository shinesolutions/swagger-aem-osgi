package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingServletsGetDefaultGetServletProperties   {
  
  private ConfigNodePropertyArray aliases;
  private ConfigNodePropertyBoolean index;
  private ConfigNodePropertyArray indexFiles;
  private ConfigNodePropertyBoolean enableHtml;
  private ConfigNodePropertyBoolean enableJson;
  private ConfigNodePropertyBoolean enableTxt;
  private ConfigNodePropertyBoolean enableXml;
  private ConfigNodePropertyInteger jsonMaximumresults;
  private ConfigNodePropertyBoolean ecmaSuport;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aliases")
  @Valid
  public ConfigNodePropertyArray getAliases() {
    return aliases;
  }
  public void setAliases(ConfigNodePropertyArray aliases) {
    this.aliases = aliases;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("index")
  @Valid
  public ConfigNodePropertyBoolean getIndex() {
    return index;
  }
  public void setIndex(ConfigNodePropertyBoolean index) {
    this.index = index;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("index.files")
  @Valid
  public ConfigNodePropertyArray getIndexFiles() {
    return indexFiles;
  }
  public void setIndexFiles(ConfigNodePropertyArray indexFiles) {
    this.indexFiles = indexFiles;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enable.html")
  @Valid
  public ConfigNodePropertyBoolean getEnableHtml() {
    return enableHtml;
  }
  public void setEnableHtml(ConfigNodePropertyBoolean enableHtml) {
    this.enableHtml = enableHtml;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enable.json")
  @Valid
  public ConfigNodePropertyBoolean getEnableJson() {
    return enableJson;
  }
  public void setEnableJson(ConfigNodePropertyBoolean enableJson) {
    this.enableJson = enableJson;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enable.txt")
  @Valid
  public ConfigNodePropertyBoolean getEnableTxt() {
    return enableTxt;
  }
  public void setEnableTxt(ConfigNodePropertyBoolean enableTxt) {
    this.enableTxt = enableTxt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enable.xml")
  @Valid
  public ConfigNodePropertyBoolean getEnableXml() {
    return enableXml;
  }
  public void setEnableXml(ConfigNodePropertyBoolean enableXml) {
    this.enableXml = enableXml;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("json.maximumresults")
  @Valid
  public ConfigNodePropertyInteger getJsonMaximumresults() {
    return jsonMaximumresults;
  }
  public void setJsonMaximumresults(ConfigNodePropertyInteger jsonMaximumresults) {
    this.jsonMaximumresults = jsonMaximumresults;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ecmaSuport")
  @Valid
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

