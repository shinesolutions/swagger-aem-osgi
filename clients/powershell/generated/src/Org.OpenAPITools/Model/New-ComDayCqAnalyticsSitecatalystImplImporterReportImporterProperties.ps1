function New-ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${reportPeriodfetchPeriodattempts},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${reportPeriodfetchPerioddelay}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties -ArgumentList @(
            ${reportPeriodfetchPeriodattempts},
            ${reportPeriodfetchPerioddelay}
        )
    }
}
