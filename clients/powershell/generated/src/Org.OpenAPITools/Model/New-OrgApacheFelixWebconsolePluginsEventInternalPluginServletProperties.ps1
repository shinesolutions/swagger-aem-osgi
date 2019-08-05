function New-OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxPeriodsize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties -ArgumentList @(
            ${maxPeriodsize}
        )
    }
}
