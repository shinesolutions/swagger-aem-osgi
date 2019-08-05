function New-ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodapikey},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodproject},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodenvironment},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodsendFrequency}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties -ArgumentList @(
            ${comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodurl},
            ${comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodapikey},
            ${comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodproject},
            ${comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodenvironment},
            ${comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodsendFrequency}
        )
    }
}
