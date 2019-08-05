function New-ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${dispatcherPeriodaddress},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${dispatcherPeriodfilterPeriodallowed},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${dispatcherPeriodfilterPeriodblocked}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties -ArgumentList @(
            ${hcPeriodtags},
            ${dispatcherPeriodaddress},
            ${dispatcherPeriodfilterPeriodallowed},
            ${dispatcherPeriodfilterPeriodblocked}
        )
    }
}
