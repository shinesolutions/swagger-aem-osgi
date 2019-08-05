function New-ComAdobeGraniteWorkflowPurgeSchedulerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${scheduledpurgePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${scheduledpurgePeriodworkflowStatus},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${scheduledpurgePeriodmodelIds},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${scheduledpurgePerioddaysold}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteWorkflowPurgeSchedulerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteWorkflowPurgeSchedulerProperties -ArgumentList @(
            ${scheduledpurgePeriodname},
            ${scheduledpurgePeriodworkflowStatus},
            ${scheduledpurgePeriodmodelIds},
            ${scheduledpurgePerioddaysold}
        )
    }
}
