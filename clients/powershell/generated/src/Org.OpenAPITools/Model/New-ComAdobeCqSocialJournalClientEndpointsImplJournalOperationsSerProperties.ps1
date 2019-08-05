function New-ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties {
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
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties -ArgumentList @(
            ${fieldWhitelist},
            ${attachmentTypeBlacklist}
        )
    }
}
