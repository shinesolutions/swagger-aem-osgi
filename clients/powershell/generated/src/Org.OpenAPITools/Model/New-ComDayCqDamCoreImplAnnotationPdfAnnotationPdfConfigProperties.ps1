function New-ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodwidth},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodheight},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodhorizontal},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodvertical},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodcolor},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodfamily},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodlight},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodmarginTextImage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodminImageHeight},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodwidth},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodapproved},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodrejected},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodchangesRequested},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodannotationMarkerPeriodwidth},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodassetPeriodminheight}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties -ArgumentList @(
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodwidth},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodheight},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodhorizontal},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodvertical},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodsize},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodcolor},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodfamily},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodlight},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodmarginTextImage},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodminImageHeight},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodwidth},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodapproved},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodrejected},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodchangesRequested},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodannotationMarkerPeriodwidth},
            ${cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodassetPeriodminheight}
        )
    }
}
