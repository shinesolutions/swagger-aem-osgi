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
 * ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties   {
  @JsonProperty("cq.dam.s7dam.damchangeeventlistener.enabled")
  private ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled = null;

  public ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties cqDamS7damDamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled) {
    this.cqDamS7damDamchangeeventlistenerEnabled = cqDamS7damDamchangeeventlistenerEnabled;
    return this;
  }

   /**
   * Get cqDamS7damDamchangeeventlistenerEnabled
   * @return cqDamS7damDamchangeeventlistenerEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqDamS7damDamchangeeventlistenerEnabled() {
    return cqDamS7damDamchangeeventlistenerEnabled;
  }

  public void setCqDamS7damDamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled) {
    this.cqDamS7damDamchangeeventlistenerEnabled = cqDamS7damDamchangeeventlistenerEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties comDayCqDamS7damCommonS7damDamChangeEventListenerProperties = (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties) o;
    return Objects.equals(this.cqDamS7damDamchangeeventlistenerEnabled, comDayCqDamS7damCommonS7damDamChangeEventListenerProperties.cqDamS7damDamchangeeventlistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamS7damDamchangeeventlistenerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties {\n");
    
    sb.append("    cqDamS7damDamchangeeventlistenerEnabled: ").append(toIndentedString(cqDamS7damDamchangeeventlistenerEnabled)).append("\n");
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

