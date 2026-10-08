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
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletResourceCollectionServletProperties   {
  
  private ConfigNodePropertyArray slingServletResourceTypes;
  private ConfigNodePropertyString slingServletMethods;
  private ConfigNodePropertyString slingServletSelectors;
  private ConfigNodePropertyString downloadConfig;
  private ConfigNodePropertyString viewSelector;
  private ConfigNodePropertyBoolean sendEmail;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.resourceTypes")
  @Valid
  public ConfigNodePropertyArray getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }
  public void setSlingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.methods")
  @Valid
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }
  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.selectors")
  @Valid
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }
  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("download.config")
  @Valid
  public ConfigNodePropertyString getDownloadConfig() {
    return downloadConfig;
  }
  public void setDownloadConfig(ConfigNodePropertyString downloadConfig) {
    this.downloadConfig = downloadConfig;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("view.selector")
  @Valid
  public ConfigNodePropertyString getViewSelector() {
    return viewSelector;
  }
  public void setViewSelector(ConfigNodePropertyString viewSelector) {
    this.viewSelector = viewSelector;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("send_email")
  @Valid
  public ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }
  public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletResourceCollectionServletProperties comDayCqDamCoreImplServletResourceCollectionServletProperties = (ComDayCqDamCoreImplServletResourceCollectionServletProperties) o;
    return Objects.equals(this.slingServletResourceTypes, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletResourceTypes) &&
        Objects.equals(this.slingServletMethods, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletMethods) &&
        Objects.equals(this.slingServletSelectors, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletSelectors) &&
        Objects.equals(this.downloadConfig, comDayCqDamCoreImplServletResourceCollectionServletProperties.downloadConfig) &&
        Objects.equals(this.viewSelector, comDayCqDamCoreImplServletResourceCollectionServletProperties.viewSelector) &&
        Objects.equals(this.sendEmail, comDayCqDamCoreImplServletResourceCollectionServletProperties.sendEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletResourceTypes, slingServletMethods, slingServletSelectors, downloadConfig, viewSelector, sendEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletResourceCollectionServletProperties {\n");
    
    sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    downloadConfig: ").append(toIndentedString(downloadConfig)).append("\n");
    sb.append("    viewSelector: ").append(toIndentedString(viewSelector)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
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

