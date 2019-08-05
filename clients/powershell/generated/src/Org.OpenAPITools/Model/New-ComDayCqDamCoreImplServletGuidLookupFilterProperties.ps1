function New-ComDayCqDamCoreImplServletGuidLookupFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodcorePeriodguidlookupfilterPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplServletGuidLookupFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplServletGuidLookupFilterProperties -ArgumentList @(
            ${cqPerioddamPeriodcorePeriodguidlookupfilterPeriodenabled}
        )
    }
}
