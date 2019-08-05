function New-OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${endpoints},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${pullPerioditems},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${packageBuilderPeriodtarget},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${transportSecretProviderPeriodtarget}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties -ArgumentList @(
            ${name},
            ${endpoints},
            ${pullPerioditems},
            ${packageBuilderPeriodtarget},
            ${transportSecretProviderPeriodtarget}
        )
    }
}
