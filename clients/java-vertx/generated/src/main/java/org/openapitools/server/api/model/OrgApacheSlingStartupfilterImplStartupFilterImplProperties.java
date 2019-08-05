package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingStartupfilterImplStartupFilterImplProperties   {
  
  private ConfigNodePropertyBoolean activeByDefault = null;
  private ConfigNodePropertyString defaultMessage = null;

  public OrgApacheSlingStartupfilterImplStartupFilterImplProperties () {

  }

  public OrgApacheSlingStartupfilterImplStartupFilterImplProperties (ConfigNodePropertyBoolean activeByDefault, ConfigNodePropertyString defaultMessage) {
    this.activeByDefault = activeByDefault;
    this.defaultMessage = defaultMessage;
  }

    
  @JsonProperty("active.by.default")
  public ConfigNodePropertyBoolean getActiveByDefault() {
    return activeByDefault;
  }
  public void setActiveByDefault(ConfigNodePropertyBoolean activeByDefault) {
    this.activeByDefault = activeByDefault;
  }

    
  @JsonProperty("default.message")
  public ConfigNodePropertyString getDefaultMessage() {
    return defaultMessage;
  }
  public void setDefaultMessage(ConfigNodePropertyString defaultMessage) {
    this.defaultMessage = defaultMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingStartupfilterImplStartupFilterImplProperties orgApacheSlingStartupfilterImplStartupFilterImplProperties = (OrgApacheSlingStartupfilterImplStartupFilterImplProperties) o;
    return Objects.equals(activeByDefault, orgApacheSlingStartupfilterImplStartupFilterImplProperties.activeByDefault) &&
        Objects.equals(defaultMessage, orgApacheSlingStartupfilterImplStartupFilterImplProperties.defaultMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeByDefault, defaultMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingStartupfilterImplStartupFilterImplProperties {\n");
    
    sb.append("    activeByDefault: ").append(toIndentedString(activeByDefault)).append("\n");
    sb.append("    defaultMessage: ").append(toIndentedString(defaultMessage)).append("\n");
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
