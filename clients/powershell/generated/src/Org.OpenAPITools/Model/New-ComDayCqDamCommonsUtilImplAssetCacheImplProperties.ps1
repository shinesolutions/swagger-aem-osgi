function New-ComDayCqDamCommonsUtilImplAssetCacheImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${largePeriodfilePeriodmin},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cachePeriodapply},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${mimePeriodtypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCommonsUtilImplAssetCacheImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCommonsUtilImplAssetCacheImplProperties -ArgumentList @(
            ${largePeriodfilePeriodmin},
            ${cachePeriodapply},
            ${mimePeriodtypes}
        )
    }
}
