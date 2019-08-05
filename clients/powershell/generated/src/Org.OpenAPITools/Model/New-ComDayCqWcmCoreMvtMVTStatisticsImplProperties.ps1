function New-ComDayCqWcmCoreMvtMVTStatisticsImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${mvtstatisticsPeriodtrackingurl}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreMvtMVTStatisticsImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreMvtMVTStatisticsImplProperties -ArgumentList @(
            ${mvtstatisticsPeriodtrackingurl}
        )
    }
}
