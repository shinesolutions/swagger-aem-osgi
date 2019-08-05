package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqCommonsImplExternalizerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

