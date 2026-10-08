package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheFelixJaasConfigurationFactoryProperties
 */

@JsonTypeName("orgApacheFelixJaasConfigurationFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixJaasConfigurationFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown jaasControlFlag;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger jaasRanking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jaasRealmName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jaasClassname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray jaasOptions;

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasControlFlag(@Nullable ConfigNodePropertyDropDown jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
    return this;
  }

  /**
   * Get jaasControlFlag
   * @return jaasControlFlag
   */
  @Valid 
  @Schema(name = "jaas.controlFlag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.controlFlag")
  public @Nullable ConfigNodePropertyDropDown getJaasControlFlag() {
    return jaasControlFlag;
  }

  @JsonProperty("jaas.controlFlag")
  public void setJaasControlFlag(@Nullable ConfigNodePropertyDropDown jaasControlFlag) {
    this.jaasControlFlag = jaasControlFlag;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasRanking(@Nullable ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
    return this;
  }

  /**
   * Get jaasRanking
   * @return jaasRanking
   */
  @Valid 
  @Schema(name = "jaas.ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.ranking")
  public @Nullable ConfigNodePropertyInteger getJaasRanking() {
    return jaasRanking;
  }

  @JsonProperty("jaas.ranking")
  public void setJaasRanking(@Nullable ConfigNodePropertyInteger jaasRanking) {
    this.jaasRanking = jaasRanking;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasRealmName(@Nullable ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
    return this;
  }

  /**
   * Get jaasRealmName
   * @return jaasRealmName
   */
  @Valid 
  @Schema(name = "jaas.realmName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.realmName")
  public @Nullable ConfigNodePropertyString getJaasRealmName() {
    return jaasRealmName;
  }

  @JsonProperty("jaas.realmName")
  public void setJaasRealmName(@Nullable ConfigNodePropertyString jaasRealmName) {
    this.jaasRealmName = jaasRealmName;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasClassname(@Nullable ConfigNodePropertyString jaasClassname) {
    this.jaasClassname = jaasClassname;
    return this;
  }

  /**
   * Get jaasClassname
   * @return jaasClassname
   */
  @Valid 
  @Schema(name = "jaas.classname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.classname")
  public @Nullable ConfigNodePropertyString getJaasClassname() {
    return jaasClassname;
  }

  @JsonProperty("jaas.classname")
  public void setJaasClassname(@Nullable ConfigNodePropertyString jaasClassname) {
    this.jaasClassname = jaasClassname;
  }

  public OrgApacheFelixJaasConfigurationFactoryProperties jaasOptions(@Nullable ConfigNodePropertyArray jaasOptions) {
    this.jaasOptions = jaasOptions;
    return this;
  }

  /**
   * Get jaasOptions
   * @return jaasOptions
   */
  @Valid 
  @Schema(name = "jaas.options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jaas.options")
  public @Nullable ConfigNodePropertyArray getJaasOptions() {
    return jaasOptions;
  }

  @JsonProperty("jaas.options")
  public void setJaasOptions(@Nullable ConfigNodePropertyArray jaasOptions) {
    this.jaasOptions = jaasOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixJaasConfigurationFactoryProperties orgApacheFelixJaasConfigurationFactoryProperties = (OrgApacheFelixJaasConfigurationFactoryProperties) o;
    return Objects.equals(this.jaasControlFlag, orgApacheFelixJaasConfigurationFactoryProperties.jaasControlFlag) &&
        Objects.equals(this.jaasRanking, orgApacheFelixJaasConfigurationFactoryProperties.jaasRanking) &&
        Objects.equals(this.jaasRealmName, orgApacheFelixJaasConfigurationFactoryProperties.jaasRealmName) &&
        Objects.equals(this.jaasClassname, orgApacheFelixJaasConfigurationFactoryProperties.jaasClassname) &&
        Objects.equals(this.jaasOptions, orgApacheFelixJaasConfigurationFactoryProperties.jaasOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jaasControlFlag, jaasRanking, jaasRealmName, jaasClassname, jaasOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixJaasConfigurationFactoryProperties {\n");
    sb.append("    jaasControlFlag: ").append(toIndentedString(jaasControlFlag)).append("\n");
    sb.append("    jaasRanking: ").append(toIndentedString(jaasRanking)).append("\n");
    sb.append("    jaasRealmName: ").append(toIndentedString(jaasRealmName)).append("\n");
    sb.append("    jaasClassname: ").append(toIndentedString(jaasClassname)).append("\n");
    sb.append("    jaasOptions: ").append(toIndentedString(jaasOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

