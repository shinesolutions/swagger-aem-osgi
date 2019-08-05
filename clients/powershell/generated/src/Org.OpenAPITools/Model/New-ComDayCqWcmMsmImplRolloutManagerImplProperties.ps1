function New-ComDayCqWcmMsmImplRolloutManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${eventPeriodfilter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${rolloutmgrPeriodexcludedpropsPerioddefault},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${rolloutmgrPeriodexcludedparagraphpropsPerioddefault},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${rolloutmgrPeriodexcludednodetypesPerioddefault},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${rolloutmgrPeriodthreadpoolPeriodmaxsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${rolloutmgrPeriodthreadpoolPeriodmaxshutdowntime},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${rolloutmgrPeriodthreadpoolPeriodpriority},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${rolloutmgrPeriodcommitPeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${rolloutmgrPeriodconflicthandlingPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmMsmImplRolloutManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmMsmImplRolloutManagerImplProperties -ArgumentList @(
            ${eventPeriodfilter},
            ${rolloutmgrPeriodexcludedpropsPerioddefault},
            ${rolloutmgrPeriodexcludedparagraphpropsPerioddefault},
            ${rolloutmgrPeriodexcludednodetypesPerioddefault},
            ${rolloutmgrPeriodthreadpoolPeriodmaxsize},
            ${rolloutmgrPeriodthreadpoolPeriodmaxshutdowntime},
            ${rolloutmgrPeriodthreadpoolPeriodpriority},
            ${rolloutmgrPeriodcommitPeriodsize},
            ${rolloutmgrPeriodconflicthandlingPeriodenabled}
        )
    }
}
