package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties   {
  
  private ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths = null;


  /**
   **/
  public ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties cqStoreListenerAdditionalStorePaths(ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths) {
    this.cqStoreListenerAdditionalStorePaths = cqStoreListenerAdditionalStorePaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.store.listener.additionalStorePaths")
  public ConfigNodePropertyArray getCqStoreListenerAdditionalStorePaths() {
    return cqStoreListenerAdditionalStorePaths;
  }
  public void setCqStoreListenerAdditionalStorePaths(ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths) {
    this.cqStoreListenerAdditionalStorePaths = cqStoreListenerAdditionalStorePaths;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties comDayCqAnalyticsImplStorePropertiesChangeListenerProperties = (ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties) o;
    return Objects.equals(cqStoreListenerAdditionalStorePaths, comDayCqAnalyticsImplStorePropertiesChangeListenerProperties.cqStoreListenerAdditionalStorePaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqStoreListenerAdditionalStorePaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties {\n");
    
    sb.append("    cqStoreListenerAdditionalStorePaths: ").append(toIndentedString(cqStoreListenerAdditionalStorePaths)).append("\n");
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

