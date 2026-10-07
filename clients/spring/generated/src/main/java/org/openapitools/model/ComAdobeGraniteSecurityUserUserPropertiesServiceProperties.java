package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeGraniteSecurityUserUserPropertiesServiceProperties
 */

@JsonTypeName("comAdobeGraniteSecurityUserUserPropertiesServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString adapterCondition;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray graniteUserpropertiesNodetypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray graniteUserpropertiesResourcetypes;

  public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties adapterCondition(@Nullable ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
    return this;
  }

  /**
   * Get adapterCondition
   * @return adapterCondition
   */
  @Valid 
  @Schema(name = "adapter.condition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adapter.condition")
  public @Nullable ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }

  @JsonProperty("adapter.condition")
  public void setAdapterCondition(@Nullable ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

  public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties graniteUserpropertiesNodetypes(@Nullable ConfigNodePropertyArray graniteUserpropertiesNodetypes) {
    this.graniteUserpropertiesNodetypes = graniteUserpropertiesNodetypes;
    return this;
  }

  /**
   * Get graniteUserpropertiesNodetypes
   * @return graniteUserpropertiesNodetypes
   */
  @Valid 
  @Schema(name = "granite.userproperties.nodetypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.userproperties.nodetypes")
  public @Nullable ConfigNodePropertyArray getGraniteUserpropertiesNodetypes() {
    return graniteUserpropertiesNodetypes;
  }

  @JsonProperty("granite.userproperties.nodetypes")
  public void setGraniteUserpropertiesNodetypes(@Nullable ConfigNodePropertyArray graniteUserpropertiesNodetypes) {
    this.graniteUserpropertiesNodetypes = graniteUserpropertiesNodetypes;
  }

  public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties graniteUserpropertiesResourcetypes(@Nullable ConfigNodePropertyArray graniteUserpropertiesResourcetypes) {
    this.graniteUserpropertiesResourcetypes = graniteUserpropertiesResourcetypes;
    return this;
  }

  /**
   * Get graniteUserpropertiesResourcetypes
   * @return graniteUserpropertiesResourcetypes
   */
  @Valid 
  @Schema(name = "granite.userproperties.resourcetypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.userproperties.resourcetypes")
  public @Nullable ConfigNodePropertyArray getGraniteUserpropertiesResourcetypes() {
    return graniteUserpropertiesResourcetypes;
  }

  @JsonProperty("granite.userproperties.resourcetypes")
  public void setGraniteUserpropertiesResourcetypes(@Nullable ConfigNodePropertyArray graniteUserpropertiesResourcetypes) {
    this.graniteUserpropertiesResourcetypes = graniteUserpropertiesResourcetypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteSecurityUserUserPropertiesServiceProperties comAdobeGraniteSecurityUserUserPropertiesServiceProperties = (ComAdobeGraniteSecurityUserUserPropertiesServiceProperties) o;
    return Objects.equals(this.adapterCondition, comAdobeGraniteSecurityUserUserPropertiesServiceProperties.adapterCondition) &&
        Objects.equals(this.graniteUserpropertiesNodetypes, comAdobeGraniteSecurityUserUserPropertiesServiceProperties.graniteUserpropertiesNodetypes) &&
        Objects.equals(this.graniteUserpropertiesResourcetypes, comAdobeGraniteSecurityUserUserPropertiesServiceProperties.graniteUserpropertiesResourcetypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adapterCondition, graniteUserpropertiesNodetypes, graniteUserpropertiesResourcetypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {\n");
    sb.append("    adapterCondition: ").append(toIndentedString(adapterCondition)).append("\n");
    sb.append("    graniteUserpropertiesNodetypes: ").append(toIndentedString(graniteUserpropertiesNodetypes)).append("\n");
    sb.append("    graniteUserpropertiesResourcetypes: ").append(toIndentedString(graniteUserpropertiesResourcetypes)).append("\n");
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

