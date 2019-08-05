package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplServletCreateAssetServletProperties   {
  
  private ConfigNodePropertyBoolean detectDuplicate = null;

  public ComDayCqDamCoreImplServletCreateAssetServletProperties () {

  }

  public ComDayCqDamCoreImplServletCreateAssetServletProperties (ConfigNodePropertyBoolean detectDuplicate) {
    this.detectDuplicate = detectDuplicate;
  }

    
  @JsonProperty("detect_duplicate")
  public ConfigNodePropertyBoolean getDetectDuplicate() {
    return detectDuplicate;
  }
  public void setDetectDuplicate(ConfigNodePropertyBoolean detectDuplicate) {
    this.detectDuplicate = detectDuplicate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCreateAssetServletProperties comDayCqDamCoreImplServletCreateAssetServletProperties = (ComDayCqDamCoreImplServletCreateAssetServletProperties) o;
    return Objects.equals(detectDuplicate, comDayCqDamCoreImplServletCreateAssetServletProperties.detectDuplicate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectDuplicate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCreateAssetServletProperties {\n");
    
    sb.append("    detectDuplicate: ").append(toIndentedString(detectDuplicate)).append("\n");
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
