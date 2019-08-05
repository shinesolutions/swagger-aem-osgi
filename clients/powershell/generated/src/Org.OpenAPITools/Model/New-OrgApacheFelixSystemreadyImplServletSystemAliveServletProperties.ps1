function New-OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties -ArgumentList @(
            ${osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern},
            ${osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect}
        )
    }
}
