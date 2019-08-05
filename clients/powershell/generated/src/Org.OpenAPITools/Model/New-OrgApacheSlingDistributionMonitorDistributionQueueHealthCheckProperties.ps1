function New-OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${hcPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${hcPeriodmbeanPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${numberOfRetriesAllowed}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties -ArgumentList @(
            ${hcPeriodname},
            ${hcPeriodtags},
            ${hcPeriodmbeanPeriodname},
            ${numberOfRetriesAllowed}
        )
    }
}
