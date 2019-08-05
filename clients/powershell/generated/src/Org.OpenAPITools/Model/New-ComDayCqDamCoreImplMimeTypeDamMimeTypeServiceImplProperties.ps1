function New-ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPerioddetectPeriodassetPeriodmimePeriodfromPeriodcontent}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties -ArgumentList @(
            ${cqPerioddamPerioddetectPeriodassetPeriodmimePeriodfromPeriodcontent}
        )
    }
}
