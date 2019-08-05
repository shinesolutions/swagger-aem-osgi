function New-ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodissuer},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodaccessPeriodtokenPeriodexpiresPeriodin},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties -ArgumentList @(
            ${oauthPeriodissuer},
            ${oauthPeriodaccessPeriodtokenPeriodexpiresPeriodin},
            ${osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern},
            ${osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect}
        )
    }
}
