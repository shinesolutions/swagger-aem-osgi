function New-OrgApacheSlingModelsImplModelAdapterFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${osgiPeriodhttpPeriodwhiteboardPeriodlistener},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxPeriodrecursionPerioddepth},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cleanupPeriodjobPeriodperiod}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingModelsImplModelAdapterFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingModelsImplModelAdapterFactoryProperties -ArgumentList @(
            ${osgiPeriodhttpPeriodwhiteboardPeriodlistener},
            ${osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect},
            ${maxPeriodrecursionPerioddepth},
            ${cleanupPeriodjobPeriodperiod}
        )
    }
}
