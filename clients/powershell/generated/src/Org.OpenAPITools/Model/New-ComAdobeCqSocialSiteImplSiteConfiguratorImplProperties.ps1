function New-ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${componentsUsingTags}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties -ArgumentList @(
            ${componentsUsingTags}
        )
    }
}
