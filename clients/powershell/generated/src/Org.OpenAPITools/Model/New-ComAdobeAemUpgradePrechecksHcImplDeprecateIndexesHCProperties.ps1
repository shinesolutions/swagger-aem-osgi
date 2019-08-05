function New-ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties {
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
        'Creating object: Org.OpenAPITools.Model.ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties -ArgumentList @(
            ${hcPeriodname},
            ${hcPeriodtags},
            ${hcPeriodmbeanPeriodname}
        )
    }
}
