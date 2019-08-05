function New-ComAdobeCqProjectsPurgeSchedulerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${scheduledpurgePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${scheduledpurgePeriodpurgeActive},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${scheduledpurgePeriodtemplates},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${scheduledpurgePeriodpurgeGroups},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${scheduledpurgePeriodpurgeAssets},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${scheduledpurgePeriodterminateRunningWorkflows},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${scheduledpurgePerioddaysold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${scheduledpurgePeriodsaveThreshold}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqProjectsPurgeSchedulerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqProjectsPurgeSchedulerProperties -ArgumentList @(
            ${scheduledpurgePeriodname},
            ${scheduledpurgePeriodpurgeActive},
            ${scheduledpurgePeriodtemplates},
            ${scheduledpurgePeriodpurgeGroups},
            ${scheduledpurgePeriodpurgeAssets},
            ${scheduledpurgePeriodterminateRunningWorkflows},
            ${scheduledpurgePerioddaysold},
            ${scheduledpurgePeriodsaveThreshold}
        )
    }
}
