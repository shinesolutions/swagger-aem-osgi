function New-ComDayCqDamCoreImplDamChangeEventListenerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${changeeventlistenerPeriodobservedPeriodpaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplDamChangeEventListenerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplDamChangeEventListenerProperties -ArgumentList @(
            ${changeeventlistenerPeriodobservedPeriodpaths}
        )
    }
}
