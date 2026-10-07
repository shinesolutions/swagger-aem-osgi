package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString pageInfoProviderPropertyRegexDefault;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString pageInfoProviderPropertyName;
 /**
  * Get pageInfoProviderPropertyRegexDefault
  * @return pageInfoProviderPropertyRegexDefault
  */
  @JsonProperty("page.info.provider.property.regex.default")
  public ConfigNodePropertyString getPageInfoProviderPropertyRegexDefault() {
    return pageInfoProviderPropertyRegexDefault;
  }

  /**
   * Sets the <code>pageInfoProviderPropertyRegexDefault</code> property.
   */
 public void setPageInfoProviderPropertyRegexDefault(ConfigNodePropertyString pageInfoProviderPropertyRegexDefault) {
    this.pageInfoProviderPropertyRegexDefault = pageInfoProviderPropertyRegexDefault;
  }

  /**
   * Sets the <code>pageInfoProviderPropertyRegexDefault</code> property.
   */
  public ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties pageInfoProviderPropertyRegexDefault(ConfigNodePropertyString pageInfoProviderPropertyRegexDefault) {
    this.pageInfoProviderPropertyRegexDefault = pageInfoProviderPropertyRegexDefault;
    return this;
  }

 /**
  * Get pageInfoProviderPropertyName
  * @return pageInfoProviderPropertyName
  */
  @JsonProperty("page.info.provider.property.name")
  public ConfigNodePropertyString getPageInfoProviderPropertyName() {
    return pageInfoProviderPropertyName;
  }

  /**
   * Sets the <code>pageInfoProviderPropertyName</code> property.
   */
 public void setPageInfoProviderPropertyName(ConfigNodePropertyString pageInfoProviderPropertyName) {
    this.pageInfoProviderPropertyName = pageInfoProviderPropertyName;
  }

  /**
   * Sets the <code>pageInfoProviderPropertyName</code> property.
   */
  public ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties pageInfoProviderPropertyName(ConfigNodePropertyString pageInfoProviderPropertyName) {
    this.pageInfoProviderPropertyName = pageInfoProviderPropertyName;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties = (ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties) o;
    return Objects.equals(this.pageInfoProviderPropertyRegexDefault, comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.pageInfoProviderPropertyRegexDefault) &&
        Objects.equals(this.pageInfoProviderPropertyName, comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.pageInfoProviderPropertyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfoProviderPropertyRegexDefault, pageInfoProviderPropertyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties {\n");
    
    sb.append("    pageInfoProviderPropertyRegexDefault: ").append(toIndentedString(pageInfoProviderPropertyRegexDefault)).append("\n");
    sb.append("    pageInfoProviderPropertyName: ").append(toIndentedString(pageInfoProviderPropertyName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

