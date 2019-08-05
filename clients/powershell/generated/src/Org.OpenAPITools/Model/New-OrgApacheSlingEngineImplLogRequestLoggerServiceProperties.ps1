function New-OrgApacheSlingEngineImplLogRequestLoggerServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${requestPeriodlogPeriodservicePeriodformat},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${requestPeriodlogPeriodservicePeriodoutput},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${requestPeriodlogPeriodservicePeriodoutputtype},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${requestPeriodlogPeriodservicePeriodonentry}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingEngineImplLogRequestLoggerServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingEngineImplLogRequestLoggerServiceProperties -ArgumentList @(
            ${requestPeriodlogPeriodservicePeriodformat},
            ${requestPeriodlogPeriodservicePeriodoutput},
            ${requestPeriodlogPeriodservicePeriodoutputtype},
            ${requestPeriodlogPeriodservicePeriodonentry}
        )
    }
}
