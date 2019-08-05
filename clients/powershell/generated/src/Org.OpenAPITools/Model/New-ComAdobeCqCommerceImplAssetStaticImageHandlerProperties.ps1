function New-ComAdobeCqCommerceImplAssetStaticImageHandlerProperties {
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
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCommerceImplAssetStaticImageHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCommerceImplAssetStaticImageHandlerProperties -ArgumentList @(
            ${cqPeriodcommercePeriodassetPeriodhandlerPeriodactive},
            ${cqPeriodcommercePeriodassetPeriodhandlerPeriodname}
        )
    }
}
