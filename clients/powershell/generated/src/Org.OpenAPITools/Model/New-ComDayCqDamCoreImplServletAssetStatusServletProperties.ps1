function New-ComDayCqDamCoreImplServletAssetStatusServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodbatchPeriodstatusPeriodmaxassets}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplServletAssetStatusServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplServletAssetStatusServletProperties -ArgumentList @(
            ${cqPerioddamPeriodbatchPeriodstatusPeriodmaxassets}
        )
    }
}
