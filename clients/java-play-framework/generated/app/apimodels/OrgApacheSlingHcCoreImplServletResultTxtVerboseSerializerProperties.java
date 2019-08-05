package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties   {
  @JsonProperty("totalWidth")
  private ConfigNodePropertyInteger totalWidth = null;

  @JsonProperty("colWidthName")
  private ConfigNodePropertyInteger colWidthName = null;

  @JsonProperty("colWidthResult")
  private ConfigNodePropertyInteger colWidthResult = null;

  @JsonProperty("colWidthTiming")
  private ConfigNodePropertyInteger colWidthTiming = null;

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties totalWidth(ConfigNodePropertyInteger totalWidth) {
    this.totalWidth = totalWidth;
    return this;
  }

   /**
   * Get totalWidth
   * @return totalWidth
  **/
  @Valid
  public ConfigNodePropertyInteger getTotalWidth() {
    return totalWidth;
  }

  public void setTotalWidth(ConfigNodePropertyInteger totalWidth) {
    this.totalWidth = totalWidth;
  }

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthName(ConfigNodePropertyInteger colWidthName) {
    this.colWidthName = colWidthName;
    return this;
  }

   /**
   * Get colWidthName
   * @return colWidthName
  **/
  @Valid
  public ConfigNodePropertyInteger getColWidthName() {
    return colWidthName;
  }

  public void setColWidthName(ConfigNodePropertyInteger colWidthName) {
    this.colWidthName = colWidthName;
  }

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthResult(ConfigNodePropertyInteger colWidthResult) {
    this.colWidthResult = colWidthResult;
    return this;
  }

   /**
   * Get colWidthResult
   * @return colWidthResult
  **/
  @Valid
  public ConfigNodePropertyInteger getColWidthResult() {
    return colWidthResult;
  }

  public void setColWidthResult(ConfigNodePropertyInteger colWidthResult) {
    this.colWidthResult = colWidthResult;
  }

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthTiming(ConfigNodePropertyInteger colWidthTiming) {
    this.colWidthTiming = colWidthTiming;
    return this;
  }

   /**
   * Get colWidthTiming
   * @return colWidthTiming
  **/
  @Valid
  public ConfigNodePropertyInteger getColWidthTiming() {
    return colWidthTiming;
  }

  public void setColWidthTiming(ConfigNodePropertyInteger colWidthTiming) {
    this.colWidthTiming = colWidthTiming;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

