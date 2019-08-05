package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqCommonsImplExternalizerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqCommonsImplExternalizerImplProperties   {
  @JsonProperty("externalizer.domains")
  private ConfigNodePropertyArray externalizerDomains = null;

  @JsonProperty("externalizer.host")
  private ConfigNodePropertyString externalizerHost = null;

  @JsonProperty("externalizer.contextpath")
  private ConfigNodePropertyString externalizerContextpath = null;

  @JsonProperty("externalizer.encodedpath")
  private ConfigNodePropertyBoolean externalizerEncodedpath = null;

  public ComDayCqCommonsImplExternalizerImplProperties externalizerDomains(ConfigNodePropertyArray externalizerDomains) {
    this.externalizerDomains = externalizerDomains;
    return this;
  }

   /**
   * Get externalizerDomains
   * @return externalizerDomains
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getExternalizerDomains() {
    return externalizerDomains;
  }

  public void setExternalizerDomains(ConfigNodePropertyArray externalizerDomains) {
    this.externalizerDomains = externalizerDomains;
  }

  public ComDayCqCommonsImplExternalizerImplProperties externalizerHost(ConfigNodePropertyString externalizerHost) {
    this.externalizerHost = externalizerHost;
    return this;
  }

   /**
   * Get externalizerHost
   * @return externalizerHost
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getExternalizerHost() {
    return externalizerHost;
  }

  public void setExternalizerHost(ConfigNodePropertyString externalizerHost) {
    this.externalizerHost = externalizerHost;
  }

  public ComDayCqCommonsImplExternalizerImplProperties externalizerContextpath(ConfigNodePropertyString externalizerContextpath) {
    this.externalizerContextpath = externalizerContextpath;
    return this;
  }

   /**
   * Get externalizerContextpath
   * @return externalizerContextpath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getExternalizerContextpath() {
    return externalizerContextpath;
  }

  public void setExternalizerContextpath(ConfigNodePropertyString externalizerContextpath) {
    this.externalizerContextpath = externalizerContextpath;
  }

  public ComDayCqCommonsImplExternalizerImplProperties externalizerEncodedpath(ConfigNodePropertyBoolean externalizerEncodedpath) {
    this.externalizerEncodedpath = externalizerEncodedpath;
    return this;
  }

   /**
   * Get externalizerEncodedpath
   * @return externalizerEncodedpath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getExternalizerEncodedpath() {
    return externalizerEncodedpath;
  }

  public void setExternalizerEncodedpath(ConfigNodePropertyBoolean externalizerEncodedpath) {
    this.externalizerEncodedpath = externalizerEncodedpath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

