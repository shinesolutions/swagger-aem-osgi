function New-ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${allowedPeriodpaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodanalyticsPeriodsaintPeriodexporterPeriodpagesize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties -ArgumentList @(
            ${allowedPeriodpaths},
            ${cqPeriodanalyticsPeriodsaintPeriodexporterPeriodpagesize}
        )
    }
}
