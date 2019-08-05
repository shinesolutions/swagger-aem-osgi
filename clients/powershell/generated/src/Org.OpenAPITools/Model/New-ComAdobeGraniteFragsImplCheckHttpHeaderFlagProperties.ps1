function New-ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${featurePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${featurePerioddescription},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${httpPeriodheaderPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${httpPeriodheaderPeriodvaluepattern}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties -ArgumentList @(
            ${featurePeriodname},
            ${featurePerioddescription},
            ${httpPeriodheaderPeriodname},
            ${httpPeriodheaderPeriodvaluepattern}
        )
    }
}
