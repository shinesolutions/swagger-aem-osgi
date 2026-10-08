package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("dtm.staging.ip.whitelist")
  private ConfigNodePropertyArray dtmStagingIpWhitelist;

  @JsonProperty("dtm.production.ip.whitelist")
  private ConfigNodePropertyArray dtmProductionIpWhitelist;

  /**
   * 
   * @return dtmStagingIpWhitelist
   */
  public ConfigNodePropertyArray getDtmStagingIpWhitelist() {
    return dtmStagingIpWhitelist;
  }

  public void setDtmStagingIpWhitelist(ConfigNodePropertyArray dtmStagingIpWhitelist) {
    this.dtmStagingIpWhitelist = dtmStagingIpWhitelist;
  }

  /**
   * 
   * @return dtmProductionIpWhitelist
   */
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
    return Objects.equals(this.dtmStagingIpWhitelist, comAdobeCqDtmImplServletsDTMDeployHookServletProperties.dtmStagingIpWhitelist) &&
        Objects.equals(this.dtmProductionIpWhitelist, comAdobeCqDtmImplServletsDTMDeployHookServletProperties.dtmProductionIpWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtmStagingIpWhitelist, dtmProductionIpWhitelist);
  }

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
