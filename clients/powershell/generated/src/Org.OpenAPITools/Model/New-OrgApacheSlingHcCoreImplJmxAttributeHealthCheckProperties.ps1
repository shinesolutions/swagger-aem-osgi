function New-OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${hcPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${hcPeriodmbeanPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${mbeanPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${attributePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${attributePeriodvaluePeriodconstraint}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties -ArgumentList @(
            ${hcPeriodname},
            ${hcPeriodtags},
            ${hcPeriodmbeanPeriodname},
            ${mbeanPeriodname},
            ${attributePeriodname},
            ${attributePeriodvaluePeriodconstraint}
        )
    }
}
