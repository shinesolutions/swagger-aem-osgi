function New-ComDayCqDamCoreImplServletDamContentDispositionFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodmimePeriodtypePeriodblacklist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodemptyPeriodmime}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplServletDamContentDispositionFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplServletDamContentDispositionFilterProperties -ArgumentList @(
            ${cqPeriodmimePeriodtypePeriodblacklist},
            ${cqPerioddamPeriodemptyPeriodmime}
        )
    }
}
