package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties   {
  
  private ConfigNodePropertyBoolean disabled = null;

  public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties () {

  }

  public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties (ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
  }

    
  @JsonProperty("disabled")
  public ConfigNodePropertyBoolean getDisabled() {
    return disabled;
  }
  public void setDisabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties = (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties) o;
    return Objects.equals(disabled, comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties {\n");
    
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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
