function New-ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${reportingservicesPeriodproxyPeriodwhitelist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties -ArgumentList @(
            ${reportingservicesPeriodproxyPeriodwhitelist}
        )
    }
}
