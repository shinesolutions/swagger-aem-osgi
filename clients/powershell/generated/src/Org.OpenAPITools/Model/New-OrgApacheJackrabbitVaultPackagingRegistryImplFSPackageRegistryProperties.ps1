function New-OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${homePath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties -ArgumentList @(
            ${homePath}
        )
    }
}
