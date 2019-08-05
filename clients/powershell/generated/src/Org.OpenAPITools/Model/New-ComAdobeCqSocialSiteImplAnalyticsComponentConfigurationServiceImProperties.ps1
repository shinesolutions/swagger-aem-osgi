function New-ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodsocialPeriodconsolePeriodanalyticsPeriodcomponents}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties -ArgumentList @(
            ${cqPeriodsocialPeriodconsolePeriodanalyticsPeriodcomponents}
        )
    }
}
