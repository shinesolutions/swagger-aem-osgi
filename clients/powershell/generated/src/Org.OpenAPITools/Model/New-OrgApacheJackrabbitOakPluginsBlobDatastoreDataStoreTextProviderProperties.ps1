function New-OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${dir}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties -ArgumentList @(
            ${dir}
        )
    }
}
