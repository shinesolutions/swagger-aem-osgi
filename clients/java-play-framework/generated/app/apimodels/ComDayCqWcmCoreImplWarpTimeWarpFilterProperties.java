package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmCoreImplWarpTimeWarpFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties   {
  @JsonProperty("filter.order")
  private ConfigNodePropertyString filterOrder = null;

  @JsonProperty("filter.scope")
  private ConfigNodePropertyString filterScope = null;

  public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties filterOrder(ConfigNodePropertyString filterOrder) {
    this.filterOrder = filterOrder;
    return this;
  }

   /**
   * Get filterOrder
   * @return filterOrder
  **/
  @Valid
  public ConfigNodePropertyString getFilterOrder() {
    return filterOrder;
  }

  public void setFilterOrder(ConfigNodePropertyString filterOrder) {
    this.filterOrder = filterOrder;
  }

  public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties filterScope(ConfigNodePropertyString filterScope) {
    this.filterScope = filterScope;
    return this;
  }

   /**
   * Get filterScope
   * @return filterScope
  **/
  @Valid
  public ConfigNodePropertyString getFilterScope() {
    return filterScope;
  }

  public void setFilterScope(ConfigNodePropertyString filterScope) {
    this.filterScope = filterScope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplWarpTimeWarpFilterProperties comDayCqWcmCoreImplWarpTimeWarpFilterProperties = (ComDayCqWcmCoreImplWarpTimeWarpFilterProperties) o;
    return Objects.equals(filterOrder, comDayCqWcmCoreImplWarpTimeWarpFilterProperties.filterOrder) &&
        Objects.equals(filterScope, comDayCqWcmCoreImplWarpTimeWarpFilterProperties.filterScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterOrder, filterScope);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {\n");
    
    sb.append("    filterOrder: ").append(toIndentedString(filterOrder)).append("\n");
    sb.append("    filterScope: ").append(toIndentedString(filterScope)).append("\n");
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

