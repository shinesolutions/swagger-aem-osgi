package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamScene7ImplScene7APIClientImplProperties   {
  
  private ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageNofilterName = null;
  private ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageWithfilterName = null;

  public ComDayCqDamScene7ImplScene7APIClientImplProperties () {

  }

  public ComDayCqDamScene7ImplScene7APIClientImplProperties (ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageNofilterName, ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageWithfilterName) {
    this.cqDamScene7ApiclientRecordsperpageNofilterName = cqDamScene7ApiclientRecordsperpageNofilterName;
    this.cqDamScene7ApiclientRecordsperpageWithfilterName = cqDamScene7ApiclientRecordsperpageWithfilterName;
  }

    
  @JsonProperty("cq.dam.scene7.apiclient.recordsperpage.nofilter.name")
  public ConfigNodePropertyInteger getCqDamScene7ApiclientRecordsperpageNofilterName() {
    return cqDamScene7ApiclientRecordsperpageNofilterName;
  }
  public void setCqDamScene7ApiclientRecordsperpageNofilterName(ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageNofilterName) {
    this.cqDamScene7ApiclientRecordsperpageNofilterName = cqDamScene7ApiclientRecordsperpageNofilterName;
  }

    
  @JsonProperty("cq.dam.scene7.apiclient.recordsperpage.withfilter.name")
  public ConfigNodePropertyInteger getCqDamScene7ApiclientRecordsperpageWithfilterName() {
    return cqDamScene7ApiclientRecordsperpageWithfilterName;
  }
  public void setCqDamScene7ApiclientRecordsperpageWithfilterName(ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageWithfilterName) {
    this.cqDamScene7ApiclientRecordsperpageWithfilterName = cqDamScene7ApiclientRecordsperpageWithfilterName;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
