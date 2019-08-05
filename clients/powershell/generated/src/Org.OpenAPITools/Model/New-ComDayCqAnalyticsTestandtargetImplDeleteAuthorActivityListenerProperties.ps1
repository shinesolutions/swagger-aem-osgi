function New-ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodanalyticsPeriodtestandtargetPerioddeleteauthoractivitylistenerPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties -ArgumentList @(
            ${cqPeriodanalyticsPeriodtestandtargetPerioddeleteauthoractivitylistenerPeriodenabled}
        )
    }
}
