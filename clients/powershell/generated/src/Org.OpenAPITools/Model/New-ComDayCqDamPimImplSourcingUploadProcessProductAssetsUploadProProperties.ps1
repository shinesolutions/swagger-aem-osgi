function New-ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${deletePeriodzipPeriodfile}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties -ArgumentList @(
            ${deletePeriodzipPeriodfile}
        )
    }
}
