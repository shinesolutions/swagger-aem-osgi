package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplServletResourceCollectionServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplServletResourceCollectionServletProperties   {
  @JsonProperty("sling.servlet.resourceTypes")
  private ConfigNodePropertyArray slingServletResourceTypes = null;

  @JsonProperty("sling.servlet.methods")
  private ConfigNodePropertyString slingServletMethods = null;

  @JsonProperty("sling.servlet.selectors")
  private ConfigNodePropertyString slingServletSelectors = null;

  @JsonProperty("download.config")
  private ConfigNodePropertyString downloadConfig = null;

  @JsonProperty("view.selector")
  private ConfigNodePropertyString viewSelector = null;

  @JsonProperty("send_email")
  private ConfigNodePropertyBoolean sendEmail = null;

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

   /**
   * Get slingServletResourceTypes
   * @return slingServletResourceTypes
  **/
  @Valid
  public ConfigNodePropertyArray getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  public void setSlingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

   /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @Valid
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

   /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @Valid
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties downloadConfig(ConfigNodePropertyString downloadConfig) {
    this.downloadConfig = downloadConfig;
    return this;
  }

   /**
   * Get downloadConfig
   * @return downloadConfig
  **/
  @Valid
  public ConfigNodePropertyString getDownloadConfig() {
    return downloadConfig;
  }

  public void setDownloadConfig(ConfigNodePropertyString downloadConfig) {
    this.downloadConfig = downloadConfig;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties viewSelector(ConfigNodePropertyString viewSelector) {
    this.viewSelector = viewSelector;
    return this;
  }

   /**
   * Get viewSelector
   * @return viewSelector
  **/
  @Valid
  public ConfigNodePropertyString getViewSelector() {
    return viewSelector;
  }

  public void setViewSelector(ConfigNodePropertyString viewSelector) {
    this.viewSelector = viewSelector;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties sendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
    return this;
  }

   /**
   * Get sendEmail
   * @return sendEmail
  **/
  @Valid
  public ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }

  public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletResourceCollectionServletProperties comDayCqDamCoreImplServletResourceCollectionServletProperties = (ComDayCqDamCoreImplServletResourceCollectionServletProperties) o;
    return Objects.equals(slingServletResourceTypes, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletResourceTypes) &&
        Objects.equals(slingServletMethods, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletMethods) &&
        Objects.equals(slingServletSelectors, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletSelectors) &&
        Objects.equals(downloadConfig, comDayCqDamCoreImplServletResourceCollectionServletProperties.downloadConfig) &&
        Objects.equals(viewSelector, comDayCqDamCoreImplServletResourceCollectionServletProperties.viewSelector) &&
        Objects.equals(sendEmail, comDayCqDamCoreImplServletResourceCollectionServletProperties.sendEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletResourceTypes, slingServletMethods, slingServletSelectors, downloadConfig, viewSelector, sendEmail);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

