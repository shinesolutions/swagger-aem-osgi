function New-ComAdobeCqHistoryImplHistoryServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${historyPeriodservicePeriodresourceTypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${historyPeriodservicePeriodpathFilter}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqHistoryImplHistoryServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqHistoryImplHistoryServiceImplProperties -ArgumentList @(
            ${historyPeriodservicePeriodresourceTypes},
            ${historyPeriodservicePeriodpathFilter}
        )
    }
}
