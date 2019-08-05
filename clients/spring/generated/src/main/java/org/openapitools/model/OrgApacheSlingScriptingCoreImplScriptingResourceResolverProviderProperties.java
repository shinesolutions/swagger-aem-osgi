package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties   {
  @JsonProperty("log.stacktrace.onclose")
  private ConfigNodePropertyBoolean logStacktraceOnclose = null;

  public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties logStacktraceOnclose(ConfigNodePropertyBoolean logStacktraceOnclose) {
    this.logStacktraceOnclose = logStacktraceOnclose;
    return this;
  }

  /**
   * Get logStacktraceOnclose
   * @return logStacktraceOnclose
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getLogStacktraceOnclose() {
    return logStacktraceOnclose;
  }

  public void setLogStacktraceOnclose(ConfigNodePropertyBoolean logStacktraceOnclose) {
    this.logStacktraceOnclose = logStacktraceOnclose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties = (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties) o;
    return Objects.equals(this.logStacktraceOnclose, orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.logStacktraceOnclose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logStacktraceOnclose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties {\n");
    
    sb.append("    logStacktraceOnclose: ").append(toIndentedString(logStacktraceOnclose)).append("\n");
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

