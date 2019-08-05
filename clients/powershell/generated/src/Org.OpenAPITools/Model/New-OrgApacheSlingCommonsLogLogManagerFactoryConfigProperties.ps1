function New-OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnames},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodadditiv}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties -ArgumentList @(
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnames},
            ${orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodadditiv}
        )
    }
}
