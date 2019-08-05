function New-ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${UGCLimit},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${ugcLimitDuration},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${domains},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${toList}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties -ArgumentList @(
            ${enable},
            ${UGCLimit},
            ${ugcLimitDuration},
            ${domains},
            ${toList}
        )
    }
}
