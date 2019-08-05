function New-ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodimsPeriodclientPeriodsecret},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${customizerPeriodtype}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties -ArgumentList @(
            ${authPeriodimsPeriodclientPeriodsecret},
            ${customizerPeriodtype}
        )
    }
}
