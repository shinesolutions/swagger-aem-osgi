package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties   {
  
  private ConfigNodePropertyString processLabel = null;
  private ConfigNodePropertyBoolean extractPages = null;

  public ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties () {

  }

  public ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties (ConfigNodePropertyString processLabel, ConfigNodePropertyBoolean extractPages) {
    this.processLabel = processLabel;
    this.extractPages = extractPages;
  }

    
  @JsonProperty("process.label")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }
  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

    
  @JsonProperty("extract.pages")
  public ConfigNodePropertyBoolean getExtractPages() {
    return extractPages;
  }
  public void setExtractPages(ConfigNodePropertyBoolean extractPages) {
    this.extractPages = extractPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties comDayCqDamInddImplHandlerIndesignXMPHandlerProperties = (ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties) o;
    return Objects.equals(processLabel, comDayCqDamInddImplHandlerIndesignXMPHandlerProperties.processLabel) &&
        Objects.equals(extractPages, comDayCqDamInddImplHandlerIndesignXMPHandlerProperties.extractPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, extractPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties {\n");
    
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    extractPages: ").append(toIndentedString(extractPages)).append("\n");
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
