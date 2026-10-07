package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingServletsGetDefaultGetServletProperties
 */

@JsonTypeName("orgApacheSlingServletsGetDefaultGetServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingServletsGetDefaultGetServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray aliases;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean index;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray indexFiles;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableHtml;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableJson;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableTxt;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableXml;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger jsonMaximumresults;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean ecmaSuport;

  public OrgApacheSlingServletsGetDefaultGetServletProperties aliases(@Nullable ConfigNodePropertyArray aliases) {
    this.aliases = aliases;
    return this;
  }

  /**
   * Get aliases
   * @return aliases
   */
  @Valid 
  @Schema(name = "aliases", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aliases")
  public @Nullable ConfigNodePropertyArray getAliases() {
    return aliases;
  }

  @JsonProperty("aliases")
  public void setAliases(@Nullable ConfigNodePropertyArray aliases) {
    this.aliases = aliases;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties index(@Nullable ConfigNodePropertyBoolean index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
   */
  @Valid 
  @Schema(name = "index", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index")
  public @Nullable ConfigNodePropertyBoolean getIndex() {
    return index;
  }

  @JsonProperty("index")
  public void setIndex(@Nullable ConfigNodePropertyBoolean index) {
    this.index = index;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties indexFiles(@Nullable ConfigNodePropertyArray indexFiles) {
    this.indexFiles = indexFiles;
    return this;
  }

  /**
   * Get indexFiles
   * @return indexFiles
   */
  @Valid 
  @Schema(name = "index.files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index.files")
  public @Nullable ConfigNodePropertyArray getIndexFiles() {
    return indexFiles;
  }

  @JsonProperty("index.files")
  public void setIndexFiles(@Nullable ConfigNodePropertyArray indexFiles) {
    this.indexFiles = indexFiles;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableHtml(@Nullable ConfigNodePropertyBoolean enableHtml) {
    this.enableHtml = enableHtml;
    return this;
  }

  /**
   * Get enableHtml
   * @return enableHtml
   */
  @Valid 
  @Schema(name = "enable.html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enable.html")
  public @Nullable ConfigNodePropertyBoolean getEnableHtml() {
    return enableHtml;
  }

  @JsonProperty("enable.html")
  public void setEnableHtml(@Nullable ConfigNodePropertyBoolean enableHtml) {
    this.enableHtml = enableHtml;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableJson(@Nullable ConfigNodePropertyBoolean enableJson) {
    this.enableJson = enableJson;
    return this;
  }

  /**
   * Get enableJson
   * @return enableJson
   */
  @Valid 
  @Schema(name = "enable.json", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enable.json")
  public @Nullable ConfigNodePropertyBoolean getEnableJson() {
    return enableJson;
  }

  @JsonProperty("enable.json")
  public void setEnableJson(@Nullable ConfigNodePropertyBoolean enableJson) {
    this.enableJson = enableJson;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableTxt(@Nullable ConfigNodePropertyBoolean enableTxt) {
    this.enableTxt = enableTxt;
    return this;
  }

  /**
   * Get enableTxt
   * @return enableTxt
   */
  @Valid 
  @Schema(name = "enable.txt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enable.txt")
  public @Nullable ConfigNodePropertyBoolean getEnableTxt() {
    return enableTxt;
  }

  @JsonProperty("enable.txt")
  public void setEnableTxt(@Nullable ConfigNodePropertyBoolean enableTxt) {
    this.enableTxt = enableTxt;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties enableXml(@Nullable ConfigNodePropertyBoolean enableXml) {
    this.enableXml = enableXml;
    return this;
  }

  /**
   * Get enableXml
   * @return enableXml
   */
  @Valid 
  @Schema(name = "enable.xml", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enable.xml")
  public @Nullable ConfigNodePropertyBoolean getEnableXml() {
    return enableXml;
  }

  @JsonProperty("enable.xml")
  public void setEnableXml(@Nullable ConfigNodePropertyBoolean enableXml) {
    this.enableXml = enableXml;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties jsonMaximumresults(@Nullable ConfigNodePropertyInteger jsonMaximumresults) {
    this.jsonMaximumresults = jsonMaximumresults;
    return this;
  }

  /**
   * Get jsonMaximumresults
   * @return jsonMaximumresults
   */
  @Valid 
  @Schema(name = "json.maximumresults", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("json.maximumresults")
  public @Nullable ConfigNodePropertyInteger getJsonMaximumresults() {
    return jsonMaximumresults;
  }

  @JsonProperty("json.maximumresults")
  public void setJsonMaximumresults(@Nullable ConfigNodePropertyInteger jsonMaximumresults) {
    this.jsonMaximumresults = jsonMaximumresults;
  }

  public OrgApacheSlingServletsGetDefaultGetServletProperties ecmaSuport(@Nullable ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
    return this;
  }

  /**
   * Get ecmaSuport
   * @return ecmaSuport
   */
  @Valid 
  @Schema(name = "ecmaSuport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ecmaSuport")
  public @Nullable ConfigNodePropertyBoolean getEcmaSuport() {
    return ecmaSuport;
  }

  @JsonProperty("ecmaSuport")
  public void setEcmaSuport(@Nullable ConfigNodePropertyBoolean ecmaSuport) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

