function New-OrgApacheSlingSecurityImplReferrerFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${allowPeriodempty},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${allowPeriodhosts},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${allowPeriodhostsPeriodregexp},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${filterPeriodmethods},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${excludePeriodagentsPeriodregexp}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingSecurityImplReferrerFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingSecurityImplReferrerFilterProperties -ArgumentList @(
            ${allowPeriodempty},
            ${allowPeriodhosts},
            ${allowPeriodhostsPeriodregexp},
            ${filterPeriodmethods},
            ${excludePeriodagentsPeriodregexp}
        )
    }
}
