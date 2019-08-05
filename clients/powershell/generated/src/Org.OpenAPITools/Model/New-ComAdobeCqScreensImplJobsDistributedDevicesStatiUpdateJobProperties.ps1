function New-ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${schedulerPeriodexpression}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties -ArgumentList @(
            ${schedulerPeriodexpression}
        )
    }
}
