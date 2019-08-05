function New-ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties {
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
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${providerPeriodconfigPeriodcreatePeriodtagsPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${providerPeriodconfigPerioduserPeriodfolder},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${providerPeriodconfigPeriodfacebookPeriodfetchPeriodfields},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${providerPeriodconfigPeriodfacebookPeriodfields},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties -ArgumentList @(
            ${oauthPeriodproviderPeriodid},
            ${oauthPeriodcloudPeriodconfigPeriodroot},
            ${providerPeriodconfigPeriodroot},
            ${providerPeriodconfigPeriodcreatePeriodtagsPeriodenabled},
            ${providerPeriodconfigPerioduserPeriodfolder},
            ${providerPeriodconfigPeriodfacebookPeriodfetchPeriodfields},
            ${providerPeriodconfigPeriodfacebookPeriodfields},
            ${providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled}
        )
    }
}
