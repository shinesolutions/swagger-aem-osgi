function New-ComAdobeGraniteInfocollectorInfoCollectorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodinfocollectorPeriodincludeThreadDumps},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodinfocollectorPeriodincludeHeapDump}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteInfocollectorInfoCollectorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteInfocollectorInfoCollectorProperties -ArgumentList @(
            ${granitePeriodinfocollectorPeriodincludeThreadDumps},
            ${granitePeriodinfocollectorPeriodincludeHeapDump}
        )
    }
}
