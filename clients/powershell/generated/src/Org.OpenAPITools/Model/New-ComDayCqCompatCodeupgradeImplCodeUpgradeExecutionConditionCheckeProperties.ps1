function New-ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${codeupgradetasks},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${codeupgradetaskfilters}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties -ArgumentList @(
            ${codeupgradetasks},
            ${codeupgradetaskfilters}
        )
    }
}
