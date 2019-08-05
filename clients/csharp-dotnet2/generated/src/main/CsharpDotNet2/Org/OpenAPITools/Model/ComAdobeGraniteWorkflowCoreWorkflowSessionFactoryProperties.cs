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
  public class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties {
    /// <summary>
    /// Gets or Sets GraniteWorkflowinboxSortPropertyName
    /// </summary>
    [DataMember(Name="granite.workflowinbox.sort.propertyName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.workflowinbox.sort.propertyName")]
    public ConfigNodePropertyDropDown GraniteWorkflowinboxSortPropertyName { get; set; }

    /// <summary>
    /// Gets or Sets GraniteWorkflowinboxSortOrder
    /// </summary>
    [DataMember(Name="granite.workflowinbox.sort.order", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.workflowinbox.sort.order")]
    public ConfigNodePropertyString GraniteWorkflowinboxSortOrder { get; set; }

    /// <summary>
    /// Gets or Sets CqWorkflowJobRetry
    /// </summary>
    [DataMember(Name="cq.workflow.job.retry", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.workflow.job.retry")]
    public ConfigNodePropertyInteger CqWorkflowJobRetry { get; set; }

    /// <summary>
    /// Gets or Sets CqWorkflowSuperuser
    /// </summary>
    [DataMember(Name="cq.workflow.superuser", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.workflow.superuser")]
    public ConfigNodePropertyArray CqWorkflowSuperuser { get; set; }

    /// <summary>
    /// Gets or Sets GraniteWorkflowInboxQuerySize
    /// </summary>
    [DataMember(Name="granite.workflow.inboxQuerySize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.workflow.inboxQuerySize")]
    public ConfigNodePropertyInteger GraniteWorkflowInboxQuerySize { get; set; }

    /// <summary>
    /// Gets or Sets GraniteWorkflowAdminUserGroupFilter
    /// </summary>
    [DataMember(Name="granite.workflow.adminUserGroupFilter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.workflow.adminUserGroupFilter")]
    public ConfigNodePropertyBoolean GraniteWorkflowAdminUserGroupFilter { get; set; }

    /// <summary>
    /// Gets or Sets GraniteWorkflowEnforceWorkitemAssigneePermissions
    /// </summary>
    [DataMember(Name="granite.workflow.enforceWorkitemAssigneePermissions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.workflow.enforceWorkitemAssigneePermissions")]
    public ConfigNodePropertyBoolean GraniteWorkflowEnforceWorkitemAssigneePermissions { get; set; }

    /// <summary>
    /// Gets or Sets GraniteWorkflowEnforceWorkflowInitiatorPermissions
    /// </summary>
    [DataMember(Name="granite.workflow.enforceWorkflowInitiatorPermissions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.workflow.enforceWorkflowInitiatorPermissions")]
    public ConfigNodePropertyBoolean GraniteWorkflowEnforceWorkflowInitiatorPermissions { get; set; }

    /// <summary>
    /// Gets or Sets GraniteWorkflowInjectTenantIdInJobTopics
    /// </summary>
    [DataMember(Name="granite.workflow.injectTenantIdInJobTopics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.workflow.injectTenantIdInJobTopics")]
    public ConfigNodePropertyBoolean GraniteWorkflowInjectTenantIdInJobTopics { get; set; }

    /// <summary>
    /// Gets or Sets GraniteWorkflowMaxPurgeSaveThreshold
    /// </summary>
    [DataMember(Name="granite.workflow.maxPurgeSaveThreshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.workflow.maxPurgeSaveThreshold")]
    public ConfigNodePropertyInteger GraniteWorkflowMaxPurgeSaveThreshold { get; set; }

    /// <summary>
    /// Gets or Sets GraniteWorkflowMaxPurgeQueryCount
    /// </summary>
    [DataMember(Name="granite.workflow.maxPurgeQueryCount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.workflow.maxPurgeQueryCount")]
    public ConfigNodePropertyInteger GraniteWorkflowMaxPurgeQueryCount { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties {\n");
      sb.Append("  GraniteWorkflowinboxSortPropertyName: ").Append(GraniteWorkflowinboxSortPropertyName).Append("\n");
      sb.Append("  GraniteWorkflowinboxSortOrder: ").Append(GraniteWorkflowinboxSortOrder).Append("\n");
      sb.Append("  CqWorkflowJobRetry: ").Append(CqWorkflowJobRetry).Append("\n");
      sb.Append("  CqWorkflowSuperuser: ").Append(CqWorkflowSuperuser).Append("\n");
      sb.Append("  GraniteWorkflowInboxQuerySize: ").Append(GraniteWorkflowInboxQuerySize).Append("\n");
      sb.Append("  GraniteWorkflowAdminUserGroupFilter: ").Append(GraniteWorkflowAdminUserGroupFilter).Append("\n");
      sb.Append("  GraniteWorkflowEnforceWorkitemAssigneePermissions: ").Append(GraniteWorkflowEnforceWorkitemAssigneePermissions).Append("\n");
      sb.Append("  GraniteWorkflowEnforceWorkflowInitiatorPermissions: ").Append(GraniteWorkflowEnforceWorkflowInitiatorPermissions).Append("\n");
      sb.Append("  GraniteWorkflowInjectTenantIdInJobTopics: ").Append(GraniteWorkflowInjectTenantIdInJobTopics).Append("\n");
      sb.Append("  GraniteWorkflowMaxPurgeSaveThreshold: ").Append(GraniteWorkflowMaxPurgeSaveThreshold).Append("\n");
      sb.Append("  GraniteWorkflowMaxPurgeQueryCount: ").Append(GraniteWorkflowMaxPurgeQueryCount).Append("\n");
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
