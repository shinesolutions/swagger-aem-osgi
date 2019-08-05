function New-ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${dimPerioddefaultPeriodmode},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${dimPeriodappcachePeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties -ArgumentList @(
            ${dimPerioddefaultPeriodmode},
            ${dimPeriodappcachePeriodenabled}
        )
    }
}
