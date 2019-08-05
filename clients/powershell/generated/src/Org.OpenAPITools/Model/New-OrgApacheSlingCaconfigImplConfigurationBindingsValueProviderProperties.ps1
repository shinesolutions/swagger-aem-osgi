function New-OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties -ArgumentList @(
            ${enabled}
        )
    }
}
