function New-OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${serverPeriodtype}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties -ArgumentList @(
            ${serverPeriodtype}
        )
    }
}
