function New-ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${devicePeriodinfoPeriodtransformerPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${devicePeriodinfoPeriodtransformerPeriodcssPeriodstyle}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties -ArgumentList @(
            ${devicePeriodinfoPeriodtransformerPeriodenabled},
            ${devicePeriodinfoPeriodtransformerPeriodcssPeriodstyle}
        )
    }
}
