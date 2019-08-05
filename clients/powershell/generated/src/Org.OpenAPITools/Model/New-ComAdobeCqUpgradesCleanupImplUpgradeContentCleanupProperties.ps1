function New-ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${deletePeriodpathPeriodregexps},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${deletePeriodsql2Periodquery}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties -ArgumentList @(
            ${deletePeriodpathPeriodregexps},
            ${deletePeriodsql2Periodquery}
        )
    }
}
