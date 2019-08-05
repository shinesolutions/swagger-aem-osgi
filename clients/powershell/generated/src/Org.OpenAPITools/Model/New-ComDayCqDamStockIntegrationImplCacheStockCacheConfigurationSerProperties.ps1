function New-ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${getCacheExpirationUnit},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${getCacheExpirationValue}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties -ArgumentList @(
            ${getCacheExpirationUnit},
            ${getCacheExpirationValue}
        )
    }
}
