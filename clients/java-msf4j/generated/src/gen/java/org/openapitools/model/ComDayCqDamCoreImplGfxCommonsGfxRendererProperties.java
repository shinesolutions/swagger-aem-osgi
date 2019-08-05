package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComDayCqDamCoreImplGfxCommonsGfxRendererProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties   {
  @JsonProperty("skip.bufferedcache")
  private ConfigNodePropertyBoolean skipBufferedcache = null;

  public ComDayCqDamCoreImplGfxCommonsGfxRendererProperties skipBufferedcache(ConfigNodePropertyBoolean skipBufferedcache) {
    this.skipBufferedcache = skipBufferedcache;
    return this;
  }

   /**
   * Get skipBufferedcache
   * @return skipBufferedcache
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSkipBufferedcache() {
    return skipBufferedcache;
  }

  public void setSkipBufferedcache(ConfigNodePropertyBoolean skipBufferedcache) {
    this.skipBufferedcache = skipBufferedcache;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplGfxCommonsGfxRendererProperties comDayCqDamCoreImplGfxCommonsGfxRendererProperties = (ComDayCqDamCoreImplGfxCommonsGfxRendererProperties) o;
    return Objects.equals(this.skipBufferedcache, comDayCqDamCoreImplGfxCommonsGfxRendererProperties.skipBufferedcache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipBufferedcache);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties {\n");
    
    sb.append("    skipBufferedcache: ").append(toIndentedString(skipBufferedcache)).append("\n");
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

