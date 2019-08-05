function New-OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${users},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${groups}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties -ArgumentList @(
            ${users},
            ${groups}
        )
    }
}
