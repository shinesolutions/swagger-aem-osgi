function New-ComAdobeGraniteAuthImsImplIMSProviderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodimsPeriodauthorizationPeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodimsPeriodtokenPeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodimsPeriodprofilePeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${oauthPeriodproviderPeriodimsPeriodextendedPerioddetailsPeriodurls},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodimsPeriodvalidatePeriodtokenPeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodimsPeriodsessionPeriodproperty},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodsecret},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodimsPeriodservicePeriodtoken},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${imsPeriodorgPeriodref},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${imsPeriodgroupPeriodmapping},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${oauthPeriodproviderPeriodimsPeriodonlyPeriodlicensePeriodgroup}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthImsImplIMSProviderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthImsImplIMSProviderImplProperties -ArgumentList @(
            ${oauthPeriodproviderPeriodid},
            ${oauthPeriodproviderPeriodimsPeriodauthorizationPeriodurl},
            ${oauthPeriodproviderPeriodimsPeriodtokenPeriodurl},
            ${oauthPeriodproviderPeriodimsPeriodprofilePeriodurl},
            ${oauthPeriodproviderPeriodimsPeriodextendedPerioddetailsPeriodurls},
            ${oauthPeriodproviderPeriodimsPeriodvalidatePeriodtokenPeriodurl},
            ${oauthPeriodproviderPeriodimsPeriodsessionPeriodproperty},
            ${oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodid},
            ${oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodsecret},
            ${oauthPeriodproviderPeriodimsPeriodservicePeriodtoken},
            ${imsPeriodorgPeriodref},
            ${imsPeriodgroupPeriodmapping},
            ${oauthPeriodproviderPeriodimsPeriodonlyPeriodlicensePeriodgroup}
        )
    }
}
