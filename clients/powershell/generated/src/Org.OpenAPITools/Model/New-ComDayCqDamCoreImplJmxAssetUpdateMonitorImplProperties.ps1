function New-ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jmxPeriodobjectname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${active}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties -ArgumentList @(
            ${jmxPeriodobjectname},
            ${active}
        )
    }
}
