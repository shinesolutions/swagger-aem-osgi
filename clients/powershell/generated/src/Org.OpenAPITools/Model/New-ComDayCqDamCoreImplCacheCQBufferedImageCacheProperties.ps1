function New-ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodmemory},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodimagePeriodcachePeriodmaxPerioddimension}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties -ArgumentList @(
            ${cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodmemory},
            ${cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodage},
            ${cqPerioddamPeriodimagePeriodcachePeriodmaxPerioddimension}
        )
    }
}
