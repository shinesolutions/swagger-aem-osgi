function New-ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${brightedgePeriodurl}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties -ArgumentList @(
            ${brightedgePeriodurl}
        )
    }
}
