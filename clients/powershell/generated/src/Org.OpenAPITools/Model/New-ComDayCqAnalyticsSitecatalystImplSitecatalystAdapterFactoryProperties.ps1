function New-ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodanalyticsPeriodadapterfactoryPeriodcontextstores}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties -ArgumentList @(
            ${cqPeriodanalyticsPeriodadapterfactoryPeriodcontextstores}
        )
    }
}
