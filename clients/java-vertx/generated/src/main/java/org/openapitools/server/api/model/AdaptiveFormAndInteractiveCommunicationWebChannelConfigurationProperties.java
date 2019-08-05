package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties   {
  
  private ConfigNodePropertyBoolean showPlaceholder = null;
  private ConfigNodePropertyInteger maximumCacheEntries = null;
  private ConfigNodePropertyDropDown afScriptingCompatversion = null;
  private ConfigNodePropertyBoolean makeFileNameUnique = null;
  private ConfigNodePropertyBoolean generatingCompliantData = null;

  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties () {

  }

  public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties (ConfigNodePropertyBoolean showPlaceholder, ConfigNodePropertyInteger maximumCacheEntries, ConfigNodePropertyDropDown afScriptingCompatversion, ConfigNodePropertyBoolean makeFileNameUnique, ConfigNodePropertyBoolean generatingCompliantData) {
    this.showPlaceholder = showPlaceholder;
    this.maximumCacheEntries = maximumCacheEntries;
    this.afScriptingCompatversion = afScriptingCompatversion;
    this.makeFileNameUnique = makeFileNameUnique;
    this.generatingCompliantData = generatingCompliantData;
  }

    
  @JsonProperty("showPlaceholder")
  public ConfigNodePropertyBoolean getShowPlaceholder() {
    return showPlaceholder;
  }
  public void setShowPlaceholder(ConfigNodePropertyBoolean showPlaceholder) {
    this.showPlaceholder = showPlaceholder;
  }

    
  @JsonProperty("maximumCacheEntries")
  public ConfigNodePropertyInteger getMaximumCacheEntries() {
    return maximumCacheEntries;
  }
  public void setMaximumCacheEntries(ConfigNodePropertyInteger maximumCacheEntries) {
    this.maximumCacheEntries = maximumCacheEntries;
  }

    
  @JsonProperty("af.scripting.compatversion")
  public ConfigNodePropertyDropDown getAfScriptingCompatversion() {
    return afScriptingCompatversion;
  }
  public void setAfScriptingCompatversion(ConfigNodePropertyDropDown afScriptingCompatversion) {
    this.afScriptingCompatversion = afScriptingCompatversion;
  }

    
  @JsonProperty("makeFileNameUnique")
  public ConfigNodePropertyBoolean getMakeFileNameUnique() {
    return makeFileNameUnique;
  }
  public void setMakeFileNameUnique(ConfigNodePropertyBoolean makeFileNameUnique) {
    this.makeFileNameUnique = makeFileNameUnique;
  }

    
  @JsonProperty("generatingCompliantData")
  public ConfigNodePropertyBoolean getGeneratingCompliantData() {
    return generatingCompliantData;
  }
  public void setGeneratingCompliantData(ConfigNodePropertyBoolean generatingCompliantData) {
    this.generatingCompliantData = generatingCompliantData;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
