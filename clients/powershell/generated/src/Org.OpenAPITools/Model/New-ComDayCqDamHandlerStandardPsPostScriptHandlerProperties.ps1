function New-ComDayCqDamHandlerStandardPsPostScriptHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${rasterPeriodannotation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamHandlerStandardPsPostScriptHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamHandlerStandardPsPostScriptHandlerProperties -ArgumentList @(
            ${rasterPeriodannotation}
        )
    }
}
