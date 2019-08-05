function New-ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${isPrimaryPublisher}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties -ArgumentList @(
            ${isPrimaryPublisher}
        )
    }
}
