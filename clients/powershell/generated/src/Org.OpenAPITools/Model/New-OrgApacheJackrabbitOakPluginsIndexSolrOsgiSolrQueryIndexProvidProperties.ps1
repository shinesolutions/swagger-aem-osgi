function New-OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${queryPeriodaggregation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties -ArgumentList @(
            ${queryPeriodaggregation}
        )
    }
}
