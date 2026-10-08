package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqCommonsImplExternalizerImplProperties   {
  @JsonProperty("externalizer.domains")
  private ConfigNodePropertyArray externalizerDomains;

  @JsonProperty("externalizer.host")
  private ConfigNodePropertyString externalizerHost;

  @JsonProperty("externalizer.contextpath")
  private ConfigNodePropertyString externalizerContextpath;

  @JsonProperty("externalizer.encodedpath")
  private ConfigNodePropertyBoolean externalizerEncodedpath;

  /**
   **/
  public ComDayCqCommonsImplExternalizerImplProperties externalizerDomains(ConfigNodePropertyArray externalizerDomains) {
    this.externalizerDomains = externalizerDomains;
    return this;
  }

  
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
  public ComDayCqCommonsImplExternalizerImplProperties externalizerHost(ConfigNodePropertyString externalizerHost) {
    this.externalizerHost = externalizerHost;
    return this;
  }

  
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
  public ComDayCqCommonsImplExternalizerImplProperties externalizerContextpath(ConfigNodePropertyString externalizerContextpath) {
    this.externalizerContextpath = externalizerContextpath;
    return this;
  }

  
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
  public ComDayCqCommonsImplExternalizerImplProperties externalizerEncodedpath(ConfigNodePropertyBoolean externalizerEncodedpath) {
    this.externalizerEncodedpath = externalizerEncodedpath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("externalizer.encodedpath")
  public ConfigNodePropertyBoolean getExternalizerEncodedpath() {
    return externalizerEncodedpath;
  }
  public void setExternalizerEncodedpath(ConfigNodePropertyBoolean externalizerEncodedpath) {
    this.externalizerEncodedpath = externalizerEncodedpath;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

