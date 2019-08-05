function New-OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${whitelistPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${whitelistPeriodbundles}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties -ArgumentList @(
            ${whitelistPeriodname},
            ${whitelistPeriodbundles}
        )
    }
}
