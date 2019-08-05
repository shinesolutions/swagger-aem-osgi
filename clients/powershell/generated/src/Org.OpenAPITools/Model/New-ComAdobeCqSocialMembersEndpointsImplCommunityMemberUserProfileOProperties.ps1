function New-ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${fieldWhitelist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties -ArgumentList @(
            ${fieldWhitelist}
        )
    }
}
