function New-ComAdobeCqCommerceImplAssetVideoHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodcommercePeriodassetPeriodhandlerPeriodactive},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodcommercePeriodassetPeriodhandlerPeriodname}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCommerceImplAssetVideoHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCommerceImplAssetVideoHandlerProperties -ArgumentList @(
            ${cqPeriodcommercePeriodassetPeriodhandlerPeriodactive},
            ${cqPeriodcommercePeriodassetPeriodhandlerPeriodname}
        )
    }
}
