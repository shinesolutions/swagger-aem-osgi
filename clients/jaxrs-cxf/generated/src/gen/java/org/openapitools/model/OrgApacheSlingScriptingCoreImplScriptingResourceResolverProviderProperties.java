package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean logStacktraceOnclose = null;
 /**
   * Get logStacktraceOnclose
   * @return logStacktraceOnclose
  **/
  @JsonProperty("log.stacktrace.onclose")
  public ConfigNodePropertyBoolean getLogStacktraceOnclose() {
    return logStacktraceOnclose;
  }

  public void setLogStacktraceOnclose(ConfigNodePropertyBoolean logStacktraceOnclose) {
    this.logStacktraceOnclose = logStacktraceOnclose;
  }

  public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties logStacktraceOnclose(ConfigNodePropertyBoolean logStacktraceOnclose) {
    this.logStacktraceOnclose = logStacktraceOnclose;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

