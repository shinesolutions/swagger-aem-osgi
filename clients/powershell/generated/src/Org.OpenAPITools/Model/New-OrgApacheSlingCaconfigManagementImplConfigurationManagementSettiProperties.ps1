function New-OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${ignorePropertyNameRegex},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${configCollectionPropertiesResourceNames}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties -ArgumentList @(
            ${ignorePropertyNameRegex},
            ${configCollectionPropertiesResourceNames}
        )
    }
}
