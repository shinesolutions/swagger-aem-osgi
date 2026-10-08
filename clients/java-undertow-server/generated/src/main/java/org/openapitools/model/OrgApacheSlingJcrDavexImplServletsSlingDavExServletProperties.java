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
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties   {
  
  private ConfigNodePropertyString alias;
  private ConfigNodePropertyBoolean davCreateAbsoluteUri;
  private ConfigNodePropertyString davProtectedhandlers;

  /**
   */
  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties alias(ConfigNodePropertyString alias) {
    this.alias = alias;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("alias")
  public ConfigNodePropertyString getAlias() {
    return alias;
  }
  public void setAlias(ConfigNodePropertyString alias) {
    this.alias = alias;
  }

  /**
   */
  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties davCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dav.create-absolute-uri")
  public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }
  public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

  /**
   */
  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties davProtectedhandlers(ConfigNodePropertyString davProtectedhandlers) {
    this.davProtectedhandlers = davProtectedhandlers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dav.protectedhandlers")
  public ConfigNodePropertyString getDavProtectedhandlers() {
    return davProtectedhandlers;
  }
  public void setDavProtectedhandlers(ConfigNodePropertyString davProtectedhandlers) {
    this.davProtectedhandlers = davProtectedhandlers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties = (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties) o;
    return Objects.equals(alias, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.alias) &&
        Objects.equals(davCreateAbsoluteUri, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.davCreateAbsoluteUri) &&
        Objects.equals(davProtectedhandlers, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.davProtectedhandlers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, davCreateAbsoluteUri, davProtectedhandlers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    davCreateAbsoluteUri: ").append(toIndentedString(davCreateAbsoluteUri)).append("\n");
    sb.append("    davProtectedhandlers: ").append(toIndentedString(davProtectedhandlers)).append("\n");
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

