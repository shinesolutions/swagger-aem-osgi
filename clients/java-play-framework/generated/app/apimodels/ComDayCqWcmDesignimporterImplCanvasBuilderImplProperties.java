package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties   {
  @JsonProperty("filepattern")
  private ConfigNodePropertyString filepattern = null;

  @JsonProperty("build.page.nodes")
  private ConfigNodePropertyBoolean buildPageNodes = null;

  @JsonProperty("build.client.libs")
  private ConfigNodePropertyBoolean buildClientLibs = null;

  @JsonProperty("build.canvas.component")
  private ConfigNodePropertyBoolean buildCanvasComponent = null;

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties filepattern(ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
    return this;
  }

   /**
   * Get filepattern
   * @return filepattern
  **/
  @Valid
  public ConfigNodePropertyString getFilepattern() {
    return filepattern;
  }

  public void setFilepattern(ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
  }

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
    return this;
  }

   /**
   * Get buildPageNodes
   * @return buildPageNodes
  **/
  @Valid
  public ConfigNodePropertyBoolean getBuildPageNodes() {
    return buildPageNodes;
  }

  public void setBuildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
  }

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
    return this;
  }

   /**
   * Get buildClientLibs
   * @return buildClientLibs
  **/
  @Valid
  public ConfigNodePropertyBoolean getBuildClientLibs() {
    return buildClientLibs;
  }

  public void setBuildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
  }

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildCanvasComponent(ConfigNodePropertyBoolean buildCanvasComponent) {
    this.buildCanvasComponent = buildCanvasComponent;
    return this;
  }

   /**
   * Get buildCanvasComponent
   * @return buildCanvasComponent
  **/
  @Valid
  public ConfigNodePropertyBoolean getBuildCanvasComponent() {
    return buildCanvasComponent;
  }

  public void setBuildCanvasComponent(ConfigNodePropertyBoolean buildCanvasComponent) {
    this.buildCanvasComponent = buildCanvasComponent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties comDayCqWcmDesignimporterImplCanvasBuilderImplProperties = (ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties) o;
    return Objects.equals(filepattern, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.filepattern) &&
        Objects.equals(buildPageNodes, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.buildPageNodes) &&
        Objects.equals(buildClientLibs, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.buildClientLibs) &&
        Objects.equals(buildCanvasComponent, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.buildCanvasComponent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filepattern, buildPageNodes, buildClientLibs, buildCanvasComponent);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties {\n");
    
    sb.append("    filepattern: ").append(toIndentedString(filepattern)).append("\n");
    sb.append("    buildPageNodes: ").append(toIndentedString(buildPageNodes)).append("\n");
    sb.append("    buildClientLibs: ").append(toIndentedString(buildClientLibs)).append("\n");
    sb.append("    buildCanvasComponent: ").append(toIndentedString(buildCanvasComponent)).append("\n");
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

