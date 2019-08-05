function New-ComDayCqWcmUndoUndoConfigProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodwcmPeriodundoPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodwcmPeriodundoPeriodpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodwcmPeriodundoPeriodvalidity},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodwcmPeriodundoPeriodsteps},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodwcmPeriodundoPeriodpersistence},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodwcmPeriodundoPeriodpersistencePeriodmode},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodwcmPeriodundoPeriodmarkermode},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodwcmPeriodundoPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodwcmPeriodundoPeriodblacklist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmUndoUndoConfigProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmUndoUndoConfigProperties -ArgumentList @(
            ${cqPeriodwcmPeriodundoPeriodenabled},
            ${cqPeriodwcmPeriodundoPeriodpath},
            ${cqPeriodwcmPeriodundoPeriodvalidity},
            ${cqPeriodwcmPeriodundoPeriodsteps},
            ${cqPeriodwcmPeriodundoPeriodpersistence},
            ${cqPeriodwcmPeriodundoPeriodpersistencePeriodmode},
            ${cqPeriodwcmPeriodundoPeriodmarkermode},
            ${cqPeriodwcmPeriodundoPeriodwhitelist},
            ${cqPeriodwcmPeriodundoPeriodblacklist}
        )
    }
}
