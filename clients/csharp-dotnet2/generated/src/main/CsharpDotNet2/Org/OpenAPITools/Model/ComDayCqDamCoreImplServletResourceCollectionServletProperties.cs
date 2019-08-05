using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class ComDayCqDamCoreImplServletResourceCollectionServletProperties {
    /// <summary>
    /// Gets or Sets SlingServletResourceTypes
    /// </summary>
    [DataMember(Name="sling.servlet.resourceTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.resourceTypes")]
    public ConfigNodePropertyArray SlingServletResourceTypes { get; set; }

    /// <summary>
    /// Gets or Sets SlingServletMethods
    /// </summary>
    [DataMember(Name="sling.servlet.methods", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.methods")]
    public ConfigNodePropertyString SlingServletMethods { get; set; }

    /// <summary>
    /// Gets or Sets SlingServletSelectors
    /// </summary>
    [DataMember(Name="sling.servlet.selectors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.selectors")]
    public ConfigNodePropertyString SlingServletSelectors { get; set; }

    /// <summary>
    /// Gets or Sets DownloadConfig
    /// </summary>
    [DataMember(Name="download.config", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "download.config")]
    public ConfigNodePropertyString DownloadConfig { get; set; }

    /// <summary>
    /// Gets or Sets ViewSelector
    /// </summary>
    [DataMember(Name="view.selector", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "view.selector")]
    public ConfigNodePropertyString ViewSelector { get; set; }

    /// <summary>
    /// Gets or Sets SendEmail
    /// </summary>
    [DataMember(Name="send_email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "send_email")]
    public ConfigNodePropertyBoolean SendEmail { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplServletResourceCollectionServletProperties {\n");
      sb.Append("  SlingServletResourceTypes: ").Append(SlingServletResourceTypes).Append("\n");
      sb.Append("  SlingServletMethods: ").Append(SlingServletMethods).Append("\n");
      sb.Append("  SlingServletSelectors: ").Append(SlingServletSelectors).Append("\n");
      sb.Append("  DownloadConfig: ").Append(DownloadConfig).Append("\n");
      sb.Append("  ViewSelector: ").Append(ViewSelector).Append("\n");
      sb.Append("  SendEmail: ").Append(SendEmail).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
