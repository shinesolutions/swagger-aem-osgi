function New-ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${schedulerPeriodexpression},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${schedulerPeriodconcurrent}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties -ArgumentList @(
            ${schedulerPeriodexpression},
            ${schedulerPeriodconcurrent}
        )
    }
}
