function New-ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodanalyticsPeriodsitecatalystPeriodservicePerioddatacenterPeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${devhostnamepatterns},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${connectionPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${socketPeriodtimeout}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties -ArgumentList @(
            ${cqPeriodanalyticsPeriodsitecatalystPeriodservicePerioddatacenterPeriodurl},
            ${devhostnamepatterns},
            ${connectionPeriodtimeout},
            ${socketPeriodtimeout}
        )
    }
}
