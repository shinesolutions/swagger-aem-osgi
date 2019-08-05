function New-ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${oauthPeriodclientPeriodrevocationPeriodactive}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties -ArgumentList @(
            ${oauthPeriodclientPeriodrevocationPeriodactive}
        )
    }
}
