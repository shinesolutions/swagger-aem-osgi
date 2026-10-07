namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComAdobeGraniteWorkflowPurgeSchedulerProperties 
{
    public ConfigNodePropertyString ScheduledpurgeName { get; set; }
    public ConfigNodePropertyDropDown ScheduledpurgeWorkflowStatus { get; set; }
    public ConfigNodePropertyArray ScheduledpurgeModelIds { get; set; }
    public ConfigNodePropertyInteger ScheduledpurgeDaysold { get; set; }
}


