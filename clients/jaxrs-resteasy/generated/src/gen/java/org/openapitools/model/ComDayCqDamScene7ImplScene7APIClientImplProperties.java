package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqDamScene7ImplScene7APIClientImplProperties   {
  
  private ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageNofilterName = null;
  private ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageWithfilterName = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.scene7.apiclient.recordsperpage.nofilter.name")
  public ConfigNodePropertyInteger getCqDamScene7ApiclientRecordsperpageNofilterName() {
    return cqDamScene7ApiclientRecordsperpageNofilterName;
  }
  public void setCqDamScene7ApiclientRecordsperpageNofilterName(ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageNofilterName) {
    this.cqDamScene7ApiclientRecordsperpageNofilterName = cqDamScene7ApiclientRecordsperpageNofilterName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.scene7.apiclient.recordsperpage.withfilter.name")
  public ConfigNodePropertyInteger getCqDamScene7ApiclientRecordsperpageWithfilterName() {
    return cqDamScene7ApiclientRecordsperpageWithfilterName;
  }
  public void setCqDamScene7ApiclientRecordsperpageWithfilterName(ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageWithfilterName) {
    this.cqDamScene7ApiclientRecordsperpageWithfilterName = cqDamScene7ApiclientRecordsperpageWithfilterName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7APIClientImplProperties comDayCqDamScene7ImplScene7APIClientImplProperties = (ComDayCqDamScene7ImplScene7APIClientImplProperties) o;
    return Objects.equals(cqDamScene7ApiclientRecordsperpageNofilterName, comDayCqDamScene7ImplScene7APIClientImplProperties.cqDamScene7ApiclientRecordsperpageNofilterName) &&
        Objects.equals(cqDamScene7ApiclientRecordsperpageWithfilterName, comDayCqDamScene7ImplScene7APIClientImplProperties.cqDamScene7ApiclientRecordsperpageWithfilterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7ApiclientRecordsperpageNofilterName, cqDamScene7ApiclientRecordsperpageWithfilterName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7APIClientImplProperties {\n");
    
    sb.append("    cqDamScene7ApiclientRecordsperpageNofilterName: ").append(toIndentedString(cqDamScene7ApiclientRecordsperpageNofilterName)).append("\n");
    sb.append("    cqDamScene7ApiclientRecordsperpageWithfilterName: ").append(toIndentedString(cqDamScene7ApiclientRecordsperpageWithfilterName)).append("\n");
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

