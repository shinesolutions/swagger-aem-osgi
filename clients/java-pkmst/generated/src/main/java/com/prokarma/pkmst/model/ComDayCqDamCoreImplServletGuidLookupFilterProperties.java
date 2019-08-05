package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamCoreImplServletGuidLookupFilterProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqDamCoreImplServletGuidLookupFilterProperties   {
  @JsonProperty("cq.dam.core.guidlookupfilter.enabled")
  private ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled = null;

  public ComDayCqDamCoreImplServletGuidLookupFilterProperties cqDamCoreGuidlookupfilterEnabled(ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled) {
    this.cqDamCoreGuidlookupfilterEnabled = cqDamCoreGuidlookupfilterEnabled;
    return this;
  }

   /**
   * Get cqDamCoreGuidlookupfilterEnabled
   * @return cqDamCoreGuidlookupfilterEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqDamCoreGuidlookupfilterEnabled() {
    return cqDamCoreGuidlookupfilterEnabled;
  }

  public void setCqDamCoreGuidlookupfilterEnabled(ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled) {
    this.cqDamCoreGuidlookupfilterEnabled = cqDamCoreGuidlookupfilterEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletGuidLookupFilterProperties comDayCqDamCoreImplServletGuidLookupFilterProperties = (ComDayCqDamCoreImplServletGuidLookupFilterProperties) o;
    return Objects.equals(this.cqDamCoreGuidlookupfilterEnabled, comDayCqDamCoreImplServletGuidLookupFilterProperties.cqDamCoreGuidlookupfilterEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamCoreGuidlookupfilterEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletGuidLookupFilterProperties {\n");
    
    sb.append("    cqDamCoreGuidlookupfilterEnabled: ").append(toIndentedString(cqDamCoreGuidlookupfilterEnabled)).append("\n");
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

