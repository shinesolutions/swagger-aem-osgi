function New-OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${persistentCacheIncludes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties -ArgumentList @(
            ${persistentCacheIncludes}
        )
    }
}
