function New-OrgApacheSlingCommonsLogLogManagerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel},
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
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodconfigurationFile},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpackagingDataEnabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxCallerDataDepth},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxOldFileCountInDump},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnumOfLines}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCommonsLogLogManagerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCommonsLogLogManagerProperties -ArgumentList @(
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodconfigurationFile},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpackagingDataEnabled},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxCallerDataDepth},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxOldFileCountInDump},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnumOfLines}
        )
    }
}
