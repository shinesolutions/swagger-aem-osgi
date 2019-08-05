function New-ComDayCqDamCoreImplDamEventRecorderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${eventPeriodfilter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${eventPeriodqueuePeriodlength},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${eventrecorderPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${eventrecorderPeriodblacklist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${eventrecorderPeriodeventtypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplDamEventRecorderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplDamEventRecorderImplProperties -ArgumentList @(
            ${eventPeriodfilter},
            ${eventPeriodqueuePeriodlength},
            ${eventrecorderPeriodenabled},
            ${eventrecorderPeriodblacklist},
            ${eventrecorderPeriodeventtypes}
        )
    }
}
