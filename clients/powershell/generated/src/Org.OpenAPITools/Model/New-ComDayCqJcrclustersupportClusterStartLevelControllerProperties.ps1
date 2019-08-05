function New-ComDayCqJcrclustersupportClusterStartLevelControllerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${clusterPeriodlevelPeriodenable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodmasterPeriodlevel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${clusterPeriodslavePeriodlevel}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqJcrclustersupportClusterStartLevelControllerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqJcrclustersupportClusterStartLevelControllerProperties -ArgumentList @(
            ${clusterPeriodlevelPeriodenable},
            ${clusterPeriodmasterPeriodlevel},
            ${clusterPeriodslavePeriodlevel}
        )
    }
}
