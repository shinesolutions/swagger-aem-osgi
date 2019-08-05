function New-ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${batchPeriodcommitPeriodsize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties -ArgumentList @(
            ${batchPeriodcommitPeriodsize}
        )
    }
}
