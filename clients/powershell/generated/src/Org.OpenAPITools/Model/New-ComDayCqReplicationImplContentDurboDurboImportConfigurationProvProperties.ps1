function New-ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${preservePeriodhierarchyPeriodnodes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${ignorePeriodversioning},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${importPeriodacl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${savePeriodthreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${preservePerioduserPeriodpaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${preservePerioduuid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${preservePerioduuidPeriodnodetypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${preservePerioduuidPeriodsubtrees},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${autoPeriodcommit}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties -ArgumentList @(
            ${preservePeriodhierarchyPeriodnodes},
            ${ignorePeriodversioning},
            ${importPeriodacl},
            ${savePeriodthreshold},
            ${preservePerioduserPeriodpaths},
            ${preservePerioduuid},
            ${preservePerioduuidPeriodnodetypes},
            ${preservePerioduuidPeriodsubtrees},
            ${autoPeriodcommit}
        )
    }
}
