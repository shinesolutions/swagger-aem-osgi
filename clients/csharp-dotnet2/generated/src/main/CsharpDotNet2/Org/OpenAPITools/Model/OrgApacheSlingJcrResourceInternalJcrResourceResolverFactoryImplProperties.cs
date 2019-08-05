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
  public class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties {
    /// <summary>
    /// Gets or Sets ResourceResolverSearchpath
    /// </summary>
    [DataMember(Name="resource.resolver.searchpath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.searchpath")]
    public ConfigNodePropertyArray ResourceResolverSearchpath { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverManglenamespaces
    /// </summary>
    [DataMember(Name="resource.resolver.manglenamespaces", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.manglenamespaces")]
    public ConfigNodePropertyBoolean ResourceResolverManglenamespaces { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverAllowDirect
    /// </summary>
    [DataMember(Name="resource.resolver.allowDirect", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.allowDirect")]
    public ConfigNodePropertyBoolean ResourceResolverAllowDirect { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverRequiredProviders
    /// </summary>
    [DataMember(Name="resource.resolver.required.providers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.required.providers")]
    public ConfigNodePropertyArray ResourceResolverRequiredProviders { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverRequiredProvidernames
    /// </summary>
    [DataMember(Name="resource.resolver.required.providernames", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.required.providernames")]
    public ConfigNodePropertyArray ResourceResolverRequiredProvidernames { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverVirtual
    /// </summary>
    [DataMember(Name="resource.resolver.virtual", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.virtual")]
    public ConfigNodePropertyArray ResourceResolverVirtual { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverMapping
    /// </summary>
    [DataMember(Name="resource.resolver.mapping", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.mapping")]
    public ConfigNodePropertyArray ResourceResolverMapping { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverMapLocation
    /// </summary>
    [DataMember(Name="resource.resolver.map.location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.map.location")]
    public ConfigNodePropertyString ResourceResolverMapLocation { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverMapObservation
    /// </summary>
    [DataMember(Name="resource.resolver.map.observation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.map.observation")]
    public ConfigNodePropertyArray ResourceResolverMapObservation { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverDefaultVanityRedirectStatus
    /// </summary>
    [DataMember(Name="resource.resolver.default.vanity.redirect.status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.default.vanity.redirect.status")]
    public ConfigNodePropertyInteger ResourceResolverDefaultVanityRedirectStatus { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverEnableVanitypath
    /// </summary>
    [DataMember(Name="resource.resolver.enable.vanitypath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.enable.vanitypath")]
    public ConfigNodePropertyBoolean ResourceResolverEnableVanitypath { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverVanitypathMaxEntries
    /// </summary>
    [DataMember(Name="resource.resolver.vanitypath.maxEntries", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.vanitypath.maxEntries")]
    public ConfigNodePropertyInteger ResourceResolverVanitypathMaxEntries { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverVanitypathMaxEntriesStartup
    /// </summary>
    [DataMember(Name="resource.resolver.vanitypath.maxEntries.startup", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.vanitypath.maxEntries.startup")]
    public ConfigNodePropertyBoolean ResourceResolverVanitypathMaxEntriesStartup { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverVanitypathBloomfilterMaxBytes
    /// </summary>
    [DataMember(Name="resource.resolver.vanitypath.bloomfilter.maxBytes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.vanitypath.bloomfilter.maxBytes")]
    public ConfigNodePropertyInteger ResourceResolverVanitypathBloomfilterMaxBytes { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverOptimizeAliasResolution
    /// </summary>
    [DataMember(Name="resource.resolver.optimize.alias.resolution", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.optimize.alias.resolution")]
    public ConfigNodePropertyBoolean ResourceResolverOptimizeAliasResolution { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverVanitypathWhitelist
    /// </summary>
    [DataMember(Name="resource.resolver.vanitypath.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.vanitypath.whitelist")]
    public ConfigNodePropertyArray ResourceResolverVanitypathWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverVanitypathBlacklist
    /// </summary>
    [DataMember(Name="resource.resolver.vanitypath.blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.vanitypath.blacklist")]
    public ConfigNodePropertyArray ResourceResolverVanitypathBlacklist { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverVanityPrecedence
    /// </summary>
    [DataMember(Name="resource.resolver.vanity.precedence", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.vanity.precedence")]
    public ConfigNodePropertyBoolean ResourceResolverVanityPrecedence { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverProviderhandlingParanoid
    /// </summary>
    [DataMember(Name="resource.resolver.providerhandling.paranoid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.providerhandling.paranoid")]
    public ConfigNodePropertyBoolean ResourceResolverProviderhandlingParanoid { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverLogClosing
    /// </summary>
    [DataMember(Name="resource.resolver.log.closing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.log.closing")]
    public ConfigNodePropertyBoolean ResourceResolverLogClosing { get; set; }

    /// <summary>
    /// Gets or Sets ResourceResolverLogUnclosed
    /// </summary>
    [DataMember(Name="resource.resolver.log.unclosed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resource.resolver.log.unclosed")]
    public ConfigNodePropertyBoolean ResourceResolverLogUnclosed { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties {\n");
      sb.Append("  ResourceResolverSearchpath: ").Append(ResourceResolverSearchpath).Append("\n");
      sb.Append("  ResourceResolverManglenamespaces: ").Append(ResourceResolverManglenamespaces).Append("\n");
      sb.Append("  ResourceResolverAllowDirect: ").Append(ResourceResolverAllowDirect).Append("\n");
      sb.Append("  ResourceResolverRequiredProviders: ").Append(ResourceResolverRequiredProviders).Append("\n");
      sb.Append("  ResourceResolverRequiredProvidernames: ").Append(ResourceResolverRequiredProvidernames).Append("\n");
      sb.Append("  ResourceResolverVirtual: ").Append(ResourceResolverVirtual).Append("\n");
      sb.Append("  ResourceResolverMapping: ").Append(ResourceResolverMapping).Append("\n");
      sb.Append("  ResourceResolverMapLocation: ").Append(ResourceResolverMapLocation).Append("\n");
      sb.Append("  ResourceResolverMapObservation: ").Append(ResourceResolverMapObservation).Append("\n");
      sb.Append("  ResourceResolverDefaultVanityRedirectStatus: ").Append(ResourceResolverDefaultVanityRedirectStatus).Append("\n");
      sb.Append("  ResourceResolverEnableVanitypath: ").Append(ResourceResolverEnableVanitypath).Append("\n");
      sb.Append("  ResourceResolverVanitypathMaxEntries: ").Append(ResourceResolverVanitypathMaxEntries).Append("\n");
      sb.Append("  ResourceResolverVanitypathMaxEntriesStartup: ").Append(ResourceResolverVanitypathMaxEntriesStartup).Append("\n");
      sb.Append("  ResourceResolverVanitypathBloomfilterMaxBytes: ").Append(ResourceResolverVanitypathBloomfilterMaxBytes).Append("\n");
      sb.Append("  ResourceResolverOptimizeAliasResolution: ").Append(ResourceResolverOptimizeAliasResolution).Append("\n");
      sb.Append("  ResourceResolverVanitypathWhitelist: ").Append(ResourceResolverVanitypathWhitelist).Append("\n");
      sb.Append("  ResourceResolverVanitypathBlacklist: ").Append(ResourceResolverVanitypathBlacklist).Append("\n");
      sb.Append("  ResourceResolverVanityPrecedence: ").Append(ResourceResolverVanityPrecedence).Append("\n");
      sb.Append("  ResourceResolverProviderhandlingParanoid: ").Append(ResourceResolverProviderhandlingParanoid).Append("\n");
      sb.Append("  ResourceResolverLogClosing: ").Append(ResourceResolverLogClosing).Append("\n");
      sb.Append("  ResourceResolverLogUnclosed: ").Append(ResourceResolverLogUnclosed).Append("\n");
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
