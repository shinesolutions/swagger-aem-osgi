function New-ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${everyoneLimit},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${priority}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties -ArgumentList @(
            ${everyoneLimit},
            ${priority}
        )
    }
}
