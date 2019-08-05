function New-ComDayCqDamIdsImplIDSPoolManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxPerioderrorsPeriodtoPeriodblacklist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${retryPeriodintervalPeriodtoPeriodwhitelist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${connectPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${socketPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${processPeriodlabel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${connectionPeriodusePeriodmax}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamIdsImplIDSPoolManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamIdsImplIDSPoolManagerImplProperties -ArgumentList @(
            ${maxPerioderrorsPeriodtoPeriodblacklist},
            ${retryPeriodintervalPeriodtoPeriodwhitelist},
            ${connectPeriodtimeout},
            ${socketPeriodtimeout},
            ${processPeriodlabel},
            ${connectionPeriodusePeriodmax}
        )
    }
}
