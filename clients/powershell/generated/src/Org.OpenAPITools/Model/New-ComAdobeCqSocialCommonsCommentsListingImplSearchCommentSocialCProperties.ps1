function New-ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${numUserLimit}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties -ArgumentList @(
            ${numUserLimit}
        )
    }
}
