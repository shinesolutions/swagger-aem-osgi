package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString alias = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean davCreateAbsoluteUri = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString davProtectedhandlers = null;
 /**
   * Get alias
   * @return alias
  **/
  @JsonProperty("alias")
  public ConfigNodePropertyString getAlias() {
    return alias;
  }

  public void setAlias(ConfigNodePropertyString alias) {
    this.alias = alias;
  }

  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties alias(ConfigNodePropertyString alias) {
    this.alias = alias;
    return this;
  }

 /**
   * Get davCreateAbsoluteUri
   * @return davCreateAbsoluteUri
  **/
  @JsonProperty("dav.create-absolute-uri")
  public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }

  public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties davCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    return this;
  }

 /**
   * Get davProtectedhandlers
   * @return davProtectedhandlers
  **/
  @JsonProperty("dav.protectedhandlers")
  public ConfigNodePropertyString getDavProtectedhandlers() {
    return davProtectedhandlers;
  }

  public void setDavProtectedhandlers(ConfigNodePropertyString davProtectedhandlers) {
    this.davProtectedhandlers = davProtectedhandlers;
  }

  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties davProtectedhandlers(ConfigNodePropertyString davProtectedhandlers) {
    this.davProtectedhandlers = davProtectedhandlers;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

