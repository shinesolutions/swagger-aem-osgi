package apimodels;

import apimodels.ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo   {
  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("properties")
  private ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties properties = null;

  public ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
    public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo properties(ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Valid
  public ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties getProperties() {
    return properties;
  }

  public void setProperties(ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo comAdobeCqDamCfmImplContentRewriterParRangeFilterInfo = (ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo) o;
    return Objects.equals(pid, comAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.pid) &&
        Objects.equals(title, comAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.title) &&
        Objects.equals(description, comAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.description) &&
        Objects.equals(properties, comAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
