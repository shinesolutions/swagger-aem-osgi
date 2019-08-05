function New-ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodwcmPeriodmsmPeriodactionPeriodignoredMixin}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties -ArgumentList @(
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes},
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems},
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops},
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodignoredMixin}
        )
    }
}
