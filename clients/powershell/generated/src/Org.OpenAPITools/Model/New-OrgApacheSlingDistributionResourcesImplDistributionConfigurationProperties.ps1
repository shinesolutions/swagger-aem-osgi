function New-OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${providerPeriodroots},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${kind}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties -ArgumentList @(
            ${providerPeriodroots},
            ${kind}
        )
    }
}
