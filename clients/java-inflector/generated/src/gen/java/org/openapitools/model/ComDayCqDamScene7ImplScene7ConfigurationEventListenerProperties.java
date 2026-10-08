package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties   {
  @JsonProperty("cq.dam.scene7.configurationeventlistener.enabled")
  private ConfigNodePropertyBoolean cqDamScene7ConfigurationeventlistenerEnabled;

  /**
   **/
  public ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties cqDamScene7ConfigurationeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7ConfigurationeventlistenerEnabled) {
    this.cqDamScene7ConfigurationeventlistenerEnabled = cqDamScene7ConfigurationeventlistenerEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

