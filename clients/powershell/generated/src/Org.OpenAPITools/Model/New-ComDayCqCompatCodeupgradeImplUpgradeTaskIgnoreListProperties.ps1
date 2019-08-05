function New-ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${upgradeTaskIgnoreList}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties -ArgumentList @(
            ${upgradeTaskIgnoreList}
        )
    }
}
