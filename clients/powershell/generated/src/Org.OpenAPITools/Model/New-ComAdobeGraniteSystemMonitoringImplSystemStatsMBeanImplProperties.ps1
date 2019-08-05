function New-ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${schedulerPeriodexpression},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jmxPeriodobjectname}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties -ArgumentList @(
            ${schedulerPeriodexpression},
            ${jmxPeriodobjectname}
        )
    }
}
