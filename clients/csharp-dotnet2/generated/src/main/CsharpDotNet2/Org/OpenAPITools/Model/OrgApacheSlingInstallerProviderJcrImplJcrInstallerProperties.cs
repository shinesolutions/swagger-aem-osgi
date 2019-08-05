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
  public class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties {
    /// <summary>
    /// Gets or Sets HandlerSchemes
    /// </summary>
    [DataMember(Name="handler.schemes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "handler.schemes")]
    public ConfigNodePropertyArray HandlerSchemes { get; set; }

    /// <summary>
    /// Gets or Sets SlingJcrinstallFolderNameRegexp
    /// </summary>
    [DataMember(Name="sling.jcrinstall.folder.name.regexp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.jcrinstall.folder.name.regexp")]
    public ConfigNodePropertyString SlingJcrinstallFolderNameRegexp { get; set; }

    /// <summary>
    /// Gets or Sets SlingJcrinstallFolderMaxDepth
    /// </summary>
    [DataMember(Name="sling.jcrinstall.folder.max.depth", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.jcrinstall.folder.max.depth")]
    public ConfigNodePropertyInteger SlingJcrinstallFolderMaxDepth { get; set; }

    /// <summary>
    /// Gets or Sets SlingJcrinstallSearchPath
    /// </summary>
    [DataMember(Name="sling.jcrinstall.search.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.jcrinstall.search.path")]
    public ConfigNodePropertyArray SlingJcrinstallSearchPath { get; set; }

    /// <summary>
    /// Gets or Sets SlingJcrinstallNewConfigPath
    /// </summary>
    [DataMember(Name="sling.jcrinstall.new.config.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.jcrinstall.new.config.path")]
    public ConfigNodePropertyString SlingJcrinstallNewConfigPath { get; set; }

    /// <summary>
    /// Gets or Sets SlingJcrinstallSignalPath
    /// </summary>
    [DataMember(Name="sling.jcrinstall.signal.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.jcrinstall.signal.path")]
    public ConfigNodePropertyString SlingJcrinstallSignalPath { get; set; }

    /// <summary>
    /// Gets or Sets SlingJcrinstallEnableWriteback
    /// </summary>
    [DataMember(Name="sling.jcrinstall.enable.writeback", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.jcrinstall.enable.writeback")]
    public ConfigNodePropertyBoolean SlingJcrinstallEnableWriteback { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties {\n");
      sb.Append("  HandlerSchemes: ").Append(HandlerSchemes).Append("\n");
      sb.Append("  SlingJcrinstallFolderNameRegexp: ").Append(SlingJcrinstallFolderNameRegexp).Append("\n");
      sb.Append("  SlingJcrinstallFolderMaxDepth: ").Append(SlingJcrinstallFolderMaxDepth).Append("\n");
      sb.Append("  SlingJcrinstallSearchPath: ").Append(SlingJcrinstallSearchPath).Append("\n");
      sb.Append("  SlingJcrinstallNewConfigPath: ").Append(SlingJcrinstallNewConfigPath).Append("\n");
      sb.Append("  SlingJcrinstallSignalPath: ").Append(SlingJcrinstallSignalPath).Append("\n");
      sb.Append("  SlingJcrinstallEnableWriteback: ").Append(SlingJcrinstallEnableWriteback).Append("\n");
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
