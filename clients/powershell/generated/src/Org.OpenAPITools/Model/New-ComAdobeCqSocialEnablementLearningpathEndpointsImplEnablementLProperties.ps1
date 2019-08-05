function New-ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${fieldWhitelist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties -ArgumentList @(
            ${fieldWhitelist}
        )
    }
}
