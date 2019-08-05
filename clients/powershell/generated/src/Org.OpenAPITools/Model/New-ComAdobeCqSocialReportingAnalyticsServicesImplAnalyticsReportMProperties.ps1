function New-ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${reportPeriodfetchPerioddelay}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties -ArgumentList @(
            ${reportPeriodfetchPerioddelay}
        )
    }
}
