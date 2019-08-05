package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties   {
  

  private ConfigNodePropertyArray cugSupportedPaths = null;

  private ConfigNodePropertyBoolean cugEnabled = null;

  private ConfigNodePropertyInteger configurationRanking = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("configurationRanking")
  public ConfigNodePropertyInteger getConfigurationRanking() {
    return configurationRanking;
  }
  public void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

