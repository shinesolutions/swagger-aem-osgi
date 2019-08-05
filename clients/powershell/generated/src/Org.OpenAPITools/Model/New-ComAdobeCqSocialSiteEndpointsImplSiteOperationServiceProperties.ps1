function New-ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${fieldWhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${sitePathFilters},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${sitePackageGroup}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties -ArgumentList @(
            ${fieldWhitelist},
            ${sitePathFilters},
            ${sitePackageGroup}
        )
    }
}
