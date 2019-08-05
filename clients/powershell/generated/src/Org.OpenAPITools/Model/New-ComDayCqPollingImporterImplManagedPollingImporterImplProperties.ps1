function New-ComDayCqPollingImporterImplManagedPollingImporterImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${importerPerioduser}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqPollingImporterImplManagedPollingImporterImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqPollingImporterImplManagedPollingImporterImplProperties -ArgumentList @(
            ${importerPerioduser}
        )
    }
}
