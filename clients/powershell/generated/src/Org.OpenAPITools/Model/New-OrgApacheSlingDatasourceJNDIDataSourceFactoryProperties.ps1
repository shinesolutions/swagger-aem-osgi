function New-OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${datasourcePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${datasourcePeriodsvcPeriodpropPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${datasourcePeriodjndiPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${jndiPeriodproperties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties -ArgumentList @(
            ${datasourcePeriodname},
            ${datasourcePeriodsvcPeriodpropPeriodname},
            ${datasourcePeriodjndiPeriodname},
            ${jndiPeriodproperties}
        )
    }
}
