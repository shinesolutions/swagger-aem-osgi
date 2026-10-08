package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeAemTransactionCoreImplTransactionRecorderProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeAemTransactionCoreImplTransactionRecorderProperties   {
  @JsonProperty("isTransactionRecordingEnabled")
  private ConfigNodePropertyBoolean isTransactionRecordingEnabled;

  public ComAdobeAemTransactionCoreImplTransactionRecorderProperties isTransactionRecordingEnabled(ConfigNodePropertyBoolean isTransactionRecordingEnabled) {
    this.isTransactionRecordingEnabled = isTransactionRecordingEnabled;
    return this;
  }

  /**
   * Get isTransactionRecordingEnabled
   * @return isTransactionRecordingEnabled
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getIsTransactionRecordingEnabled() {
    return isTransactionRecordingEnabled;
  }

  public void setIsTransactionRecordingEnabled(ConfigNodePropertyBoolean isTransactionRecordingEnabled) {
    this.isTransactionRecordingEnabled = isTransactionRecordingEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemTransactionCoreImplTransactionRecorderProperties comAdobeAemTransactionCoreImplTransactionRecorderProperties = (ComAdobeAemTransactionCoreImplTransactionRecorderProperties) o;
    return Objects.equals(this.isTransactionRecordingEnabled, comAdobeAemTransactionCoreImplTransactionRecorderProperties.isTransactionRecordingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTransactionRecordingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemTransactionCoreImplTransactionRecorderProperties {\n");
    
    sb.append("    isTransactionRecordingEnabled: ").append(toIndentedString(isTransactionRecordingEnabled)).append("\n");
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

