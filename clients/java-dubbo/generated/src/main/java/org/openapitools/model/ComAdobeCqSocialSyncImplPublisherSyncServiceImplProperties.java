package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("activeRunModes")
  private ConfigNodePropertyArray activeRunModes;

  /**
   * 
   * @return activeRunModes
   */
  public ConfigNodePropertyArray getActiveRunModes() {
    return activeRunModes;
  }

  public void setActiveRunModes(ConfigNodePropertyArray activeRunModes) {
    this.activeRunModes = activeRunModes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties = (ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties) o;
    return Objects.equals(this.activeRunModes, comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.activeRunModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeRunModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties {\n");
    
    sb.append("    activeRunModes: ").append(toIndentedString(activeRunModes)).append("\n");
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
