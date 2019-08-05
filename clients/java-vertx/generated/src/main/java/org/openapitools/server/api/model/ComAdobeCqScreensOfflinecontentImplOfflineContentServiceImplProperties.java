package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties   {
  
  private ConfigNodePropertyBoolean disableSmartSync = null;

  public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties () {

  }

  public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties (ConfigNodePropertyBoolean disableSmartSync) {
    this.disableSmartSync = disableSmartSync;
  }

    
  @JsonProperty("disableSmartSync")
  public ConfigNodePropertyBoolean getDisableSmartSync() {
    return disableSmartSync;
  }
  public void setDisableSmartSync(ConfigNodePropertyBoolean disableSmartSync) {
    this.disableSmartSync = disableSmartSync;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties = (ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties) o;
    return Objects.equals(disableSmartSync, comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.disableSmartSync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableSmartSync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties {\n");
    
    sb.append("    disableSmartSync: ").append(toIndentedString(disableSmartSync)).append("\n");
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
