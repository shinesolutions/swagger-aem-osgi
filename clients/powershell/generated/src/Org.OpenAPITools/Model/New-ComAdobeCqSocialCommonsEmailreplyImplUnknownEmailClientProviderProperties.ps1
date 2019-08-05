function New-ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${replyEmailPatterns},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${priorityOrder}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties -ArgumentList @(
            ${replyEmailPatterns},
            ${priorityOrder}
        )
    }
}
