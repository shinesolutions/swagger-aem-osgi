function New-ComAdobeGraniteAuthOauthImplGithubProviderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodgithubPeriodauthorizationPeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodgithubPeriodtokenPeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodgithubPeriodprofilePeriodurl}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplGithubProviderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplGithubProviderImplProperties -ArgumentList @(
            ${oauthPeriodproviderPeriodid},
            ${oauthPeriodproviderPeriodgithubPeriodauthorizationPeriodurl},
            ${oauthPeriodproviderPeriodgithubPeriodtokenPeriodurl},
            ${oauthPeriodproviderPeriodgithubPeriodprofilePeriodurl}
        )
    }
}
