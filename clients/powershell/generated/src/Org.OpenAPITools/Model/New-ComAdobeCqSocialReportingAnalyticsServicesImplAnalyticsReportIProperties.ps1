function New-ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodinterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodpageSize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties -ArgumentList @(
            ${cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodinterval},
            ${cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodpageSize}
        )
    }
}
