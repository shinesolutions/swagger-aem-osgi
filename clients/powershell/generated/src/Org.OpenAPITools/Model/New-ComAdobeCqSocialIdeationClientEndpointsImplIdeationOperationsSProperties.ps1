function New-ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${fieldWhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${attachmentTypeBlacklist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties -ArgumentList @(
            ${fieldWhitelist},
            ${attachmentTypeBlacklist}
        )
    }
}
