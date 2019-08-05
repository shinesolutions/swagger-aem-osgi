function New-OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties {
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
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties -ArgumentList @(
            ${osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern},
            ${osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect}
        )
    }
}
