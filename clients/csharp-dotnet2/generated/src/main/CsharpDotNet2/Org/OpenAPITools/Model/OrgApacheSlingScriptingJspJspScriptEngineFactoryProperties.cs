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
  public class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties {
    /// <summary>
    /// Gets or Sets JasperCompilerTargetVM
    /// </summary>
    [DataMember(Name="jasper.compilerTargetVM", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jasper.compilerTargetVM")]
    public ConfigNodePropertyString JasperCompilerTargetVM { get; set; }

    /// <summary>
    /// Gets or Sets JasperCompilerSourceVM
    /// </summary>
    [DataMember(Name="jasper.compilerSourceVM", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jasper.compilerSourceVM")]
    public ConfigNodePropertyString JasperCompilerSourceVM { get; set; }

    /// <summary>
    /// Gets or Sets JasperClassdebuginfo
    /// </summary>
    [DataMember(Name="jasper.classdebuginfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jasper.classdebuginfo")]
    public ConfigNodePropertyBoolean JasperClassdebuginfo { get; set; }

    /// <summary>
    /// Gets or Sets JasperEnablePooling
    /// </summary>
    [DataMember(Name="jasper.enablePooling", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jasper.enablePooling")]
    public ConfigNodePropertyBoolean JasperEnablePooling { get; set; }

    /// <summary>
    /// Gets or Sets JasperIeClassId
    /// </summary>
    [DataMember(Name="jasper.ieClassId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jasper.ieClassId")]
    public ConfigNodePropertyString JasperIeClassId { get; set; }

    /// <summary>
    /// Gets or Sets JasperGenStringAsCharArray
    /// </summary>
    [DataMember(Name="jasper.genStringAsCharArray", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jasper.genStringAsCharArray")]
    public ConfigNodePropertyBoolean JasperGenStringAsCharArray { get; set; }

    /// <summary>
    /// Gets or Sets JasperKeepgenerated
    /// </summary>
    [DataMember(Name="jasper.keepgenerated", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jasper.keepgenerated")]
    public ConfigNodePropertyBoolean JasperKeepgenerated { get; set; }

    /// <summary>
    /// Gets or Sets JasperMappedfile
    /// </summary>
    [DataMember(Name="jasper.mappedfile", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jasper.mappedfile")]
    public ConfigNodePropertyBoolean JasperMappedfile { get; set; }

    /// <summary>
    /// Gets or Sets JasperTrimSpaces
    /// </summary>
    [DataMember(Name="jasper.trimSpaces", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jasper.trimSpaces")]
    public ConfigNodePropertyBoolean JasperTrimSpaces { get; set; }

    /// <summary>
    /// Gets or Sets JasperDisplaySourceFragments
    /// </summary>
    [DataMember(Name="jasper.displaySourceFragments", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jasper.displaySourceFragments")]
    public ConfigNodePropertyBoolean JasperDisplaySourceFragments { get; set; }

    /// <summary>
    /// Gets or Sets DefaultIsSession
    /// </summary>
    [DataMember(Name="default.is.session", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.is.session")]
    public ConfigNodePropertyBoolean DefaultIsSession { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties {\n");
      sb.Append("  JasperCompilerTargetVM: ").Append(JasperCompilerTargetVM).Append("\n");
      sb.Append("  JasperCompilerSourceVM: ").Append(JasperCompilerSourceVM).Append("\n");
      sb.Append("  JasperClassdebuginfo: ").Append(JasperClassdebuginfo).Append("\n");
      sb.Append("  JasperEnablePooling: ").Append(JasperEnablePooling).Append("\n");
      sb.Append("  JasperIeClassId: ").Append(JasperIeClassId).Append("\n");
      sb.Append("  JasperGenStringAsCharArray: ").Append(JasperGenStringAsCharArray).Append("\n");
      sb.Append("  JasperKeepgenerated: ").Append(JasperKeepgenerated).Append("\n");
      sb.Append("  JasperMappedfile: ").Append(JasperMappedfile).Append("\n");
      sb.Append("  JasperTrimSpaces: ").Append(JasperTrimSpaces).Append("\n");
      sb.Append("  JasperDisplaySourceFragments: ").Append(JasperDisplaySourceFragments).Append("\n");
      sb.Append("  DefaultIsSession: ").Append(DefaultIsSession).Append("\n");
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
