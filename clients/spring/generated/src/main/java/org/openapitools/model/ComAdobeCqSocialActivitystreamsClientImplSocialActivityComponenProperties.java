package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties   {
  @JsonProperty("priority")
  private ConfigNodePropertyInteger priority = null;

  public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties priority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getPriority() {
    return priority;
  }

  public void setPriority(ConfigNodePropertyInteger priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties = (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties) o;
    return Objects.equals(this.priority, comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

