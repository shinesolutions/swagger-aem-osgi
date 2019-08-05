function New-ComAdobeCqHistoryImplHistoryRequestFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${historyPeriodrequestFilterPeriodexcludedSelectors},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${historyPeriodrequestFilterPeriodexcludedExtensions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqHistoryImplHistoryRequestFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqHistoryImplHistoryRequestFilterProperties -ArgumentList @(
            ${historyPeriodrequestFilterPeriodexcludedSelectors},
            ${historyPeriodrequestFilterPeriodexcludedExtensions}
        )
    }
}
