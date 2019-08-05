function New-ComDayCqReportingImplRLogAnalyzerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${requestPeriodlogPeriodoutput}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReportingImplRLogAnalyzerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReportingImplRLogAnalyzerProperties -ArgumentList @(
            ${requestPeriodlogPeriodoutput}
        )
    }
}
