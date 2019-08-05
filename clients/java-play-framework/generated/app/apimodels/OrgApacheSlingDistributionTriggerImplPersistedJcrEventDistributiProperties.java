package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("path")
  private ConfigNodePropertyString path = null;

  @JsonProperty("serviceName")
  private ConfigNodePropertyString serviceName = null;

  @JsonProperty("nuggetsPath")
  private ConfigNodePropertyString nuggetsPath = null;

  public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Valid
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Valid
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @Valid
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties nuggetsPath(ConfigNodePropertyString nuggetsPath) {
    this.nuggetsPath = nuggetsPath;
    return this;
  }

   /**
   * Get nuggetsPath
   * @return nuggetsPath
  **/
  @Valid
  public ConfigNodePropertyString getNuggetsPath() {
    return nuggetsPath;
  }

  public void setNuggetsPath(ConfigNodePropertyString nuggetsPath) {
    this.nuggetsPath = nuggetsPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties = (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.name) &&
        Objects.equals(path, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.path) &&
        Objects.equals(serviceName, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.serviceName) &&
        Objects.equals(nuggetsPath, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.nuggetsPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, serviceName, nuggetsPath);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    nuggetsPath: ").append(toIndentedString(nuggetsPath)).append("\n");
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

