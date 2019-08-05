function New-ComAdobeCqScheduledExporterImplScheduledExporterImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${includePeriodpaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${exporterPerioduser}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScheduledExporterImplScheduledExporterImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScheduledExporterImplScheduledExporterImplProperties -ArgumentList @(
            ${includePeriodpaths},
            ${exporterPerioduser}
        )
    }
}
