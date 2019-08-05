function New-ComAdobeGraniteAuthOauthImplGraniteProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodgranitePeriodauthorizationPeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodgranitePeriodtokenPeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodgranitePeriodprofilePeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodgranitePeriodextendedPerioddetailsPeriodurls}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplGraniteProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplGraniteProviderProperties -ArgumentList @(
            ${oauthPeriodproviderPeriodid},
            ${oauthPeriodproviderPeriodgranitePeriodauthorizationPeriodurl},
            ${oauthPeriodproviderPeriodgranitePeriodtokenPeriodurl},
            ${oauthPeriodproviderPeriodgranitePeriodprofilePeriodurl},
            ${oauthPeriodproviderPeriodgranitePeriodextendedPerioddetailsPeriodurls}
        )
    }
}
