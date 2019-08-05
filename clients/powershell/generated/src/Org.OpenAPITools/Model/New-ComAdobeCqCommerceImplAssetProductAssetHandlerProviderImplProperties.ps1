function New-ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodcommercePeriodassetPeriodhandlerPeriodfallback}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties -ArgumentList @(
            ${cqPeriodcommercePeriodassetPeriodhandlerPeriodfallback}
        )
    }
}
