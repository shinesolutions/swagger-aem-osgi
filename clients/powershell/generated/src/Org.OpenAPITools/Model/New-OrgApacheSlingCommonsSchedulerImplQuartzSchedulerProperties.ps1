function New-OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${poolName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${allowedPoolNames},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${schedulerPerioduseleaderforsingle},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${metricsPeriodfilters},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${slowThresholdMillis}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties -ArgumentList @(
            ${poolName},
            ${allowedPoolNames},
            ${schedulerPerioduseleaderforsingle},
            ${metricsPeriodfilters},
            ${slowThresholdMillis}
        )
    }
}
