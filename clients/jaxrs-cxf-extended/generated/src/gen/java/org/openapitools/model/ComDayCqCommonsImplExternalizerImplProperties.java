package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqCommonsImplExternalizerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray externalizerDomains;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString externalizerHost;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString externalizerContextpath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean externalizerEncodedpath;
 /**
  * Get externalizerDomains
  * @return externalizerDomains
  */
  @JsonProperty("externalizer.domains")
  public ConfigNodePropertyArray getExternalizerDomains() {
    return externalizerDomains;
  }

  /**
   * Sets the <code>externalizerDomains</code> property.
   */
 public void setExternalizerDomains(ConfigNodePropertyArray externalizerDomains) {
    this.externalizerDomains = externalizerDomains;
  }

  /**
   * Sets the <code>externalizerDomains</code> property.
   */
  public ComDayCqCommonsImplExternalizerImplProperties externalizerDomains(ConfigNodePropertyArray externalizerDomains) {
    this.externalizerDomains = externalizerDomains;
    return this;
  }

 /**
  * Get externalizerHost
  * @return externalizerHost
  */
  @JsonProperty("externalizer.host")
  public ConfigNodePropertyString getExternalizerHost() {
    return externalizerHost;
  }

  /**
   * Sets the <code>externalizerHost</code> property.
   */
 public void setExternalizerHost(ConfigNodePropertyString externalizerHost) {
    this.externalizerHost = externalizerHost;
  }

  /**
   * Sets the <code>externalizerHost</code> property.
   */
  public ComDayCqCommonsImplExternalizerImplProperties externalizerHost(ConfigNodePropertyString externalizerHost) {
    this.externalizerHost = externalizerHost;
    return this;
  }

 /**
  * Get externalizerContextpath
  * @return externalizerContextpath
  */
  @JsonProperty("externalizer.contextpath")
  public ConfigNodePropertyString getExternalizerContextpath() {
    return externalizerContextpath;
  }

  /**
   * Sets the <code>externalizerContextpath</code> property.
   */
 public void setExternalizerContextpath(ConfigNodePropertyString externalizerContextpath) {
    this.externalizerContextpath = externalizerContextpath;
  }

  /**
   * Sets the <code>externalizerContextpath</code> property.
   */
  public ComDayCqCommonsImplExternalizerImplProperties externalizerContextpath(ConfigNodePropertyString externalizerContextpath) {
    this.externalizerContextpath = externalizerContextpath;
    return this;
  }

 /**
  * Get externalizerEncodedpath
  * @return externalizerEncodedpath
  */
  @JsonProperty("externalizer.encodedpath")
  public ConfigNodePropertyBoolean getExternalizerEncodedpath() {
    return externalizerEncodedpath;
  }

  /**
   * Sets the <code>externalizerEncodedpath</code> property.
   */
 public void setExternalizerEncodedpath(ConfigNodePropertyBoolean externalizerEncodedpath) {
    this.externalizerEncodedpath = externalizerEncodedpath;
  }

  /**
   * Sets the <code>externalizerEncodedpath</code> property.
   */
  public ComDayCqCommonsImplExternalizerImplProperties externalizerEncodedpath(ConfigNodePropertyBoolean externalizerEncodedpath) {
    this.externalizerEncodedpath = externalizerEncodedpath;
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
    ComDayCqCommonsImplExternalizerImplProperties comDayCqCommonsImplExternalizerImplProperties = (ComDayCqCommonsImplExternalizerImplProperties) o;
    return Objects.equals(this.externalizerDomains, comDayCqCommonsImplExternalizerImplProperties.externalizerDomains) &&
        Objects.equals(this.externalizerHost, comDayCqCommonsImplExternalizerImplProperties.externalizerHost) &&
        Objects.equals(this.externalizerContextpath, comDayCqCommonsImplExternalizerImplProperties.externalizerContextpath) &&
        Objects.equals(this.externalizerEncodedpath, comDayCqCommonsImplExternalizerImplProperties.externalizerEncodedpath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalizerDomains, externalizerHost, externalizerContextpath, externalizerEncodedpath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqCommonsImplExternalizerImplProperties {\n");
    
    sb.append("    externalizerDomains: ").append(toIndentedString(externalizerDomains)).append("\n");
    sb.append("    externalizerHost: ").append(toIndentedString(externalizerHost)).append("\n");
    sb.append("    externalizerContextpath: ").append(toIndentedString(externalizerContextpath)).append("\n");
    sb.append("    externalizerEncodedpath: ").append(toIndentedString(externalizerEncodedpath)).append("\n");
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

