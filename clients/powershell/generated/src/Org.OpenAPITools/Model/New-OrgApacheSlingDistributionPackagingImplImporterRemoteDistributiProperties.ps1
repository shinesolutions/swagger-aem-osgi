function New-OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${endpoints},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${transportSecretProviderPeriodtarget}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties -ArgumentList @(
            ${name},
            ${endpoints},
            ${transportSecretProviderPeriodtarget}
        )
    }
}
