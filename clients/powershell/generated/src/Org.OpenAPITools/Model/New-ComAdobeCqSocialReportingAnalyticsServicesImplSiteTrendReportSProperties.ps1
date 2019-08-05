function New-ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodsocialPeriodconsolePeriodanalyticsPeriodsitesPeriodmapping},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${priority}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties -ArgumentList @(
            ${cqPeriodsocialPeriodconsolePeriodanalyticsPeriodsitesPeriodmapping},
            ${priority}
        )
    }
}
