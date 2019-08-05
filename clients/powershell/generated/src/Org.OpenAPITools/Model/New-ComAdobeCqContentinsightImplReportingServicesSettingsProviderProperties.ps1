function New-ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${reportingservicesPeriodurl}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties -ArgumentList @(
            ${reportingservicesPeriodurl}
        )
    }
}
