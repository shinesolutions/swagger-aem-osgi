package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties   {
  @JsonProperty("cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled")
  private ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled = null;

  public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties cqDamS7damDynamicmediaconfigeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled) {
    this.cqDamS7damDynamicmediaconfigeventlistenerEnabled = cqDamS7damDynamicmediaconfigeventlistenerEnabled;
    return this;
  }

  /**
   * Get cqDamS7damDynamicmediaconfigeventlistenerEnabled
   * @return cqDamS7damDynamicmediaconfigeventlistenerEnabled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getCqDamS7damDynamicmediaconfigeventlistenerEnabled() {
    return cqDamS7damDynamicmediaconfigeventlistenerEnabled;
  }

  public void setCqDamS7damDynamicmediaconfigeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDynamicmediaconfigeventlistenerEnabled) {
    this.cqDamS7damDynamicmediaconfigeventlistenerEnabled = cqDamS7damDynamicmediaconfigeventlistenerEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties = (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties) o;
    return Objects.equals(this.cqDamS7damDynamicmediaconfigeventlistenerEnabled, comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties.cqDamS7damDynamicmediaconfigeventlistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamS7damDynamicmediaconfigeventlistenerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {\n");
    
    sb.append("    cqDamS7damDynamicmediaconfigeventlistenerEnabled: ").append(toIndentedString(cqDamS7damDynamicmediaconfigeventlistenerEnabled)).append("\n");
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

