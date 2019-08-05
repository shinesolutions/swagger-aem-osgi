package apimodels;

import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties   {
  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  @JsonProperty("tagpattern")
  private ConfigNodePropertyString tagpattern = null;

  @JsonProperty("component.resourceType")
  private ConfigNodePropertyString componentResourceType = null;

  public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties tagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
    return this;
  }

   /**
   * Get tagpattern
   * @return tagpattern
  **/
  @Valid
  public ConfigNodePropertyString getTagpattern() {
    return tagpattern;
  }

  public void setTagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
  }

  public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties componentResourceType(ConfigNodePropertyString componentResourceType) {
    this.componentResourceType = componentResourceType;
    return this;
  }

   /**
   * Get componentResourceType
   * @return componentResourceType
  **/
  @Valid
  public ConfigNodePropertyString getComponentResourceType() {
    return componentResourceType;
  }

  public void setComponentResourceType(ConfigNodePropertyString componentResourceType) {
    this.componentResourceType = componentResourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties = (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties) o;
    return Objects.equals(serviceRanking, comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.serviceRanking) &&
        Objects.equals(tagpattern, comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.tagpattern) &&
        Objects.equals(componentResourceType, comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.componentResourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern, componentResourceType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    tagpattern: ").append(toIndentedString(tagpattern)).append("\n");
    sb.append("    componentResourceType: ").append(toIndentedString(componentResourceType)).append("\n");
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

