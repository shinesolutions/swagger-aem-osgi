function New-ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${deletePeriodnamePeriodregexps}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties -ArgumentList @(
            ${deletePeriodnamePeriodregexps}
        )
    }
}
