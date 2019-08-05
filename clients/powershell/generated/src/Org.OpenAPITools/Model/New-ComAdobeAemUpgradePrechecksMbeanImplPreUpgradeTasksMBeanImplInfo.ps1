function New-ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${pid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${title},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties]]
        ${properties},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${bundleUnderscorelocation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${serviceUnderscorelocation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo -ArgumentList @(
            ${pid},
            ${title},
            ${description},
            ${properties},
            ${bundleUnderscorelocation},
            ${serviceUnderscorelocation}
        )
    }
}
