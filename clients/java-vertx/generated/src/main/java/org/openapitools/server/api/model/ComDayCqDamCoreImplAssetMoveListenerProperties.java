package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplAssetMoveListenerProperties   {
  
  private ConfigNodePropertyBoolean enabled = null;

  public ComDayCqDamCoreImplAssetMoveListenerProperties () {

  }

  public ComDayCqDamCoreImplAssetMoveListenerProperties (ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

    
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplAssetMoveListenerProperties comDayCqDamCoreImplAssetMoveListenerProperties = (ComDayCqDamCoreImplAssetMoveListenerProperties) o;
    return Objects.equals(enabled, comDayCqDamCoreImplAssetMoveListenerProperties.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplAssetMoveListenerProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
