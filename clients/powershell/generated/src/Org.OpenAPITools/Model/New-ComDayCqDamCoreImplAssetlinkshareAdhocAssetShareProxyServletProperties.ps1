function New-ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodadhocPeriodassetPeriodsharePeriodprezipPeriodmaxcontentsize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties -ArgumentList @(
            ${cqPerioddamPeriodadhocPeriodassetPeriodsharePeriodprezipPeriodmaxcontentsize}
        )
    }
}
