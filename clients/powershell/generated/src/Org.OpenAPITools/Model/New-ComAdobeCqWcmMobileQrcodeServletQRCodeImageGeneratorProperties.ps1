function New-ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodwcmPeriodqrcodePeriodservletPeriodwhitelist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties -ArgumentList @(
            ${cqPeriodwcmPeriodqrcodePeriodservletPeriodwhitelist}
        )
    }
}
