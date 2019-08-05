function New-ComDayCqDamCoreImplServletBatchMetadataServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPerioddamPeriodbatchPeriodmetadataPeriodassetPerioddefault},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPerioddamPeriodbatchPeriodmetadataPeriodcollectionPerioddefault},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodbatchPeriodmetadataPeriodmaxresources}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplServletBatchMetadataServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplServletBatchMetadataServletProperties -ArgumentList @(
            ${cqPerioddamPeriodbatchPeriodmetadataPeriodassetPerioddefault},
            ${cqPerioddamPeriodbatchPeriodmetadataPeriodcollectionPerioddefault},
            ${cqPerioddamPeriodbatchPeriodmetadataPeriodmaxresources}
        )
    }
}
