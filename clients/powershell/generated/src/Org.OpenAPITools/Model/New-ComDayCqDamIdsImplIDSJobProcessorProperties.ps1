function New-ComDayCqDamIdsImplIDSJobProcessorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enablePeriodmultisession},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${idsPeriodccPeriodenable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enablePeriodretry},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enablePeriodretryPeriodscripterror},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${externalizerPerioddomainPeriodcqhost},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${externalizerPerioddomainPeriodhttp}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamIdsImplIDSJobProcessorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamIdsImplIDSJobProcessorProperties -ArgumentList @(
            ${enablePeriodmultisession},
            ${idsPeriodccPeriodenable},
            ${enablePeriodretry},
            ${enablePeriodretryPeriodscripterror},
            ${externalizerPerioddomainPeriodcqhost},
            ${externalizerPerioddomainPeriodhttp}
        )
    }
}
