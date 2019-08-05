function New-ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${numberPeriodofPeriodretriesPeriodallowed},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties -ArgumentList @(
            ${numberPeriodofPeriodretriesPeriodallowed},
            ${hcPeriodtags}
        )
    }
}
