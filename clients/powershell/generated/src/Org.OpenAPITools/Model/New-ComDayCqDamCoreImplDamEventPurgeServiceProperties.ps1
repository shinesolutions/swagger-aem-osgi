function New-ComDayCqDamCoreImplDamEventPurgeServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${schedulerPeriodexpression},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxSavedActivities},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${saveInterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enableActivityPurge},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${eventTypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplDamEventPurgeServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplDamEventPurgeServiceProperties -ArgumentList @(
            ${schedulerPeriodexpression},
            ${maxSavedActivities},
            ${saveInterval},
            ${enableActivityPurge},
            ${eventTypes}
        )
    }
}
