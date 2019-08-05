function New-ComAdobeCqScreensImplScreensChannelPostProcessorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${screensPeriodchannelsPeriodpropertiesPeriodtoPeriodremove}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensImplScreensChannelPostProcessorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensImplScreensChannelPostProcessorProperties -ArgumentList @(
            ${screensPeriodchannelsPeriodpropertiesPeriodtoPeriodremove}
        )
    }
}
