function New-ComAdobeGraniteLoggingImplLogAnalyserImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${messagesPeriodqueuePeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${loggerPeriodconfig},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${messagesPeriodsize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteLoggingImplLogAnalyserImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteLoggingImplLogAnalyserImplProperties -ArgumentList @(
            ${messagesPeriodqueuePeriodsize},
            ${loggerPeriodconfig},
            ${messagesPeriodsize}
        )
    }
}
