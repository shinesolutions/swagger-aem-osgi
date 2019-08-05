function New-ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${aggregatePeriodrelationships},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${aggregatePerioddescendPeriodvirtual}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties -ArgumentList @(
            ${aggregatePeriodrelationships},
            ${aggregatePerioddescendPeriodvirtual}
        )
    }
}
