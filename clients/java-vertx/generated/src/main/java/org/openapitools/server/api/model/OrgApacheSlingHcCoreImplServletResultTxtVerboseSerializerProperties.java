package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties   {
  
  private ConfigNodePropertyInteger totalWidth = null;
  private ConfigNodePropertyInteger colWidthName = null;
  private ConfigNodePropertyInteger colWidthResult = null;
  private ConfigNodePropertyInteger colWidthTiming = null;

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties () {

  }

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties (ConfigNodePropertyInteger totalWidth, ConfigNodePropertyInteger colWidthName, ConfigNodePropertyInteger colWidthResult, ConfigNodePropertyInteger colWidthTiming) {
    this.totalWidth = totalWidth;
    this.colWidthName = colWidthName;
    this.colWidthResult = colWidthResult;
    this.colWidthTiming = colWidthTiming;
  }

    
  @JsonProperty("totalWidth")
  public ConfigNodePropertyInteger getTotalWidth() {
    return totalWidth;
  }
  public void setTotalWidth(ConfigNodePropertyInteger totalWidth) {
    this.totalWidth = totalWidth;
  }

    
  @JsonProperty("colWidthName")
  public ConfigNodePropertyInteger getColWidthName() {
    return colWidthName;
  }
  public void setColWidthName(ConfigNodePropertyInteger colWidthName) {
    this.colWidthName = colWidthName;
  }

    
  @JsonProperty("colWidthResult")
  public ConfigNodePropertyInteger getColWidthResult() {
    return colWidthResult;
  }
  public void setColWidthResult(ConfigNodePropertyInteger colWidthResult) {
    this.colWidthResult = colWidthResult;
  }

    
  @JsonProperty("colWidthTiming")
  public ConfigNodePropertyInteger getColWidthTiming() {
    return colWidthTiming;
  }
  public void setColWidthTiming(ConfigNodePropertyInteger colWidthTiming) {
    this.colWidthTiming = colWidthTiming;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties = (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties) o;
    return Objects.equals(totalWidth, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.totalWidth) &&
        Objects.equals(colWidthName, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthName) &&
        Objects.equals(colWidthResult, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthResult) &&
        Objects.equals(colWidthTiming, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthTiming);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalWidth, colWidthName, colWidthResult, colWidthTiming);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {\n");
    
    sb.append("    totalWidth: ").append(toIndentedString(totalWidth)).append("\n");
    sb.append("    colWidthName: ").append(toIndentedString(colWidthName)).append("\n");
    sb.append("    colWidthResult: ").append(toIndentedString(colWidthResult)).append("\n");
    sb.append("    colWidthTiming: ").append(toIndentedString(colWidthTiming)).append("\n");
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
