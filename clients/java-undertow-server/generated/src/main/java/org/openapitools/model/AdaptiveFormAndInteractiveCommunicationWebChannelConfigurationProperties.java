package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties   {
  
  private ConfigNodePropertyBoolean showPlaceholder = null;
  private ConfigNodePropertyInteger maximumCacheEntries = null;
  private ConfigNodePropertyDropDown afScriptingCompatversion = null;
  private ConfigNodePropertyBoolean makeFileNameUnique = null;
  private ConfigNodePropertyBoolean generatingCompliantData = null;

  /**
   **/
  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties showPlaceholder(ConfigNodePropertyBoolean showPlaceholder) {
    this.showPlaceholder = showPlaceholder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("showPlaceholder")
  public ConfigNodePropertyBoolean getShowPlaceholder() {
    return showPlaceholder;
  }
  public void setShowPlaceholder(ConfigNodePropertyBoolean showPlaceholder) {
    this.showPlaceholder = showPlaceholder;
  }

  /**
   **/
  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties maximumCacheEntries(ConfigNodePropertyInteger maximumCacheEntries) {
    this.maximumCacheEntries = maximumCacheEntries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maximumCacheEntries")
  public ConfigNodePropertyInteger getMaximumCacheEntries() {
    return maximumCacheEntries;
  }
  public void setMaximumCacheEntries(ConfigNodePropertyInteger maximumCacheEntries) {
    this.maximumCacheEntries = maximumCacheEntries;
  }

  /**
   **/
  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties afScriptingCompatversion(ConfigNodePropertyDropDown afScriptingCompatversion) {
    this.afScriptingCompatversion = afScriptingCompatversion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("af.scripting.compatversion")
  public ConfigNodePropertyDropDown getAfScriptingCompatversion() {
    return afScriptingCompatversion;
  }
  public void setAfScriptingCompatversion(ConfigNodePropertyDropDown afScriptingCompatversion) {
    this.afScriptingCompatversion = afScriptingCompatversion;
  }

  /**
   **/
  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties makeFileNameUnique(ConfigNodePropertyBoolean makeFileNameUnique) {
    this.makeFileNameUnique = makeFileNameUnique;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("makeFileNameUnique")
  public ConfigNodePropertyBoolean getMakeFileNameUnique() {
    return makeFileNameUnique;
  }
  public void setMakeFileNameUnique(ConfigNodePropertyBoolean makeFileNameUnique) {
    this.makeFileNameUnique = makeFileNameUnique;
  }

  /**
   **/
  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties generatingCompliantData(ConfigNodePropertyBoolean generatingCompliantData) {
    this.generatingCompliantData = generatingCompliantData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("generatingCompliantData")
  public ConfigNodePropertyBoolean getGeneratingCompliantData() {
    return generatingCompliantData;
  }
  public void setGeneratingCompliantData(ConfigNodePropertyBoolean generatingCompliantData) {
    this.generatingCompliantData = generatingCompliantData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties = (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties) o;
    return Objects.equals(showPlaceholder, adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.showPlaceholder) &&
        Objects.equals(maximumCacheEntries, adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.maximumCacheEntries) &&
        Objects.equals(afScriptingCompatversion, adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.afScriptingCompatversion) &&
        Objects.equals(makeFileNameUnique, adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.makeFileNameUnique) &&
        Objects.equals(generatingCompliantData, adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.generatingCompliantData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showPlaceholder, maximumCacheEntries, afScriptingCompatversion, makeFileNameUnique, generatingCompliantData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties {\n");
    
    sb.append("    showPlaceholder: ").append(toIndentedString(showPlaceholder)).append("\n");
    sb.append("    maximumCacheEntries: ").append(toIndentedString(maximumCacheEntries)).append("\n");
    sb.append("    afScriptingCompatversion: ").append(toIndentedString(afScriptingCompatversion)).append("\n");
    sb.append("    makeFileNameUnique: ").append(toIndentedString(makeFileNameUnique)).append("\n");
    sb.append("    generatingCompliantData: ").append(toIndentedString(generatingCompliantData)).append("\n");
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

