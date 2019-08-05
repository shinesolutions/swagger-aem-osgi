function New-OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties {
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
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties -ArgumentList @(
            ${providerPeriodroots},
            ${kind}
        )
    }
}
