/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties   {
  
  private ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage;
  private ConfigNodePropertyInteger referencesearchservletMaxPages;

  /**
   */
  public ComDayCqWcmCoreImplServletsReferenceSearchServletProperties referencesearchservletMaxReferencesPerPage(ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage) {
    this.referencesearchservletMaxReferencesPerPage = referencesearchservletMaxReferencesPerPage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("referencesearchservlet.maxReferencesPerPage")
  public ConfigNodePropertyInteger getReferencesearchservletMaxReferencesPerPage() {
    return referencesearchservletMaxReferencesPerPage;
  }
  public void setReferencesearchservletMaxReferencesPerPage(ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage) {
    this.referencesearchservletMaxReferencesPerPage = referencesearchservletMaxReferencesPerPage;
  }

  /**
   */
  public ComDayCqWcmCoreImplServletsReferenceSearchServletProperties referencesearchservletMaxPages(ConfigNodePropertyInteger referencesearchservletMaxPages) {
    this.referencesearchservletMaxPages = referencesearchservletMaxPages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("referencesearchservlet.maxPages")
  public ConfigNodePropertyInteger getReferencesearchservletMaxPages() {
    return referencesearchservletMaxPages;
  }
  public void setReferencesearchservletMaxPages(ConfigNodePropertyInteger referencesearchservletMaxPages) {
    this.referencesearchservletMaxPages = referencesearchservletMaxPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsReferenceSearchServletProperties comDayCqWcmCoreImplServletsReferenceSearchServletProperties = (ComDayCqWcmCoreImplServletsReferenceSearchServletProperties) o;
    return Objects.equals(referencesearchservletMaxReferencesPerPage, comDayCqWcmCoreImplServletsReferenceSearchServletProperties.referencesearchservletMaxReferencesPerPage) &&
        Objects.equals(referencesearchservletMaxPages, comDayCqWcmCoreImplServletsReferenceSearchServletProperties.referencesearchservletMaxPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencesearchservletMaxReferencesPerPage, referencesearchservletMaxPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties {\n");
    
    sb.append("    referencesearchservletMaxReferencesPerPage: ").append(toIndentedString(referencesearchservletMaxReferencesPerPage)).append("\n");
    sb.append("    referencesearchservletMaxPages: ").append(toIndentedString(referencesearchservletMaxPages)).append("\n");
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

