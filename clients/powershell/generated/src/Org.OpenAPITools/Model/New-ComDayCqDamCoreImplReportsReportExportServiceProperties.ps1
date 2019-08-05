function New-ComDayCqDamCoreImplReportsReportExportServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${queryBatchSize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplReportsReportExportServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplReportsReportExportServiceProperties -ArgumentList @(
            ${queryBatchSize}
        )
    }
}
