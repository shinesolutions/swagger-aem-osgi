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
  public class ComDayCqWcmFoundationFormsImplMailServletProperties {
    /// <summary>
    /// Gets or Sets SlingServletResourceTypes
    /// </summary>
    [DataMember(Name="sling.servlet.resourceTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.resourceTypes")]
    public ConfigNodePropertyString SlingServletResourceTypes { get; set; }

    /// <summary>
    /// Gets or Sets SlingServletSelectors
    /// </summary>
    [DataMember(Name="sling.servlet.selectors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.selectors")]
    public ConfigNodePropertyString SlingServletSelectors { get; set; }

    /// <summary>
    /// Gets or Sets ResourceWhitelist
    /// </summary>
    [DataMember(Name="resource.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.whitelist")]
    public ConfigNodePropertyArray ResourceWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets ResourceBlacklist
    /// </summary>
    [DataMember(Name="resource.blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.blacklist")]
    public ConfigNodePropertyString ResourceBlacklist { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmFoundationFormsImplMailServletProperties {\n");
      sb.Append("  SlingServletResourceTypes: ").Append(SlingServletResourceTypes).Append("\n");
      sb.Append("  SlingServletSelectors: ").Append(SlingServletSelectors).Append("\n");
      sb.Append("  ResourceWhitelist: ").Append(ResourceWhitelist).Append("\n");
      sb.Append("  ResourceBlacklist: ").Append(ResourceBlacklist).Append("\n");
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
