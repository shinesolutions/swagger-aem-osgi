function New-ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${hcPeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${hcPeriodmbeanPeriodname}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties -ArgumentList @(
            ${hcPeriodname},
            ${hcPeriodtags},
            ${hcPeriodmbeanPeriodname}
        )
    }
}
