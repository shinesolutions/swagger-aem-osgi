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
  public class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {
    /// <summary>
    /// Gets or Sets PermissionsJr2
    /// </summary>
    [DataMember(Name="permissionsJr2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "permissionsJr2")]
    public ConfigNodePropertyDropDown PermissionsJr2 { get; set; }

    /// <summary>
    /// Gets or Sets ImportBehavior
    /// </summary>
    [DataMember(Name="importBehavior", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "importBehavior")]
    public ConfigNodePropertyDropDown ImportBehavior { get; set; }

    /// <summary>
    /// Gets or Sets ReadPaths
    /// </summary>
    [DataMember(Name="readPaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "readPaths")]
    public ConfigNodePropertyArray ReadPaths { get; set; }

    /// <summary>
    /// Gets or Sets AdministrativePrincipals
    /// </summary>
    [DataMember(Name="administrativePrincipals", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "administrativePrincipals")]
    public ConfigNodePropertyArray AdministrativePrincipals { get; set; }

    /// <summary>
    /// Gets or Sets ConfigurationRanking
    /// </summary>
    [DataMember(Name="configurationRanking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "configurationRanking")]
    public ConfigNodePropertyInteger ConfigurationRanking { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {\n");
      sb.Append("  PermissionsJr2: ").Append(PermissionsJr2).Append("\n");
      sb.Append("  ImportBehavior: ").Append(ImportBehavior).Append("\n");
      sb.Append("  ReadPaths: ").Append(ReadPaths).Append("\n");
      sb.Append("  AdministrativePrincipals: ").Append(AdministrativePrincipals).Append("\n");
      sb.Append("  ConfigurationRanking: ").Append(ConfigurationRanking).Append("\n");
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
