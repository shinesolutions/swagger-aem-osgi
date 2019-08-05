function New-ComAdobeCqCommercePimImplPageEventListenerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodcommercePeriodpageeventlistenerPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCommercePimImplPageEventListenerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCommercePimImplPageEventListenerProperties -ArgumentList @(
            ${cqPeriodcommercePeriodpageeventlistenerPeriodenabled}
        )
    }
}
