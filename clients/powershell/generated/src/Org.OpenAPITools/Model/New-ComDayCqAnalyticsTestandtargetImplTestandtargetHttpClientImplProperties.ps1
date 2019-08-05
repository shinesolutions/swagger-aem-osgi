function New-ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodanalyticsPeriodtestandtargetPeriodapiPeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodanalyticsPeriodtestandtargetPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodanalyticsPeriodtestandtargetPeriodsockettimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplace},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplacewith}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties -ArgumentList @(
            ${cqPeriodanalyticsPeriodtestandtargetPeriodapiPeriodurl},
            ${cqPeriodanalyticsPeriodtestandtargetPeriodtimeout},
            ${cqPeriodanalyticsPeriodtestandtargetPeriodsockettimeout},
            ${cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplace},
            ${cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplacewith}
        )
    }
}
