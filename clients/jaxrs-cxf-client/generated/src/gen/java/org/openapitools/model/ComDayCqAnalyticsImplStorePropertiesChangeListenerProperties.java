package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths;
 /**
   * Get cqStoreListenerAdditionalStorePaths
   * @return cqStoreListenerAdditionalStorePaths
  **/
  @JsonProperty("cq.store.listener.additionalStorePaths")
  public ConfigNodePropertyArray getCqStoreListenerAdditionalStorePaths() {
    return cqStoreListenerAdditionalStorePaths;
  }

  public void setCqStoreListenerAdditionalStorePaths(ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths) {
    this.cqStoreListenerAdditionalStorePaths = cqStoreListenerAdditionalStorePaths;
  }

  public ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties cqStoreListenerAdditionalStorePaths(ConfigNodePropertyArray cqStoreListenerAdditionalStorePaths) {
    this.cqStoreListenerAdditionalStorePaths = cqStoreListenerAdditionalStorePaths;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties comDayCqAnalyticsImplStorePropertiesChangeListenerProperties = (ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties) o;
    return Objects.equals(this.cqStoreListenerAdditionalStorePaths, comDayCqAnalyticsImplStorePropertiesChangeListenerProperties.cqStoreListenerAdditionalStorePaths);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

