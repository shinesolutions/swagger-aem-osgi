package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties   {
  
  private @Valid ConfigNodePropertyBoolean mimeAllowEmpty = null;
  private @Valid ConfigNodePropertyArray mimeAllowed = null;

  /**
   **/
  public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties mimeAllowEmpty(ConfigNodePropertyBoolean mimeAllowEmpty) {
    this.mimeAllowEmpty = mimeAllowEmpty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mime.allowEmpty")
  public ConfigNodePropertyBoolean getMimeAllowEmpty() {
    return mimeAllowEmpty;
  }
  public void setMimeAllowEmpty(ConfigNodePropertyBoolean mimeAllowEmpty) {
    this.mimeAllowEmpty = mimeAllowEmpty;
  }

  /**
   **/
  public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties mimeAllowed(ConfigNodePropertyArray mimeAllowed) {
    this.mimeAllowed = mimeAllowed;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mime.allowed")
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
    return Objects.equals(mimeAllowEmpty, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.mimeAllowEmpty) &&
        Objects.equals(mimeAllowed, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.mimeAllowed);
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

