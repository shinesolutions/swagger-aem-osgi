function New-ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${serviceName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${userId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${accessTokenProviderPeriodtarget}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties -ArgumentList @(
            ${name},
            ${serviceName},
            ${userId},
            ${accessTokenProviderPeriodtarget}
        )
    }
}
