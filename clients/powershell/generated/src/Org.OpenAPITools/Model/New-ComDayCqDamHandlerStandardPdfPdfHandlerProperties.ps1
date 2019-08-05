function New-ComDayCqDamHandlerStandardPdfPdfHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${rasterPeriodannotation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamHandlerStandardPdfPdfHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamHandlerStandardPdfPdfHandlerProperties -ArgumentList @(
            ${rasterPeriodannotation}
        )
    }
}
