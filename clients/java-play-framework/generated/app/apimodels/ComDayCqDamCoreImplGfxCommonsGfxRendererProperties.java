package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqDamCoreImplGfxCommonsGfxRendererProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties   {
  @JsonProperty("skip.bufferedcache")
  @Valid

  private ConfigNodePropertyBoolean skipBufferedcache;

  public ComDayCqDamCoreImplGfxCommonsGfxRendererProperties skipBufferedcache(ConfigNodePropertyBoolean skipBufferedcache) {
    this.skipBufferedcache = skipBufferedcache;
    return this;
  }

   /**
   * Get skipBufferedcache
   * @return skipBufferedcache
  **/
  public ConfigNodePropertyBoolean getSkipBufferedcache() {
    return skipBufferedcache;
  }

  public void setSkipBufferedcache(ConfigNodePropertyBoolean skipBufferedcache) {
    this.skipBufferedcache = skipBufferedcache;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplGfxCommonsGfxRendererProperties comDayCqDamCoreImplGfxCommonsGfxRendererProperties = (ComDayCqDamCoreImplGfxCommonsGfxRendererProperties) o;
    return Objects.equals(skipBufferedcache, comDayCqDamCoreImplGfxCommonsGfxRendererProperties.skipBufferedcache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipBufferedcache);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

