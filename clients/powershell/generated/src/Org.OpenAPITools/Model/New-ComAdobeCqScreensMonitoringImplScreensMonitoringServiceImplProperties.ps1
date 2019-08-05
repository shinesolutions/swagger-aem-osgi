function New-ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodprojectPath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodscheduleFrequency},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpingTimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodrecipients},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpserver},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpport},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusetls},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusername},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpassword}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties -ArgumentList @(
            ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodprojectPath},
            ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodscheduleFrequency},
            ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpingTimeout},
            ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodrecipients},
            ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpserver},
            ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpport},
            ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusetls},
            ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusername},
            ${comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpassword}
        )
    }
}
