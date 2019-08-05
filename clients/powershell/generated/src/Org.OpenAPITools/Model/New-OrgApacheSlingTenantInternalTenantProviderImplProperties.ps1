function New-OrgApacheSlingTenantInternalTenantProviderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${tenantPeriodroot},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${tenantPeriodpathPeriodmatcher}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingTenantInternalTenantProviderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingTenantInternalTenantProviderImplProperties -ArgumentList @(
            ${tenantPeriodroot},
            ${tenantPeriodpathPeriodmatcher}
        )
    }
}
