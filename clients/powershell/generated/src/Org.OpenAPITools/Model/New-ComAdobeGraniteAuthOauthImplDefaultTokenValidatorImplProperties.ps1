function New-ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodtokenPeriodvalidatorPeriodtype}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties -ArgumentList @(
            ${authPeriodtokenPeriodvalidatorPeriodtype}
        )
    }
}
