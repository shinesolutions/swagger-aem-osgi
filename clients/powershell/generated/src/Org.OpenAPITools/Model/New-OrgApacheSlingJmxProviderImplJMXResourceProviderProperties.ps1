function New-OrgApacheSlingJmxProviderImplJMXResourceProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${providerPeriodroots}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJmxProviderImplJMXResourceProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJmxProviderImplJMXResourceProviderProperties -ArgumentList @(
            ${providerPeriodroots}
        )
    }
}
