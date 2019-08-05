function New-OrgApacheSlingEventImplJobsJobConsumerManagerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${jobPeriodconsumermanagerPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${jobPeriodconsumermanagerPeriodblacklist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingEventImplJobsJobConsumerManagerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingEventImplJobsJobConsumerManagerProperties -ArgumentList @(
            ${orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist},
            ${jobPeriodconsumermanagerPeriodwhitelist},
            ${jobPeriodconsumermanagerPeriodblacklist}
        )
    }
}
