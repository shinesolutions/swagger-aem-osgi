function New-ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jdbcPerioddriverPeriodclass},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jdbcPeriodconnectionPerioduri},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jdbcPeriodusername},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jdbcPeriodpassword},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jdbcPeriodvalidationPeriodquery},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${defaultPeriodreadonly},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${defaultPeriodautocommit},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${poolPeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${poolPeriodmaxPeriodwaitPeriodmsec},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${datasourcePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${datasourcePeriodsvcPeriodproperties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties -ArgumentList @(
            ${jdbcPerioddriverPeriodclass},
            ${jdbcPeriodconnectionPerioduri},
            ${jdbcPeriodusername},
            ${jdbcPeriodpassword},
            ${jdbcPeriodvalidationPeriodquery},
            ${defaultPeriodreadonly},
            ${defaultPeriodautocommit},
            ${poolPeriodsize},
            ${poolPeriodmaxPeriodwaitPeriodmsec},
            ${datasourcePeriodname},
            ${datasourcePeriodsvcPeriodproperties}
        )
    }
}
