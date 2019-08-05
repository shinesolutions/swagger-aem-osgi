function New-ComAdobeCqAddressImplLocationLocationListServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodaddressPeriodlocationPerioddefaultPeriodmaxResults}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqAddressImplLocationLocationListServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqAddressImplLocationLocationListServletProperties -ArgumentList @(
            ${cqPeriodaddressPeriodlocationPerioddefaultPeriodmaxResults}
        )
    }
}
