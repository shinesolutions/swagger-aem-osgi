function New-ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${forwardPeriodrequests}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties -ArgumentList @(
            ${forwardPeriodrequests}
        )
    }
}
