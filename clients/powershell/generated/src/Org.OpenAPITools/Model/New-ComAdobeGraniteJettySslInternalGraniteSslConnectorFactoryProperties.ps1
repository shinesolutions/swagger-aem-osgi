function New-ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodport},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePerioduser},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePeriodpassword},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodexcluded},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodincluded},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodclientPeriodcertificate}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties -ArgumentList @(
            ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodport},
            ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePerioduser},
            ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePeriodpassword},
            ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodexcluded},
            ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodincluded},
            ${comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodclientPeriodcertificate}
        )
    }
}
