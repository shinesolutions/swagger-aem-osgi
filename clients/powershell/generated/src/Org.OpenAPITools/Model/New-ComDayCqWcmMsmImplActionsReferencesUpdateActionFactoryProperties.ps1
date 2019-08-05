function New-ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties {
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
        ${cqPeriodwcmPeriodmsmPeriodimplPeriodactionPeriodreferencesupdatePeriodpropUnderscoreupdateNested}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties -ArgumentList @(
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes},
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems},
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops},
            ${cqPeriodwcmPeriodmsmPeriodimplPeriodactionPeriodreferencesupdatePeriodpropUnderscoreupdateNested}
        )
    }
}
