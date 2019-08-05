function New-ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodallowPeriodallPeriodmime},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPerioddamPeriodallowedPeriodassetPeriodmimes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties -ArgumentList @(
            ${cqPerioddamPeriodallowPeriodallPeriodmime},
            ${cqPerioddamPeriodallowedPeriodassetPeriodmimes}
        )
    }
}
