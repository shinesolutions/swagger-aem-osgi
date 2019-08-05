function New-ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${rootPeriodpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${fixPeriodinconsistencies}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties -ArgumentList @(
            ${rootPeriodpath},
            ${fixPeriodinconsistencies}
        )
    }
}
