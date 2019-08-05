function New-ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${oauthPeriodtokenPeriodrevocationPeriodactive}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties -ArgumentList @(
            ${oauthPeriodtokenPeriodrevocationPeriodactive}
        )
    }
}
