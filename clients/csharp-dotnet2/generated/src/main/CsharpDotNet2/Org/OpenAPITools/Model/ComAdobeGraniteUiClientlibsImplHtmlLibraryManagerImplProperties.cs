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
  public class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties {
    /// <summary>
    /// Gets or Sets HtmllibmanagerTiming
    /// </summary>
    [DataMember(Name="htmllibmanager.timing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.timing")]
    public ConfigNodePropertyBoolean HtmllibmanagerTiming { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerDebugInitJs
    /// </summary>
    [DataMember(Name="htmllibmanager.debug.init.js", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.debug.init.js")]
    public ConfigNodePropertyString HtmllibmanagerDebugInitJs { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerMinify
    /// </summary>
    [DataMember(Name="htmllibmanager.minify", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.minify")]
    public ConfigNodePropertyBoolean HtmllibmanagerMinify { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerDebug
    /// </summary>
    [DataMember(Name="htmllibmanager.debug", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.debug")]
    public ConfigNodePropertyBoolean HtmllibmanagerDebug { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerGzip
    /// </summary>
    [DataMember(Name="htmllibmanager.gzip", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.gzip")]
    public ConfigNodePropertyBoolean HtmllibmanagerGzip { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerMaxDataUriSize
    /// </summary>
    [DataMember(Name="htmllibmanager.maxDataUriSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.maxDataUriSize")]
    public ConfigNodePropertyInteger HtmllibmanagerMaxDataUriSize { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerMaxage
    /// </summary>
    [DataMember(Name="htmllibmanager.maxage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.maxage")]
    public ConfigNodePropertyInteger HtmllibmanagerMaxage { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerForceCQUrlInfo
    /// </summary>
    [DataMember(Name="htmllibmanager.forceCQUrlInfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.forceCQUrlInfo")]
    public ConfigNodePropertyBoolean HtmllibmanagerForceCQUrlInfo { get; set; }

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
    /// Gets or Sets HtmllibmanagerClientmanager
    /// </summary>
    [DataMember(Name="htmllibmanager.clientmanager", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.clientmanager")]
    public ConfigNodePropertyString HtmllibmanagerClientmanager { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerPathList
    /// </summary>
    [DataMember(Name="htmllibmanager.path.list", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.path.list")]
    public ConfigNodePropertyArray HtmllibmanagerPathList { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerExcludedPathList
    /// </summary>
    [DataMember(Name="htmllibmanager.excluded.path.list", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.excluded.path.list")]
    public ConfigNodePropertyArray HtmllibmanagerExcludedPathList { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerProcessorJs
    /// </summary>
    [DataMember(Name="htmllibmanager.processor.js", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.processor.js")]
    public ConfigNodePropertyArray HtmllibmanagerProcessorJs { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerProcessorCss
    /// </summary>
    [DataMember(Name="htmllibmanager.processor.css", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.processor.css")]
    public ConfigNodePropertyArray HtmllibmanagerProcessorCss { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerLongcachePatterns
    /// </summary>
    [DataMember(Name="htmllibmanager.longcache.patterns", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.longcache.patterns")]
    public ConfigNodePropertyArray HtmllibmanagerLongcachePatterns { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerLongcacheFormat
    /// </summary>
    [DataMember(Name="htmllibmanager.longcache.format", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.longcache.format")]
    public ConfigNodePropertyString HtmllibmanagerLongcacheFormat { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerUseFileSystemOutputCache
    /// </summary>
    [DataMember(Name="htmllibmanager.useFileSystemOutputCache", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.useFileSystemOutputCache")]
    public ConfigNodePropertyBoolean HtmllibmanagerUseFileSystemOutputCache { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerFileSystemOutputCacheLocation
    /// </summary>
    [DataMember(Name="htmllibmanager.fileSystemOutputCacheLocation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.fileSystemOutputCacheLocation")]
    public ConfigNodePropertyString HtmllibmanagerFileSystemOutputCacheLocation { get; set; }

    /// <summary>
    /// Gets or Sets HtmllibmanagerDisableReplacement
    /// </summary>
    [DataMember(Name="htmllibmanager.disable.replacement", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "htmllibmanager.disable.replacement")]
    public ConfigNodePropertyArray HtmllibmanagerDisableReplacement { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties {\n");
      sb.Append("  HtmllibmanagerTiming: ").Append(HtmllibmanagerTiming).Append("\n");
      sb.Append("  HtmllibmanagerDebugInitJs: ").Append(HtmllibmanagerDebugInitJs).Append("\n");
      sb.Append("  HtmllibmanagerMinify: ").Append(HtmllibmanagerMinify).Append("\n");
      sb.Append("  HtmllibmanagerDebug: ").Append(HtmllibmanagerDebug).Append("\n");
      sb.Append("  HtmllibmanagerGzip: ").Append(HtmllibmanagerGzip).Append("\n");
      sb.Append("  HtmllibmanagerMaxDataUriSize: ").Append(HtmllibmanagerMaxDataUriSize).Append("\n");
      sb.Append("  HtmllibmanagerMaxage: ").Append(HtmllibmanagerMaxage).Append("\n");
      sb.Append("  HtmllibmanagerForceCQUrlInfo: ").Append(HtmllibmanagerForceCQUrlInfo).Append("\n");
      sb.Append("  HtmllibmanagerDefaultthemename: ").Append(HtmllibmanagerDefaultthemename).Append("\n");
      sb.Append("  HtmllibmanagerDefaultuserthemename: ").Append(HtmllibmanagerDefaultuserthemename).Append("\n");
      sb.Append("  HtmllibmanagerClientmanager: ").Append(HtmllibmanagerClientmanager).Append("\n");
      sb.Append("  HtmllibmanagerPathList: ").Append(HtmllibmanagerPathList).Append("\n");
      sb.Append("  HtmllibmanagerExcludedPathList: ").Append(HtmllibmanagerExcludedPathList).Append("\n");
      sb.Append("  HtmllibmanagerProcessorJs: ").Append(HtmllibmanagerProcessorJs).Append("\n");
      sb.Append("  HtmllibmanagerProcessorCss: ").Append(HtmllibmanagerProcessorCss).Append("\n");
      sb.Append("  HtmllibmanagerLongcachePatterns: ").Append(HtmllibmanagerLongcachePatterns).Append("\n");
      sb.Append("  HtmllibmanagerLongcacheFormat: ").Append(HtmllibmanagerLongcacheFormat).Append("\n");
      sb.Append("  HtmllibmanagerUseFileSystemOutputCache: ").Append(HtmllibmanagerUseFileSystemOutputCache).Append("\n");
      sb.Append("  HtmllibmanagerFileSystemOutputCacheLocation: ").Append(HtmllibmanagerFileSystemOutputCacheLocation).Append("\n");
      sb.Append("  HtmllibmanagerDisableReplacement: ").Append(HtmllibmanagerDisableReplacement).Append("\n");
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
