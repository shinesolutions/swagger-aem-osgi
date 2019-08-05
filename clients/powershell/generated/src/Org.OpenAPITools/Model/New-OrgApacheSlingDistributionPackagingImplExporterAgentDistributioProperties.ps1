function New-OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${queue},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${dropPeriodinvalidPerioditems},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${agentPeriodtarget}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties -ArgumentList @(
            ${name},
            ${queue},
            ${dropPeriodinvalidPerioditems},
            ${agentPeriodtarget}
        )
    }
}
