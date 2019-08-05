function New-ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${activeRunModes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties -ArgumentList @(
            ${activeRunModes}
        )
    }
}
