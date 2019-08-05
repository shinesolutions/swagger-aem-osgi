function New-ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodanalyticsPeriodtestandtargetPeriodaccountoptionsupdaterPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties -ArgumentList @(
            ${cqPeriodanalyticsPeriodtestandtargetPeriodaccountoptionsupdaterPeriodenabled}
        )
    }
}
