function New-ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${path},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jaasPeriodcontrolFlag},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jaasPeriodrealmName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${jaasPeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${oauthPeriodofflinePeriodvalidation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties -ArgumentList @(
            ${path},
            ${jaasPeriodcontrolFlag},
            ${jaasPeriodrealmName},
            ${jaasPeriodranking},
            ${oauthPeriodofflinePeriodvalidation}
        )
    }
}
