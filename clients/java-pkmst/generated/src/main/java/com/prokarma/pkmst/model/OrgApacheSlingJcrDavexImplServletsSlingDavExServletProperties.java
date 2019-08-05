package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties   {
  @JsonProperty("alias")
  private ConfigNodePropertyString alias = null;

  @JsonProperty("dav.create-absolute-uri")
  private ConfigNodePropertyBoolean davCreateAbsoluteUri = null;

  @JsonProperty("dav.protectedhandlers")
  private ConfigNodePropertyString davProtectedhandlers = null;

  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties alias(ConfigNodePropertyString alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAlias() {
    return alias;
  }

  public void setAlias(ConfigNodePropertyString alias) {
    this.alias = alias;
  }

  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties davCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    return this;
  }

   /**
   * Get davCreateAbsoluteUri
   * @return davCreateAbsoluteUri
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }

  public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties davProtectedhandlers(ConfigNodePropertyString davProtectedhandlers) {
    this.davProtectedhandlers = davProtectedhandlers;
    return this;
  }

   /**
   * Get davProtectedhandlers
   * @return davProtectedhandlers
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDavProtectedhandlers() {
    return davProtectedhandlers;
  }

  public void setDavProtectedhandlers(ConfigNodePropertyString davProtectedhandlers) {
    this.davProtectedhandlers = davProtectedhandlers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties = (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties) o;
    return Objects.equals(this.alias, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.alias) &&
        Objects.equals(this.davCreateAbsoluteUri, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.davCreateAbsoluteUri) &&
        Objects.equals(this.davProtectedhandlers, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.davProtectedhandlers);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

