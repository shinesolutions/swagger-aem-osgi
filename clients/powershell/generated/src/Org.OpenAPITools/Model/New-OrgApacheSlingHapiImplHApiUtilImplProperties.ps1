function New-OrgApacheSlingHapiImplHApiUtilImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodresourcetype},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodcollectionresourcetype},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodsearchpaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodexternalurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingHapiImplHApiUtilImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingHapiImplHApiUtilImplProperties -ArgumentList @(
            ${orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodresourcetype},
            ${orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodcollectionresourcetype},
            ${orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodsearchpaths},
            ${orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodexternalurl},
            ${orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodenabled}
        )
    }
}
