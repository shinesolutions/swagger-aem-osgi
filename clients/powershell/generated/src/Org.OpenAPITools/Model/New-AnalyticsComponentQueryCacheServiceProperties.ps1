function New-AnalyticsComponentQueryCacheServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodanalyticsPeriodcomponentPeriodqueryPeriodcachePeriodsize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AnalyticsComponentQueryCacheServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AnalyticsComponentQueryCacheServiceProperties -ArgumentList @(
            ${cqPeriodanalyticsPeriodcomponentPeriodqueryPeriodcachePeriodsize}
        )
    }
}
