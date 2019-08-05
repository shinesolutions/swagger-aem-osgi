package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties   {
  
  private ConfigNodePropertyBoolean mimeAllowEmpty = null;
  private ConfigNodePropertyArray mimeAllowed = null;

  public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties () {

  }

  public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties (ConfigNodePropertyBoolean mimeAllowEmpty, ConfigNodePropertyArray mimeAllowed) {
    this.mimeAllowEmpty = mimeAllowEmpty;
    this.mimeAllowed = mimeAllowed;
  }

    
  @JsonProperty("mime.allowEmpty")
  public ConfigNodePropertyBoolean getMimeAllowEmpty() {
    return mimeAllowEmpty;
  }
  public void setMimeAllowEmpty(ConfigNodePropertyBoolean mimeAllowEmpty) {
    this.mimeAllowEmpty = mimeAllowEmpty;
  }

    
  @JsonProperty("mime.allowed")
  public ConfigNodePropertyArray getMimeAllowed() {
    return mimeAllowed;
  }
  public void setMimeAllowed(ConfigNodePropertyArray mimeAllowed) {
    this.mimeAllowed = mimeAllowed;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
