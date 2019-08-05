function New-ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties {
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
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties -ArgumentList @(
            ${oauthPeriodcookiePeriodloginPeriodtimeout},
            ${oauthPeriodcookiePeriodmaxPeriodage}
        )
    }
}
