package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties   {
  @JsonProperty("xmp.filter.apply_whitelist")
  private ConfigNodePropertyBoolean xmpFilterApplyWhitelist = null;

  @JsonProperty("xmp.filter.whitelist")
  private ConfigNodePropertyArray xmpFilterWhitelist = null;

  @JsonProperty("xmp.filter.apply_blacklist")
  private ConfigNodePropertyBoolean xmpFilterApplyBlacklist = null;

  @JsonProperty("xmp.filter.blacklist")
  private ConfigNodePropertyArray xmpFilterBlacklist = null;

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterApplyWhitelist(ConfigNodePropertyBoolean xmpFilterApplyWhitelist) {
    this.xmpFilterApplyWhitelist = xmpFilterApplyWhitelist;
    return this;
  }

   /**
   * Get xmpFilterApplyWhitelist
   * @return xmpFilterApplyWhitelist
  **/
  @Valid
  public ConfigNodePropertyBoolean getXmpFilterApplyWhitelist() {
    return xmpFilterApplyWhitelist;
  }

  public void setXmpFilterApplyWhitelist(ConfigNodePropertyBoolean xmpFilterApplyWhitelist) {
    this.xmpFilterApplyWhitelist = xmpFilterApplyWhitelist;
  }

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterWhitelist(ConfigNodePropertyArray xmpFilterWhitelist) {
    this.xmpFilterWhitelist = xmpFilterWhitelist;
    return this;
  }

   /**
   * Get xmpFilterWhitelist
   * @return xmpFilterWhitelist
  **/
  @Valid
  public ConfigNodePropertyArray getXmpFilterWhitelist() {
    return xmpFilterWhitelist;
  }

  public void setXmpFilterWhitelist(ConfigNodePropertyArray xmpFilterWhitelist) {
    this.xmpFilterWhitelist = xmpFilterWhitelist;
  }

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterApplyBlacklist(ConfigNodePropertyBoolean xmpFilterApplyBlacklist) {
    this.xmpFilterApplyBlacklist = xmpFilterApplyBlacklist;
    return this;
  }

   /**
   * Get xmpFilterApplyBlacklist
   * @return xmpFilterApplyBlacklist
  **/
  @Valid
  public ConfigNodePropertyBoolean getXmpFilterApplyBlacklist() {
    return xmpFilterApplyBlacklist;
  }

  public void setXmpFilterApplyBlacklist(ConfigNodePropertyBoolean xmpFilterApplyBlacklist) {
    this.xmpFilterApplyBlacklist = xmpFilterApplyBlacklist;
  }

  public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties xmpFilterBlacklist(ConfigNodePropertyArray xmpFilterBlacklist) {
    this.xmpFilterBlacklist = xmpFilterBlacklist;
    return this;
  }

   /**
   * Get xmpFilterBlacklist
   * @return xmpFilterBlacklist
  **/
  @Valid
  public ConfigNodePropertyArray getXmpFilterBlacklist() {
    return xmpFilterBlacklist;
  }

  public void setXmpFilterBlacklist(ConfigNodePropertyArray xmpFilterBlacklist) {
    this.xmpFilterBlacklist = xmpFilterBlacklist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties = (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties) o;
    return Objects.equals(xmpFilterApplyWhitelist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterApplyWhitelist) &&
        Objects.equals(xmpFilterWhitelist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterWhitelist) &&
        Objects.equals(xmpFilterApplyBlacklist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterApplyBlacklist) &&
        Objects.equals(xmpFilterBlacklist, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.xmpFilterBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xmpFilterApplyWhitelist, xmpFilterWhitelist, xmpFilterApplyBlacklist, xmpFilterBlacklist);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties {\n");
    
    sb.append("    xmpFilterApplyWhitelist: ").append(toIndentedString(xmpFilterApplyWhitelist)).append("\n");
    sb.append("    xmpFilterWhitelist: ").append(toIndentedString(xmpFilterWhitelist)).append("\n");
    sb.append("    xmpFilterApplyBlacklist: ").append(toIndentedString(xmpFilterApplyBlacklist)).append("\n");
    sb.append("    xmpFilterBlacklist: ").append(toIndentedString(xmpFilterBlacklist)).append("\n");
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

