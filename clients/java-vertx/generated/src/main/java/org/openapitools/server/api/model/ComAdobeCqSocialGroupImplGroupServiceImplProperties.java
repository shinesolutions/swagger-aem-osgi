package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialGroupImplGroupServiceImplProperties   {
  
  private ConfigNodePropertyInteger maxWaitTime = null;
  private ConfigNodePropertyInteger minWaitBetweenRetries = null;

  public ComAdobeCqSocialGroupImplGroupServiceImplProperties () {

  }

  public ComAdobeCqSocialGroupImplGroupServiceImplProperties (ConfigNodePropertyInteger maxWaitTime, ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.maxWaitTime = maxWaitTime;
    this.minWaitBetweenRetries = minWaitBetweenRetries;
  }

    
  @JsonProperty("maxWaitTime")
  public ConfigNodePropertyInteger getMaxWaitTime() {
    return maxWaitTime;
  }
  public void setMaxWaitTime(ConfigNodePropertyInteger maxWaitTime) {
    this.maxWaitTime = maxWaitTime;
  }

    
  @JsonProperty("minWaitBetweenRetries")
  public ConfigNodePropertyInteger getMinWaitBetweenRetries() {
    return minWaitBetweenRetries;
  }
  public void setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialGroupImplGroupServiceImplProperties comAdobeCqSocialGroupImplGroupServiceImplProperties = (ComAdobeCqSocialGroupImplGroupServiceImplProperties) o;
    return Objects.equals(maxWaitTime, comAdobeCqSocialGroupImplGroupServiceImplProperties.maxWaitTime) &&
        Objects.equals(minWaitBetweenRetries, comAdobeCqSocialGroupImplGroupServiceImplProperties.minWaitBetweenRetries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxWaitTime, minWaitBetweenRetries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialGroupImplGroupServiceImplProperties {\n");
    
    sb.append("    maxWaitTime: ").append(toIndentedString(maxWaitTime)).append("\n");
    sb.append("    minWaitBetweenRetries: ").append(toIndentedString(minWaitBetweenRetries)).append("\n");
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
