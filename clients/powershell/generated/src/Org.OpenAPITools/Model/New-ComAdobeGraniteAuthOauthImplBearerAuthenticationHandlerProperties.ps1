function New-ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${path},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${oauthPeriodclientIdsPeriodallowed},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${authPeriodbearerPeriodsyncPeriodims},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodtokenRequestParameter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodbearerPeriodconfigid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${oauthPeriodjwtPeriodsupport}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties -ArgumentList @(
            ${path},
            ${oauthPeriodclientIdsPeriodallowed},
            ${authPeriodbearerPeriodsyncPeriodims},
            ${authPeriodtokenRequestParameter},
            ${oauthPeriodbearerPeriodconfigid},
            ${oauthPeriodjwtPeriodsupport}
        )
    }
}
