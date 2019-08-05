function New-ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${preMinusupgradePeriodmaintenancePeriodtasks},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${preMinusupgradePeriodhcPeriodtags}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties -ArgumentList @(
            ${preMinusupgradePeriodmaintenancePeriodtasks},
            ${preMinusupgradePeriodhcPeriodtags}
        )
    }
}
