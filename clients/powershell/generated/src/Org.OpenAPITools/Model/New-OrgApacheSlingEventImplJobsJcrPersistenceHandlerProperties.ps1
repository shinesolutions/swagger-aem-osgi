function New-OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${jobPeriodconsumermanagerPerioddisableDistribution},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${startupPerioddelay},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cleanupPeriodperiod}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties -ArgumentList @(
            ${jobPeriodconsumermanagerPerioddisableDistribution},
            ${startupPerioddelay},
            ${cleanupPeriodperiod}
        )
    }
}
