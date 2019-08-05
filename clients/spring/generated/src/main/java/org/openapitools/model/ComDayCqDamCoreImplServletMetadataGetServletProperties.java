package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqDamCoreImplServletMetadataGetServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqDamCoreImplServletMetadataGetServletProperties   {
  @JsonProperty("sling.servlet.resourceTypes")
  private ConfigNodePropertyString slingServletResourceTypes = null;

  @JsonProperty("sling.servlet.methods")
  private ConfigNodePropertyString slingServletMethods = null;

  @JsonProperty("sling.servlet.extensions")
  private ConfigNodePropertyString slingServletExtensions = null;

  @JsonProperty("sling.servlet.selectors")
  private ConfigNodePropertyString slingServletSelectors = null;

  public ComDayCqDamCoreImplServletMetadataGetServletProperties slingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

  /**
   * Get slingServletResourceTypes
   * @return slingServletResourceTypes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  public ComDayCqDamCoreImplServletMetadataGetServletProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

  /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComDayCqDamCoreImplServletMetadataGetServletProperties slingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
    return this;
  }

  /**
   * Get slingServletExtensions
   * @return slingServletExtensions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }

  public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
  }

  public ComDayCqDamCoreImplServletMetadataGetServletProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

  /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletMetadataGetServletProperties comDayCqDamCoreImplServletMetadataGetServletProperties = (ComDayCqDamCoreImplServletMetadataGetServletProperties) o;
    return Objects.equals(this.slingServletResourceTypes, comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletResourceTypes) &&
        Objects.equals(this.slingServletMethods, comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletMethods) &&
        Objects.equals(this.slingServletExtensions, comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletExtensions) &&
        Objects.equals(this.slingServletSelectors, comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletSelectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletResourceTypes, slingServletMethods, slingServletExtensions, slingServletSelectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletMetadataGetServletProperties {\n");
    
    sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
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

