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
  public class ComDayCqWidgetImplHtmlLibraryManagerImplProperties {
    /// <summary>
    /// Gets or Sets HtmllibmanagerClientmanager
    /// </summary>
    [DataMember(Name="htmllibmanager.clientmanager", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.clientmanager")]
    public ConfigNodePropertyString HtmllibmanagerClientmanager { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerDebug
    /// </summary>
    [DataMember(Name="htmllibmanager.debug", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.debug")]
    public ConfigNodePropertyBoolean HtmllibmanagerDebug { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerDebugConsole
    /// </summary>
    [DataMember(Name="htmllibmanager.debug.console", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.debug.console")]
    public ConfigNodePropertyBoolean HtmllibmanagerDebugConsole { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerDebugInitJs
    /// </summary>
    [DataMember(Name="htmllibmanager.debug.init.js", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.debug.init.js")]
    public ConfigNodePropertyString HtmllibmanagerDebugInitJs { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerDefaultthemename
    /// </summary>
    [DataMember(Name="htmllibmanager.defaultthemename", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.defaultthemename")]
    public ConfigNodePropertyString HtmllibmanagerDefaultthemename { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerDefaultuserthemename
    /// </summary>
    [DataMember(Name="htmllibmanager.defaultuserthemename", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.defaultuserthemename")]
    public ConfigNodePropertyString HtmllibmanagerDefaultuserthemename { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerFirebuglitePath
    /// </summary>
    [DataMember(Name="htmllibmanager.firebuglite.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.firebuglite.path")]
    public ConfigNodePropertyString HtmllibmanagerFirebuglitePath { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerForceCQUrlInfo
    /// </summary>
    [DataMember(Name="htmllibmanager.forceCQUrlInfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.forceCQUrlInfo")]
    public ConfigNodePropertyBoolean HtmllibmanagerForceCQUrlInfo { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerGzip
    /// </summary>
    [DataMember(Name="htmllibmanager.gzip", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.gzip")]
    public ConfigNodePropertyBoolean HtmllibmanagerGzip { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerMaxage
    /// </summary>
    [DataMember(Name="htmllibmanager.maxage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.maxage")]
    public ConfigNodePropertyInteger HtmllibmanagerMaxage { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerMaxDataUriSize
    /// </summary>
    [DataMember(Name="htmllibmanager.maxDataUriSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.maxDataUriSize")]
    public ConfigNodePropertyInteger HtmllibmanagerMaxDataUriSize { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerMinify
    /// </summary>
    [DataMember(Name="htmllibmanager.minify", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.minify")]
    public ConfigNodePropertyBoolean HtmllibmanagerMinify { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerPathList
    /// </summary>
    [DataMember(Name="htmllibmanager.path.list", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.path.list")]
    public ConfigNodePropertyArray HtmllibmanagerPathList { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerTiming
    /// </summary>
    [DataMember(Name="htmllibmanager.timing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.timing")]
    public ConfigNodePropertyBoolean HtmllibmanagerTiming { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWidgetImplHtmlLibraryManagerImplProperties {\n");
      sb.Append("  HtmllibmanagerClientmanager: ").Append(HtmllibmanagerClientmanager).Append("\n");
      sb.Append("  HtmllibmanagerDebug: ").Append(HtmllibmanagerDebug).Append("\n");
      sb.Append("  HtmllibmanagerDebugConsole: ").Append(HtmllibmanagerDebugConsole).Append("\n");
      sb.Append("  HtmllibmanagerDebugInitJs: ").Append(HtmllibmanagerDebugInitJs).Append("\n");
      sb.Append("  HtmllibmanagerDefaultthemename: ").Append(HtmllibmanagerDefaultthemename).Append("\n");
      sb.Append("  HtmllibmanagerDefaultuserthemename: ").Append(HtmllibmanagerDefaultuserthemename).Append("\n");
      sb.Append("  HtmllibmanagerFirebuglitePath: ").Append(HtmllibmanagerFirebuglitePath).Append("\n");
      sb.Append("  HtmllibmanagerForceCQUrlInfo: ").Append(HtmllibmanagerForceCQUrlInfo).Append("\n");
      sb.Append("  HtmllibmanagerGzip: ").Append(HtmllibmanagerGzip).Append("\n");
      sb.Append("  HtmllibmanagerMaxage: ").Append(HtmllibmanagerMaxage).Append("\n");
      sb.Append("  HtmllibmanagerMaxDataUriSize: ").Append(HtmllibmanagerMaxDataUriSize).Append("\n");
      sb.Append("  HtmllibmanagerMinify: ").Append(HtmllibmanagerMinify).Append("\n");
      sb.Append("  HtmllibmanagerPathList: ").Append(HtmllibmanagerPathList).Append("\n");
      sb.Append("  HtmllibmanagerTiming: ").Append(HtmllibmanagerTiming).Append("\n");
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
