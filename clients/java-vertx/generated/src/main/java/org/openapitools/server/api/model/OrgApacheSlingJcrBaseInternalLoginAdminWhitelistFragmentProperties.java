package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties   {
  
  private ConfigNodePropertyString whitelistName = null;
  private ConfigNodePropertyArray whitelistBundles = null;

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties () {

  }

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties (ConfigNodePropertyString whitelistName, ConfigNodePropertyArray whitelistBundles) {
    this.whitelistName = whitelistName;
    this.whitelistBundles = whitelistBundles;
  }

    
  @JsonProperty("whitelist.name")
  public ConfigNodePropertyString getWhitelistName() {
    return whitelistName;
  }
  public void setWhitelistName(ConfigNodePropertyString whitelistName) {
    this.whitelistName = whitelistName;
  }

    
  @JsonProperty("whitelist.bundles")
  public ConfigNodePropertyArray getWhitelistBundles() {
    return whitelistBundles;
  }
  public void setWhitelistBundles(ConfigNodePropertyArray whitelistBundles) {
    this.whitelistBundles = whitelistBundles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties = (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties) o;
    return Objects.equals(whitelistName, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.whitelistName) &&
        Objects.equals(whitelistBundles, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.whitelistBundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whitelistName, whitelistBundles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties {\n");
    
    sb.append("    whitelistName: ").append(toIndentedString(whitelistName)).append("\n");
    sb.append("    whitelistBundles: ").append(toIndentedString(whitelistBundles)).append("\n");
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
