function New-OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${packageRoots}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties -ArgumentList @(
            ${packageRoots}
        )
    }
}
