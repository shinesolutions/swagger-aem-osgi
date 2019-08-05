function New-ComDayCqDamCoreImplServletAssetXMPSearchServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodbatchPeriodindesignPeriodmaxassets}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplServletAssetXMPSearchServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplServletAssetXMPSearchServletProperties -ArgumentList @(
            ${cqPerioddamPeriodbatchPeriodindesignPeriodmaxassets}
        )
    }
}
