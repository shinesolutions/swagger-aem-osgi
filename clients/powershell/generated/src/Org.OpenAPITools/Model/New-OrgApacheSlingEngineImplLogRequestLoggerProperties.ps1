function New-OrgApacheSlingEngineImplLogRequestLoggerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${requestPeriodlogPeriodoutput},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${requestPeriodlogPeriodoutputtype},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${requestPeriodlogPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${accessPeriodlogPeriodoutput},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${accessPeriodlogPeriodoutputtype},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${accessPeriodlogPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingEngineImplLogRequestLoggerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingEngineImplLogRequestLoggerProperties -ArgumentList @(
            ${requestPeriodlogPeriodoutput},
            ${requestPeriodlogPeriodoutputtype},
            ${requestPeriodlogPeriodenabled},
            ${accessPeriodlogPeriodoutput},
            ${accessPeriodlogPeriodoutputtype},
            ${accessPeriodlogPeriodenabled}
        )
    }
}
