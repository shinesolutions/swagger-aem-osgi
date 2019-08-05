function New-OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodbuffered}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties -ArgumentList @(
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodbuffered}
        )
    }
}
