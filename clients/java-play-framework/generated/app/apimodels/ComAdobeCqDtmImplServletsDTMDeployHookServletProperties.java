package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqDtmImplServletsDTMDeployHookServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties   {
  @JsonProperty("dtm.staging.ip.whitelist")
  @Valid

  private ConfigNodePropertyArray dtmStagingIpWhitelist;

  @JsonProperty("dtm.production.ip.whitelist")
  @Valid

  private ConfigNodePropertyArray dtmProductionIpWhitelist;

  public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties dtmStagingIpWhitelist(ConfigNodePropertyArray dtmStagingIpWhitelist) {
    this.dtmStagingIpWhitelist = dtmStagingIpWhitelist;
    return this;
  }

   /**
   * Get dtmStagingIpWhitelist
   * @return dtmStagingIpWhitelist
  **/
  public ConfigNodePropertyArray getDtmStagingIpWhitelist() {
    return dtmStagingIpWhitelist;
  }

  public void setDtmStagingIpWhitelist(ConfigNodePropertyArray dtmStagingIpWhitelist) {
    this.dtmStagingIpWhitelist = dtmStagingIpWhitelist;
  }

  public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties dtmProductionIpWhitelist(ConfigNodePropertyArray dtmProductionIpWhitelist) {
    this.dtmProductionIpWhitelist = dtmProductionIpWhitelist;
    return this;
  }

   /**
   * Get dtmProductionIpWhitelist
   * @return dtmProductionIpWhitelist
  **/
  public ConfigNodePropertyArray getDtmProductionIpWhitelist() {
    return dtmProductionIpWhitelist;
  }

  public void setDtmProductionIpWhitelist(ConfigNodePropertyArray dtmProductionIpWhitelist) {
    this.dtmProductionIpWhitelist = dtmProductionIpWhitelist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDtmImplServletsDTMDeployHookServletProperties comAdobeCqDtmImplServletsDTMDeployHookServletProperties = (ComAdobeCqDtmImplServletsDTMDeployHookServletProperties) o;
    return Objects.equals(dtmStagingIpWhitelist, comAdobeCqDtmImplServletsDTMDeployHookServletProperties.dtmStagingIpWhitelist) &&
        Objects.equals(dtmProductionIpWhitelist, comAdobeCqDtmImplServletsDTMDeployHookServletProperties.dtmProductionIpWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtmStagingIpWhitelist, dtmProductionIpWhitelist);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {\n");
    
    sb.append("    dtmStagingIpWhitelist: ").append(toIndentedString(dtmStagingIpWhitelist)).append("\n");
    sb.append("    dtmProductionIpWhitelist: ").append(toIndentedString(dtmProductionIpWhitelist)).append("\n");
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

