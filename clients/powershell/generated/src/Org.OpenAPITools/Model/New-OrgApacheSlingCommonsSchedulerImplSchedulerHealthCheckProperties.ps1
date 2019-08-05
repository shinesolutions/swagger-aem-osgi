function New-OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxPeriodquartzJobPerioddurationPeriodacceptable}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties -ArgumentList @(
            ${maxPeriodquartzJobPerioddurationPeriodacceptable}
        )
    }
}
