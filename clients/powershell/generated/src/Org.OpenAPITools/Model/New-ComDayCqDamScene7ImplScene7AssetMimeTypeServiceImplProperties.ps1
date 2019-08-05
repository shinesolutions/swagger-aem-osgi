function New-ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPerioddamPeriodscene7PeriodassetmimetypeservicePeriodmapping}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties -ArgumentList @(
            ${cqPerioddamPeriodscene7PeriodassetmimetypeservicePeriodmapping}
        )
    }
}
