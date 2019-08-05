function New-ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties -ArgumentList @(
            ${hcPeriodtags}
        )
    }
}
