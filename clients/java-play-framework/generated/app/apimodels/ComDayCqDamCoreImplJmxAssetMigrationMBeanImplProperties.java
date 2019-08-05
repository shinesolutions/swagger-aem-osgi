package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties   {
  @JsonProperty("jmx.objectname")
  private ConfigNodePropertyString jmxObjectname = null;

  public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties jmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
    return this;
  }

   /**
   * Get jmxObjectname
   * @return jmxObjectname
  **/
  @Valid
  public ConfigNodePropertyString getJmxObjectname() {
    return jmxObjectname;
  }

  public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties = (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties) o;
    return Objects.equals(jmxObjectname, comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.jmxObjectname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jmxObjectname);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties {\n");
    
    sb.append("    jmxObjectname: ").append(toIndentedString(jmxObjectname)).append("\n");
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

