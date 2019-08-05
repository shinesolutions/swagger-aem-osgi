function New-ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodcommercePeriodpromotionPeriodroot}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties -ArgumentList @(
            ${cqPeriodcommercePeriodpromotionPeriodroot}
        )
    }
}
