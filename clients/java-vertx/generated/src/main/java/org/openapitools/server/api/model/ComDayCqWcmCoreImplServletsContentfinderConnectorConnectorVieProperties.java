package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties   {
  
  private ConfigNodePropertyArray itemResourceTypes = null;

  public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties () {

  }

  public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties (ConfigNodePropertyArray itemResourceTypes) {
    this.itemResourceTypes = itemResourceTypes;
  }

    
  @JsonProperty("item.resource.types")
  public ConfigNodePropertyArray getItemResourceTypes() {
    return itemResourceTypes;
  }
  public void setItemResourceTypes(ConfigNodePropertyArray itemResourceTypes) {
    this.itemResourceTypes = itemResourceTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties = (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties) o;
    return Objects.equals(itemResourceTypes, comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.itemResourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemResourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties {\n");
    
    sb.append("    itemResourceTypes: ").append(toIndentedString(itemResourceTypes)).append("\n");
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
