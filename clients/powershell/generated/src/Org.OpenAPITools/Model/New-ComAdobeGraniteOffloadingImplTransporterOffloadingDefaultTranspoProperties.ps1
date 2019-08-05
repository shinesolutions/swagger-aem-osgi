function New-ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${defaultPeriodtransportPeriodagentMinustoMinusworkerPeriodprefix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${defaultPeriodtransportPeriodagentMinustoMinusmasterPeriodprefix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${defaultPeriodtransportPeriodinputPeriodpackage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${defaultPeriodtransportPeriodoutputPeriodpackage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${defaultPeriodtransportPeriodreplicationPeriodsynchronous},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${defaultPeriodtransportPeriodcontentpackage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${offloadingPeriodtransporterPerioddefaultPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties -ArgumentList @(
            ${defaultPeriodtransportPeriodagentMinustoMinusworkerPeriodprefix},
            ${defaultPeriodtransportPeriodagentMinustoMinusmasterPeriodprefix},
            ${defaultPeriodtransportPeriodinputPeriodpackage},
            ${defaultPeriodtransportPeriodoutputPeriodpackage},
            ${defaultPeriodtransportPeriodreplicationPeriodsynchronous},
            ${defaultPeriodtransportPeriodcontentpackage},
            ${offloadingPeriodtransporterPerioddefaultPeriodenabled}
        )
    }
}
