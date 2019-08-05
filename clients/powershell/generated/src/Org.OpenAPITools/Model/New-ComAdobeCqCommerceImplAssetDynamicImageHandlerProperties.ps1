function New-ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties {
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
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties -ArgumentList @(
            ${cqPeriodcommercePeriodassetPeriodhandlerPeriodactive},
            ${cqPeriodcommercePeriodassetPeriodhandlerPeriodname}
        )
    }
}
