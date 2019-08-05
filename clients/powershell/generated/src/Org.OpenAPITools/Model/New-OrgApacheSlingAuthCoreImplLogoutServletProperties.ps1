function New-OrgApacheSlingAuthCoreImplLogoutServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodservletPeriodmethods},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodpaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingAuthCoreImplLogoutServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingAuthCoreImplLogoutServletProperties -ArgumentList @(
            ${slingPeriodservletPeriodmethods},
            ${slingPeriodservletPeriodpaths}
        )
    }
}
