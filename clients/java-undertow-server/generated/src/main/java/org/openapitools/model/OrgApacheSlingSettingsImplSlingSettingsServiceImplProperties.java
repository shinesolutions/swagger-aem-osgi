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
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties   {
  
  private ConfigNodePropertyString slingName;
  private ConfigNodePropertyString slingDescription;

  /**
   */
  public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties slingName(ConfigNodePropertyString slingName) {
    this.slingName = slingName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.name")
  public ConfigNodePropertyString getSlingName() {
    return slingName;
  }
  public void setSlingName(ConfigNodePropertyString slingName) {
    this.slingName = slingName;
  }

  /**
   */
  public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties slingDescription(ConfigNodePropertyString slingDescription) {
    this.slingDescription = slingDescription;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.description")
  public ConfigNodePropertyString getSlingDescription() {
    return slingDescription;
  }
  public void setSlingDescription(ConfigNodePropertyString slingDescription) {
    this.slingDescription = slingDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties orgApacheSlingSettingsImplSlingSettingsServiceImplProperties = (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties) o;
    return Objects.equals(slingName, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingName) &&
        Objects.equals(slingDescription, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingName, slingDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {\n");
    
    sb.append("    slingName: ").append(toIndentedString(slingName)).append("\n");
    sb.append("    slingDescription: ").append(toIndentedString(slingDescription)).append("\n");
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

