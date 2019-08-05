function New-ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jmxPeriodobjectname}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties -ArgumentList @(
            ${jmxPeriodobjectname}
        )
    }
}
