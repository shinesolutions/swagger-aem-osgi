function New-ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${ranking}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties -ArgumentList @(
            ${ranking}
        )
    }
}
