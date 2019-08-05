package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties   {
  @JsonProperty("cugSupportedPaths")
  private ConfigNodePropertyArray cugSupportedPaths = null;

  @JsonProperty("cugEnabled")
  private ConfigNodePropertyBoolean cugEnabled = null;

  @JsonProperty("configurationRanking")
  private ConfigNodePropertyInteger configurationRanking = null;

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties cugSupportedPaths(ConfigNodePropertyArray cugSupportedPaths) {
    this.cugSupportedPaths = cugSupportedPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cugSupportedPaths")
  public ConfigNodePropertyArray getCugSupportedPaths() {
    return cugSupportedPaths;
  }
  public void setCugSupportedPaths(ConfigNodePropertyArray cugSupportedPaths) {
    this.cugSupportedPaths = cugSupportedPaths;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties cugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cugEnabled")
  public ConfigNodePropertyBoolean getCugEnabled() {
    return cugEnabled;
  }
  public void setCugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties configurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configurationRanking")
  public ConfigNodePropertyInteger getConfigurationRanking() {
    return configurationRanking;
  }
  public void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties = (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties) o;
    return Objects.equals(cugSupportedPaths, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.cugSupportedPaths) &&
        Objects.equals(cugEnabled, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.cugEnabled) &&
        Objects.equals(configurationRanking, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.configurationRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cugSupportedPaths, cugEnabled, configurationRanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties {\n");
    
    sb.append("    cugSupportedPaths: ").append(toIndentedString(cugSupportedPaths)).append("\n");
    sb.append("    cugEnabled: ").append(toIndentedString(cugEnabled)).append("\n");
    sb.append("    configurationRanking: ").append(toIndentedString(configurationRanking)).append("\n");
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

