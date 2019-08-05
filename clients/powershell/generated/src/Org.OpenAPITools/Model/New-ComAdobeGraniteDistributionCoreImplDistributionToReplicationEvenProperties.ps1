function New-ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${importerPeriodname}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties -ArgumentList @(
            ${importerPeriodname}
        )
    }
}
