package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeAemTransactionCoreImplTransactionRecorderProperties   {
  
  private ConfigNodePropertyBoolean isTransactionRecordingEnabled = null;

  public ComAdobeAemTransactionCoreImplTransactionRecorderProperties () {

  }

  public ComAdobeAemTransactionCoreImplTransactionRecorderProperties (ConfigNodePropertyBoolean isTransactionRecordingEnabled) {
    this.isTransactionRecordingEnabled = isTransactionRecordingEnabled;
  }

    
  @JsonProperty("isTransactionRecordingEnabled")
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
    return Objects.equals(isTransactionRecordingEnabled, comAdobeAemTransactionCoreImplTransactionRecorderProperties.isTransactionRecordingEnabled);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
