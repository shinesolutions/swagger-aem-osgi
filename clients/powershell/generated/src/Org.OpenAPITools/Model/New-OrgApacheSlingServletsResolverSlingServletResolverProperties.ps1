function New-OrgApacheSlingServletsResolverSlingServletResolverProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${servletresolverPeriodservletRoot},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servletresolverPeriodcacheSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${servletresolverPeriodpaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${servletresolverPerioddefaultExtensions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingServletsResolverSlingServletResolverProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingServletsResolverSlingServletResolverProperties -ArgumentList @(
            ${servletresolverPeriodservletRoot},
            ${servletresolverPeriodcacheSize},
            ${servletresolverPeriodpaths},
            ${servletresolverPerioddefaultExtensions}
        )
    }
}
