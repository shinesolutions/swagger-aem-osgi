package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties   {
  
  private ConfigNodePropertyBoolean enable = null;
  private ConfigNodePropertyInteger ttl1 = null;
  private ConfigNodePropertyInteger ttl2 = null;

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties () {

  }

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties (ConfigNodePropertyBoolean enable, ConfigNodePropertyInteger ttl1, ConfigNodePropertyInteger ttl2) {
    this.enable = enable;
    this.ttl1 = ttl1;
    this.ttl2 = ttl2;
  }

    
  @JsonProperty("enable")
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }
  public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

    
  @JsonProperty("ttl1")
  public ConfigNodePropertyInteger getTtl1() {
    return ttl1;
  }
  public void setTtl1(ConfigNodePropertyInteger ttl1) {
    this.ttl1 = ttl1;
  }

    
  @JsonProperty("ttl2")
  public ConfigNodePropertyInteger getTtl2() {
    return ttl2;
  }
  public void setTtl2(ConfigNodePropertyInteger ttl2) {
    this.ttl2 = ttl2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties = (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties) o;
    return Objects.equals(enable, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.enable) &&
        Objects.equals(ttl1, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.ttl1) &&
        Objects.equals(ttl2, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.ttl2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, ttl1, ttl2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    ttl1: ").append(toIndentedString(ttl1)).append("\n");
    sb.append("    ttl2: ").append(toIndentedString(ttl2)).append("\n");
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
