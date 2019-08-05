function New-OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxPeriodrecursionPeriodlevels}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties -ArgumentList @(
            ${maxPeriodrecursionPeriodlevels}
        )
    }
}
