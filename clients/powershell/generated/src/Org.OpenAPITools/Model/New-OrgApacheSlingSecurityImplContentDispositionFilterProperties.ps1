function New-OrgApacheSlingSecurityImplContentDispositionFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodcontentPerioddispositionPeriodpaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodcontentPerioddispositionPeriodexcludedPeriodpaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${slingPeriodcontentPerioddispositionPeriodallPeriodpaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingSecurityImplContentDispositionFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingSecurityImplContentDispositionFilterProperties -ArgumentList @(
            ${slingPeriodcontentPerioddispositionPeriodpaths},
            ${slingPeriodcontentPerioddispositionPeriodexcludedPeriodpaths},
            ${slingPeriodcontentPerioddispositionPeriodallPeriodpaths}
        )
    }
}
