function New-ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${eventPeriodfilter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${launchesPeriodeventhandlerPeriodthreadpoolPeriodmaxsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${launchesPeriodeventhandlerPeriodthreadpoolPeriodpriority},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${launchesPeriodeventhandlerPeriodupdatelastmodification}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties -ArgumentList @(
            ${eventPeriodfilter},
            ${launchesPeriodeventhandlerPeriodthreadpoolPeriodmaxsize},
            ${launchesPeriodeventhandlerPeriodthreadpoolPeriodpriority},
            ${launchesPeriodeventhandlerPeriodupdatelastmodification}
        )
    }
}
