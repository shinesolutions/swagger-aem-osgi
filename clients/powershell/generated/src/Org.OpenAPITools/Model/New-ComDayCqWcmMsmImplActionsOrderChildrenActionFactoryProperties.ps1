function New-ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties {
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
        ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties -ArgumentList @(
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes},
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems},
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops}
        )
    }
}
