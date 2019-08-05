function New-ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties -ArgumentList @(
            ${hcPeriodtags}
        )
    }
}
