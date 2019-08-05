function New-ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodanalyticsPeriodtestandtargetPeriodsegmentimporterPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties -ArgumentList @(
            ${cqPeriodanalyticsPeriodtestandtargetPeriodsegmentimporterPeriodenabled}
        )
    }
}
