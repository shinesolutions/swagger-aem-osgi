function New-ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties -ArgumentList @(
            ${hcPeriodtags}
        )
    }
}
