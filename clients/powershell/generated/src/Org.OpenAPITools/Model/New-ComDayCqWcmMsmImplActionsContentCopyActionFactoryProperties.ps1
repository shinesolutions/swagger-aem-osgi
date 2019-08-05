function New-ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties {
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
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${contentcopyactionPeriodorderPeriodstyle}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties -ArgumentList @(
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes},
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems},
            ${cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops},
            ${contentcopyactionPeriodorderPeriodstyle}
        )
    }
}
