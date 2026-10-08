package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("granite:data")
  private ConfigNodePropertyArray graniteData;

  /**
   * 
   * @return graniteData
   */
  public ConfigNodePropertyArray getGraniteData() {
    return graniteData;
  }

  public void setGraniteData(ConfigNodePropertyArray graniteData) {
    this.graniteData = graniteData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties = (ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties) o;
    return Objects.equals(this.graniteData, comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.graniteData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graniteData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties {\n");
    
    sb.append("    graniteData: ").append(toIndentedString(graniteData)).append("\n");
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
