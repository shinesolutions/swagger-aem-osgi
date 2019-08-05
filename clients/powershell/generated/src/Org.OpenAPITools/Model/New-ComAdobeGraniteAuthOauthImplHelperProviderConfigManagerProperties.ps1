function New-ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodcookiePeriodloginPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodcookiePeriodmaxPeriodage}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties -ArgumentList @(
            ${oauthPeriodcookiePeriodloginPeriodtimeout},
            ${oauthPeriodcookiePeriodmaxPeriodage}
        )
    }
}
