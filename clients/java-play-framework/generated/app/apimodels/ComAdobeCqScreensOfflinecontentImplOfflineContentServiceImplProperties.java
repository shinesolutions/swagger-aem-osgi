package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties   {
  @JsonProperty("disableSmartSync")
  @Valid

  private ConfigNodePropertyBoolean disableSmartSync;

  public ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties disableSmartSync(ConfigNodePropertyBoolean disableSmartSync) {
    this.disableSmartSync = disableSmartSync;
    return this;
  }

   /**
   * Get disableSmartSync
   * @return disableSmartSync
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

