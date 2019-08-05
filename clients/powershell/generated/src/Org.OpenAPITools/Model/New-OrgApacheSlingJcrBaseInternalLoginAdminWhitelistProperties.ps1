function New-OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${whitelistPeriodbypass},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${whitelistPeriodbundlesPeriodregexp}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties -ArgumentList @(
            ${whitelistPeriodbypass},
            ${whitelistPeriodbundlesPeriodregexp}
        )
    }
}
