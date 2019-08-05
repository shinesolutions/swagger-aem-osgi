function New-ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties {
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
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodwcmPeriodmsmPeriodimplPeriodactionsPeriodpagemovePeriodpropUnderscorereferenceUpdate}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties -ArgumentList @(
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes},
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems},
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops},
            ${cqPeriodwcmPeriodmsmPeriodimplPeriodactionsPeriodpagemovePeriodpropUnderscorereferenceUpdate}
        )
    }
}
