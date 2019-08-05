function New-ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${facebook},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${twitter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${providerPeriodconfigPerioduserPeriodfolder}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties -ArgumentList @(
            ${facebook},
            ${twitter},
            ${providerPeriodconfigPerioduserPeriodfolder}
        )
    }
}
