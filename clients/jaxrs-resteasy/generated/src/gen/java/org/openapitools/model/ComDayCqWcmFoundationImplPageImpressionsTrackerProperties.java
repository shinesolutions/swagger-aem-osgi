package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties   {
  
  private ConfigNodePropertyString slingAuthRequirements = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.auth.requirements")
  public ConfigNodePropertyString getSlingAuthRequirements() {
    return slingAuthRequirements;
  }
  public void setSlingAuthRequirements(ConfigNodePropertyString slingAuthRequirements) {
    this.slingAuthRequirements = slingAuthRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationImplPageImpressionsTrackerProperties comDayCqWcmFoundationImplPageImpressionsTrackerProperties = (ComDayCqWcmFoundationImplPageImpressionsTrackerProperties) o;
    return Objects.equals(slingAuthRequirements, comDayCqWcmFoundationImplPageImpressionsTrackerProperties.slingAuthRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingAuthRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties {\n");
    
    sb.append("    slingAuthRequirements: ").append(toIndentedString(slingAuthRequirements)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

