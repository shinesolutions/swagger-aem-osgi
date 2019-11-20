package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties   {
  @JsonProperty("wcmdevmodefilter.enabled")
  private ConfigNodePropertyBoolean wcmdevmodefilterEnabled = null;

  public ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties wcmdevmodefilterEnabled(ConfigNodePropertyBoolean wcmdevmodefilterEnabled) {
    this.wcmdevmodefilterEnabled = wcmdevmodefilterEnabled;
    return this;
  }

   /**
   * Get wcmdevmodefilterEnabled
   * @return wcmdevmodefilterEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getWcmdevmodefilterEnabled() {
    return wcmdevmodefilterEnabled;
  }

  public void setWcmdevmodefilterEnabled(ConfigNodePropertyBoolean wcmdevmodefilterEnabled) {
    this.wcmdevmodefilterEnabled = wcmdevmodefilterEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties comDayCqWcmCoreImplWCMDeveloperModeFilterProperties = (ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties) o;
    return Objects.equals(this.wcmdevmodefilterEnabled, comDayCqWcmCoreImplWCMDeveloperModeFilterProperties.wcmdevmodefilterEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wcmdevmodefilterEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties {\n");
    
    sb.append("    wcmdevmodefilterEnabled: ").append(toIndentedString(wcmdevmodefilterEnabled)).append("\n");
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
