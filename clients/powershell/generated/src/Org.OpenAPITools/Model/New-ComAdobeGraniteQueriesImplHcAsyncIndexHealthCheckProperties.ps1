function New-ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${indexingPeriodcriticalPeriodthreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${indexingPeriodwarnPeriodthreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties -ArgumentList @(
            ${indexingPeriodcriticalPeriodthreshold},
            ${indexingPeriodwarnPeriodthreshold},
            ${hcPeriodtags}
        )
    }
}
