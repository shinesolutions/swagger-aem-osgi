function New-OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${solrPeriodhomePeriodpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${solrPeriodcorePeriodname}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties -ArgumentList @(
            ${solrPeriodhomePeriodpath},
            ${solrPeriodcorePeriodname}
        )
    }
}
