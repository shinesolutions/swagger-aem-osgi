function New-ComDayCqWcmCoreStatsPageViewStatisticsImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${pageviewstatisticsPeriodtrackingurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${pageviewstatisticsPeriodtrackingscriptPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreStatsPageViewStatisticsImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreStatsPageViewStatisticsImplProperties -ArgumentList @(
            ${pageviewstatisticsPeriodtrackingurl},
            ${pageviewstatisticsPeriodtrackingscriptPeriodenabled}
        )
    }
}
