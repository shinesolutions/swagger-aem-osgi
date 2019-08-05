package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties   {
  
  private ConfigNodePropertyBoolean cqDamScene7ConfigurationeventlistenerEnabled = null;

  public ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties () {

  }

  public ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties (ConfigNodePropertyBoolean cqDamScene7ConfigurationeventlistenerEnabled) {
    this.cqDamScene7ConfigurationeventlistenerEnabled = cqDamScene7ConfigurationeventlistenerEnabled;
  }

    
  @JsonProperty("cq.dam.scene7.configurationeventlistener.enabled")
  public ConfigNodePropertyBoolean getCqDamScene7ConfigurationeventlistenerEnabled() {
    return cqDamScene7ConfigurationeventlistenerEnabled;
  }
  public void setCqDamScene7ConfigurationeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7ConfigurationeventlistenerEnabled) {
    this.cqDamScene7ConfigurationeventlistenerEnabled = cqDamScene7ConfigurationeventlistenerEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties = (ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties) o;
    return Objects.equals(cqDamScene7ConfigurationeventlistenerEnabled, comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.cqDamScene7ConfigurationeventlistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7ConfigurationeventlistenerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties {\n");
    
    sb.append("    cqDamScene7ConfigurationeventlistenerEnabled: ").append(toIndentedString(cqDamScene7ConfigurationeventlistenerEnabled)).append("\n");
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
