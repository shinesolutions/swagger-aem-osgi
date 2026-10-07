package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault;
 /**
  * Get liverelationshipmgrRelationsconfigDefault
  * @return liverelationshipmgrRelationsconfigDefault
  */
  @JsonProperty("liverelationshipmgr.relationsconfig.default")
  public ConfigNodePropertyString getLiverelationshipmgrRelationsconfigDefault() {
    return liverelationshipmgrRelationsconfigDefault;
  }

  /**
   * Sets the <code>liverelationshipmgrRelationsconfigDefault</code> property.
   */
 public void setLiverelationshipmgrRelationsconfigDefault(ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault) {
    this.liverelationshipmgrRelationsconfigDefault = liverelationshipmgrRelationsconfigDefault;
  }

  /**
   * Sets the <code>liverelationshipmgrRelationsconfigDefault</code> property.
   */
  public ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties liverelationshipmgrRelationsconfigDefault(ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault) {
    this.liverelationshipmgrRelationsconfigDefault = liverelationshipmgrRelationsconfigDefault;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties comDayCqWcmMsmImplLiveRelationshipManagerImplProperties = (ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties) o;
    return Objects.equals(this.liverelationshipmgrRelationsconfigDefault, comDayCqWcmMsmImplLiveRelationshipManagerImplProperties.liverelationshipmgrRelationsconfigDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liverelationshipmgrRelationsconfigDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties {\n");
    
    sb.append("    liverelationshipmgrRelationsconfigDefault: ").append(toIndentedString(liverelationshipmgrRelationsconfigDefault)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

