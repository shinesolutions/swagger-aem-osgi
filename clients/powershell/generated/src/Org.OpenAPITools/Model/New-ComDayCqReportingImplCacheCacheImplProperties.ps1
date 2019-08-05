function New-ComDayCqReportingImplCacheCacheImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${repcachePeriodenable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${repcachePeriodttl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${repcachePeriodmax}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReportingImplCacheCacheImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReportingImplCacheCacheImplProperties -ArgumentList @(
            ${repcachePeriodenable},
            ${repcachePeriodttl},
            ${repcachePeriodmax}
        )
    }
}
