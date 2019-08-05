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
  public class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties {
    /// <summary>
    /// Gets or Sets ManagerRoot
    /// </summary>
    [DataMember(Name="manager.root", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "manager.root")]
    public ConfigNodePropertyString ManagerRoot { get; set; }

    /// <summary>
    /// Gets or Sets HttpServiceFilter
    /// </summary>
    [DataMember(Name="http.service.filter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http.service.filter")]
    public ConfigNodePropertyString HttpServiceFilter { get; set; }

    /// <summary>
    /// Gets or Sets DefaultRender
    /// </summary>
    [DataMember(Name="default.render", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.render")]
    public ConfigNodePropertyString DefaultRender { get; set; }

    /// <summary>
    /// Gets or Sets Realm
    /// </summary>
    [DataMember(Name="realm", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "realm")]
    public ConfigNodePropertyString Realm { get; set; }

    /// <summary>
    /// Gets or Sets Username
    /// </summary>
    [DataMember(Name="username", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "username")]
    public ConfigNodePropertyString Username { get; set; }

    /// <summary>
    /// Gets or Sets Password
    /// </summary>
    [DataMember(Name="password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "password")]
    public ConfigNodePropertyString Password { get; set; }

    /// <summary>
    /// Gets or Sets Category
    /// </summary>
    [DataMember(Name="category", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "category")]
    public ConfigNodePropertyString Category { get; set; }

    /// <summary>
    /// Gets or Sets Locale
    /// </summary>
    [DataMember(Name="locale", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "locale")]
    public ConfigNodePropertyString Locale { get; set; }

    /// <summary>
    /// Gets or Sets Loglevel
    /// </summary>
    [DataMember(Name="loglevel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "loglevel")]
    public ConfigNodePropertyDropDown Loglevel { get; set; }

    /// <summary>
    /// Gets or Sets Plugins
    /// </summary>
    [DataMember(Name="plugins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "plugins")]
    public ConfigNodePropertyDropDown Plugins { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties {\n");
      sb.Append("  ManagerRoot: ").Append(ManagerRoot).Append("\n");
      sb.Append("  HttpServiceFilter: ").Append(HttpServiceFilter).Append("\n");
      sb.Append("  DefaultRender: ").Append(DefaultRender).Append("\n");
      sb.Append("  Realm: ").Append(Realm).Append("\n");
      sb.Append("  Username: ").Append(Username).Append("\n");
      sb.Append("  Password: ").Append(Password).Append("\n");
      sb.Append("  Category: ").Append(Category).Append("\n");
      sb.Append("  Locale: ").Append(Locale).Append("\n");
      sb.Append("  Loglevel: ").Append(Loglevel).Append("\n");
      sb.Append("  Plugins: ").Append(Plugins).Append("\n");
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
