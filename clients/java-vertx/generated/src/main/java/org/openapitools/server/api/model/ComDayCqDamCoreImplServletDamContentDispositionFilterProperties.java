package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties   {
  
  private ConfigNodePropertyArray cqMimeTypeBlacklist = null;
  private ConfigNodePropertyBoolean cqDamEmptyMime = null;

  public ComDayCqDamCoreImplServletDamContentDispositionFilterProperties () {

  }

  public ComDayCqDamCoreImplServletDamContentDispositionFilterProperties (ConfigNodePropertyArray cqMimeTypeBlacklist, ConfigNodePropertyBoolean cqDamEmptyMime) {
    this.cqMimeTypeBlacklist = cqMimeTypeBlacklist;
    this.cqDamEmptyMime = cqDamEmptyMime;
  }

    
  @JsonProperty("cq.mime.type.blacklist")
  public ConfigNodePropertyArray getCqMimeTypeBlacklist() {
    return cqMimeTypeBlacklist;
  }
  public void setCqMimeTypeBlacklist(ConfigNodePropertyArray cqMimeTypeBlacklist) {
    this.cqMimeTypeBlacklist = cqMimeTypeBlacklist;
  }

    
  @JsonProperty("cq.dam.empty.mime")
  public ConfigNodePropertyBoolean getCqDamEmptyMime() {
    return cqDamEmptyMime;
  }
  public void setCqDamEmptyMime(ConfigNodePropertyBoolean cqDamEmptyMime) {
    this.cqDamEmptyMime = cqDamEmptyMime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletDamContentDispositionFilterProperties comDayCqDamCoreImplServletDamContentDispositionFilterProperties = (ComDayCqDamCoreImplServletDamContentDispositionFilterProperties) o;
    return Objects.equals(cqMimeTypeBlacklist, comDayCqDamCoreImplServletDamContentDispositionFilterProperties.cqMimeTypeBlacklist) &&
        Objects.equals(cqDamEmptyMime, comDayCqDamCoreImplServletDamContentDispositionFilterProperties.cqDamEmptyMime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqMimeTypeBlacklist, cqDamEmptyMime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties {\n");
    
    sb.append("    cqMimeTypeBlacklist: ").append(toIndentedString(cqMimeTypeBlacklist)).append("\n");
    sb.append("    cqDamEmptyMime: ").append(toIndentedString(cqDamEmptyMime)).append("\n");
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
