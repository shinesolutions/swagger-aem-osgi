package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingServletsGetDefaultGetServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingServletsGetDefaultGetServletProperties   {
  @JsonProperty("aliases")
  private ConfigNodePropertyArray aliases = null;

  @JsonProperty("index")
  private ConfigNodePropertyBoolean index = null;

  @JsonProperty("index.files")
  private ConfigNodePropertyArray indexFiles = null;

  @JsonProperty("enable.html")
  private ConfigNodePropertyBoolean enableHtml = null;

  @JsonProperty("enable.json")
  private ConfigNodePropertyBoolean enableJson = null;

  @JsonProperty("enable.txt")
  private ConfigNodePropertyBoolean enableTxt = null;

  @JsonProperty("enable.xml")
  private ConfigNodePropertyBoolean enableXml = null;

  @JsonProperty("json.maximumresults")
  private ConfigNodePropertyInteger jsonMaximumresults = null;

  @JsonProperty("ecmaSuport")
  private ConfigNodePropertyBoolean ecmaSuport = null;

  public OrgApacheSlingServletsGetDefaultGetServletProperties aliases(ConfigNodePropertyArray aliases) {
    this.aliases = aliases;
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @Valid
  public ConfigNodePropertyArray getAliases() {
    return aliases;
  }

  public void setAliases(ConfigNodePropertyArray aliases) {
    this.aliases = aliases;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties index(ConfigNodePropertyBoolean index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @Valid
  public ConfigNodePropertyBoolean getIndex() {
    return index;
  }

  public void setIndex(ConfigNodePropertyBoolean index) {
    this.index = index;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties indexFiles(ConfigNodePropertyArray indexFiles) {
    this.indexFiles = indexFiles;
    return this;
  }

   /**
   * Get indexFiles
   * @return indexFiles
  **/
  @Valid
  public ConfigNodePropertyArray getIndexFiles() {
    return indexFiles;
  }

  public void setIndexFiles(ConfigNodePropertyArray indexFiles) {
    this.indexFiles = indexFiles;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableHtml(ConfigNodePropertyBoolean enableHtml) {
    this.enableHtml = enableHtml;
    return this;
  }

   /**
   * Get enableHtml
   * @return enableHtml
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnableHtml() {
    return enableHtml;
  }

  public void setEnableHtml(ConfigNodePropertyBoolean enableHtml) {
    this.enableHtml = enableHtml;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableJson(ConfigNodePropertyBoolean enableJson) {
    this.enableJson = enableJson;
    return this;
  }

   /**
   * Get enableJson
   * @return enableJson
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnableJson() {
    return enableJson;
  }

  public void setEnableJson(ConfigNodePropertyBoolean enableJson) {
    this.enableJson = enableJson;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableTxt(ConfigNodePropertyBoolean enableTxt) {
    this.enableTxt = enableTxt;
    return this;
  }

   /**
   * Get enableTxt
   * @return enableTxt
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnableTxt() {
    return enableTxt;
  }

  public void setEnableTxt(ConfigNodePropertyBoolean enableTxt) {
    this.enableTxt = enableTxt;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableXml(ConfigNodePropertyBoolean enableXml) {
    this.enableXml = enableXml;
    return this;
  }

   /**
   * Get enableXml
   * @return enableXml
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnableXml() {
    return enableXml;
  }

  public void setEnableXml(ConfigNodePropertyBoolean enableXml) {
    this.enableXml = enableXml;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties jsonMaximumresults(ConfigNodePropertyInteger jsonMaximumresults) {
    this.jsonMaximumresults = jsonMaximumresults;
    return this;
  }

   /**
   * Get jsonMaximumresults
   * @return jsonMaximumresults
  **/
  @Valid
  public ConfigNodePropertyInteger getJsonMaximumresults() {
    return jsonMaximumresults;
  }

  public void setJsonMaximumresults(ConfigNodePropertyInteger jsonMaximumresults) {
    this.jsonMaximumresults = jsonMaximumresults;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties ecmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
    return this;
  }

   /**
   * Get ecmaSuport
   * @return ecmaSuport
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

