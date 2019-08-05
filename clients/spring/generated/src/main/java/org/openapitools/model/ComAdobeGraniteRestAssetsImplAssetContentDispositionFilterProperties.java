package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties   {
  @JsonProperty("mime.allowEmpty")
  private ConfigNodePropertyBoolean mimeAllowEmpty = null;

  @JsonProperty("mime.allowed")
  private ConfigNodePropertyArray mimeAllowed = null;

  public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties mimeAllowEmpty(ConfigNodePropertyBoolean mimeAllowEmpty) {
    this.mimeAllowEmpty = mimeAllowEmpty;
    return this;
  }

  /**
   * Get mimeAllowEmpty
   * @return mimeAllowEmpty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getMimeAllowEmpty() {
    return mimeAllowEmpty;
  }

  public void setMimeAllowEmpty(ConfigNodePropertyBoolean mimeAllowEmpty) {
    this.mimeAllowEmpty = mimeAllowEmpty;
  }

  public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties mimeAllowed(ConfigNodePropertyArray mimeAllowed) {
    this.mimeAllowed = mimeAllowed;
    return this;
  }

  /**
   * Get mimeAllowed
   * @return mimeAllowed
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getMimeAllowed() {
    return mimeAllowed;
  }

  public void setMimeAllowed(ConfigNodePropertyArray mimeAllowed) {
    this.mimeAllowed = mimeAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties = (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties) o;
    return Objects.equals(this.mimeAllowEmpty, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.mimeAllowEmpty) &&
        Objects.equals(this.mimeAllowed, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.mimeAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeAllowEmpty, mimeAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {\n");
    
    sb.append("    mimeAllowEmpty: ").append(toIndentedString(mimeAllowEmpty)).append("\n");
    sb.append("    mimeAllowed: ").append(toIndentedString(mimeAllowed)).append("\n");
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

