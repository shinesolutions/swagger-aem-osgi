function New-ComDayCqDamCoreImplServletAssetDownloadServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplServletAssetDownloadServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplServletAssetDownloadServletProperties -ArgumentList @(
            ${enabled}
        )
    }
}
