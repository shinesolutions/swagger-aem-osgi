function New-ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${fieldWhitelist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties -ArgumentList @(
            ${fieldWhitelist}
        )
    }
}
