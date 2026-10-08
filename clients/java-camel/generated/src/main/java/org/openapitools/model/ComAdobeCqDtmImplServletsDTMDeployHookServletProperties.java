package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqDtmImplServletsDTMDeployHookServletProperties
 */

@JsonTypeName("comAdobeCqDtmImplServletsDTMDeployHookServletProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {

  private ConfigNodePropertyArray dtmStagingIpWhitelist;

  private ConfigNodePropertyArray dtmProductionIpWhitelist;

  public ComAdobeCqDtmImplServletsDTMDeployHookServletProperties dtmStagingIpWhitelist(ConfigNodePropertyArray dtmStagingIpWhitelist) {
    this.dtmStagingIpWhitelist = dtmStagingIpWhitelist;
    return this;
  }

  /**
   * Get dtmStagingIpWhitelist
   * @return dtmStagingIpWhitelist
   */
  @Valid 
  @Schema(name = "dtm.staging.ip.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dtm.staging.ip.whitelist")
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
   */
  @Valid 
  @Schema(name = "dtm.production.ip.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dtm.production.ip.whitelist")
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

