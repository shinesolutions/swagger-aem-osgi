package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqCommonsImplExternalizerImplProperties   {
  
  private ConfigNodePropertyArray externalizerDomains = null;
  private ConfigNodePropertyString externalizerHost = null;
  private ConfigNodePropertyString externalizerContextpath = null;
  private ConfigNodePropertyBoolean externalizerEncodedpath = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalizer.domains")
  public ConfigNodePropertyArray getExternalizerDomains() {
    return externalizerDomains;
  }
  public void setExternalizerDomains(ConfigNodePropertyArray externalizerDomains) {
    this.externalizerDomains = externalizerDomains;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalizer.host")
  public ConfigNodePropertyString getExternalizerHost() {
    return externalizerHost;
  }
  public void setExternalizerHost(ConfigNodePropertyString externalizerHost) {
    this.externalizerHost = externalizerHost;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalizer.contextpath")
  public ConfigNodePropertyString getExternalizerContextpath() {
    return externalizerContextpath;
  }
  public void setExternalizerContextpath(ConfigNodePropertyString externalizerContextpath) {
    this.externalizerContextpath = externalizerContextpath;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalizer.encodedpath")
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
    return Objects.equals(externalizerDomains, comDayCqCommonsImplExternalizerImplProperties.externalizerDomains) &&
        Objects.equals(externalizerHost, comDayCqCommonsImplExternalizerImplProperties.externalizerHost) &&
        Objects.equals(externalizerContextpath, comDayCqCommonsImplExternalizerImplProperties.externalizerContextpath) &&
        Objects.equals(externalizerEncodedpath, comDayCqCommonsImplExternalizerImplProperties.externalizerEncodedpath);
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

