package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplDamChangeEventListenerProperties   {
  
  private ConfigNodePropertyArray changeeventlistenerObservedPaths = null;

  public ComDayCqDamCoreImplDamChangeEventListenerProperties () {

  }

  public ComDayCqDamCoreImplDamChangeEventListenerProperties (ConfigNodePropertyArray changeeventlistenerObservedPaths) {
    this.changeeventlistenerObservedPaths = changeeventlistenerObservedPaths;
  }

    
  @JsonProperty("changeeventlistener.observed.paths")
  public ConfigNodePropertyArray getChangeeventlistenerObservedPaths() {
    return changeeventlistenerObservedPaths;
  }
  public void setChangeeventlistenerObservedPaths(ConfigNodePropertyArray changeeventlistenerObservedPaths) {
    this.changeeventlistenerObservedPaths = changeeventlistenerObservedPaths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplDamChangeEventListenerProperties comDayCqDamCoreImplDamChangeEventListenerProperties = (ComDayCqDamCoreImplDamChangeEventListenerProperties) o;
    return Objects.equals(changeeventlistenerObservedPaths, comDayCqDamCoreImplDamChangeEventListenerProperties.changeeventlistenerObservedPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeeventlistenerObservedPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplDamChangeEventListenerProperties {\n");
    
    sb.append("    changeeventlistenerObservedPaths: ").append(toIndentedString(changeeventlistenerObservedPaths)).append("\n");
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
