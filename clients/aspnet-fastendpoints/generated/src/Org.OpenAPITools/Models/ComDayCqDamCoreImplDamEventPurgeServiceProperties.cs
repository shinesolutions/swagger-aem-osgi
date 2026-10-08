namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComDayCqDamCoreImplDamEventPurgeServiceProperties 
{
    public ConfigNodePropertyString SchedulerExpression { get; set; }
    public ConfigNodePropertyInteger MaxSavedActivities { get; set; }
    public ConfigNodePropertyInteger SaveInterval { get; set; }
    public ConfigNodePropertyBoolean EnableActivityPurge { get; set; }
    public ConfigNodePropertyDropDown EventTypes { get; set; }
}


