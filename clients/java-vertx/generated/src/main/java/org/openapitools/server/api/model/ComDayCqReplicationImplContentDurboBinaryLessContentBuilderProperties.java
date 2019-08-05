package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties   {
  
  private ConfigNodePropertyInteger binaryThreshold = null;

  public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties () {

  }

  public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties (ConfigNodePropertyInteger binaryThreshold) {
    this.binaryThreshold = binaryThreshold;
  }

    
  @JsonProperty("binary.threshold")
  public ConfigNodePropertyInteger getBinaryThreshold() {
    return binaryThreshold;
  }
  public void setBinaryThreshold(ConfigNodePropertyInteger binaryThreshold) {
    this.binaryThreshold = binaryThreshold;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties comDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties = (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties) o;
    return Objects.equals(binaryThreshold, comDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.binaryThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties {\n");
    
    sb.append("    binaryThreshold: ").append(toIndentedString(binaryThreshold)).append("\n");
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
