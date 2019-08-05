function New-ComAdobeGraniteAuthOauthAccesstokenProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodtokenPeriodproviderPeriodtitle},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${authPeriodtokenPeriodproviderPerioddefaultPeriodclaims},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodtokenPeriodproviderPeriodendpoint},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodaccessPeriodtokenPeriodrequest},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodtokenPeriodproviderPeriodkeypairPeriodalias},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${authPeriodtokenPeriodproviderPeriodconnPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${authPeriodtokenPeriodproviderPeriodsoPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodtokenPeriodproviderPeriodclientPeriodid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodtokenPeriodproviderPeriodscope},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${authPeriodtokenPeriodproviderPeriodreusePeriodaccessPeriodtoken},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${authPeriodtokenPeriodproviderPeriodrelaxedPeriodssl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${tokenPeriodrequestPeriodcustomizerPeriodtype},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodtokenPeriodvalidatorPeriodtype}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthAccesstokenProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthAccesstokenProviderProperties -ArgumentList @(
            ${name},
            ${authPeriodtokenPeriodproviderPeriodtitle},
            ${authPeriodtokenPeriodproviderPerioddefaultPeriodclaims},
            ${authPeriodtokenPeriodproviderPeriodendpoint},
            ${authPeriodaccessPeriodtokenPeriodrequest},
            ${authPeriodtokenPeriodproviderPeriodkeypairPeriodalias},
            ${authPeriodtokenPeriodproviderPeriodconnPeriodtimeout},
            ${authPeriodtokenPeriodproviderPeriodsoPeriodtimeout},
            ${authPeriodtokenPeriodproviderPeriodclientPeriodid},
            ${authPeriodtokenPeriodproviderPeriodscope},
            ${authPeriodtokenPeriodproviderPeriodreusePeriodaccessPeriodtoken},
            ${authPeriodtokenPeriodproviderPeriodrelaxedPeriodssl},
            ${tokenPeriodrequestPeriodcustomizerPeriodtype},
            ${authPeriodtokenPeriodvalidatorPeriodtype}
        )
    }
}
