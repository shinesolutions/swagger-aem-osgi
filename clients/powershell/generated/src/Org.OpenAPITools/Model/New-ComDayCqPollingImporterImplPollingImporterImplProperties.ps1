function New-ComDayCqPollingImporterImplPollingImporterImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${importerPeriodminPeriodinterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${importerPerioduser},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${excludePeriodpaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${includePeriodpaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqPollingImporterImplPollingImporterImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqPollingImporterImplPollingImporterImplProperties -ArgumentList @(
            ${importerPeriodminPeriodinterval},
            ${importerPerioduser},
            ${excludePeriodpaths},
            ${includePeriodpaths}
        )
    }
}
