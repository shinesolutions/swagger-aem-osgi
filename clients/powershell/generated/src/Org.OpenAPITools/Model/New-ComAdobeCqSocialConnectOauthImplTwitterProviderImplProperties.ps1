function New-ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodcloudPeriodconfigPeriodroot},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${providerPeriodconfigPeriodroot},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${providerPeriodconfigPerioduserPeriodfolder},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${providerPeriodconfigPeriodtwitterPeriodenablePeriodparams},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${providerPeriodconfigPeriodtwitterPeriodparams},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties -ArgumentList @(
            ${oauthPeriodproviderPeriodid},
            ${oauthPeriodcloudPeriodconfigPeriodroot},
            ${providerPeriodconfigPeriodroot},
            ${providerPeriodconfigPerioduserPeriodfolder},
            ${providerPeriodconfigPeriodtwitterPeriodenablePeriodparams},
            ${providerPeriodconfigPeriodtwitterPeriodparams},
            ${providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled}
        )
    }
}
