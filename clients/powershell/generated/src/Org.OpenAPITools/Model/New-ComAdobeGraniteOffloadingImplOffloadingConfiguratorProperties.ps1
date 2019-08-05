function New-ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${offloadingPeriodtransporter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${offloadingPeriodcleanupPeriodpayload}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties -ArgumentList @(
            ${offloadingPeriodtransporter},
            ${offloadingPeriodcleanupPeriodpayload}
        )
    }
}
