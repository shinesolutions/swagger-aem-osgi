namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComAdobeCqProjectsPurgeSchedulerProperties 
{
    public ConfigNodePropertyString ScheduledpurgeName { get; set; }
    public ConfigNodePropertyBoolean ScheduledpurgePurgeActive { get; set; }
    public ConfigNodePropertyArray ScheduledpurgeTemplates { get; set; }
    public ConfigNodePropertyBoolean ScheduledpurgePurgeGroups { get; set; }
    public ConfigNodePropertyBoolean ScheduledpurgePurgeAssets { get; set; }
    public ConfigNodePropertyBoolean ScheduledpurgeTerminateRunningWorkflows { get; set; }
    public ConfigNodePropertyInteger ScheduledpurgeDaysold { get; set; }
    public ConfigNodePropertyInteger ScheduledpurgeSaveThreshold { get; set; }
}


