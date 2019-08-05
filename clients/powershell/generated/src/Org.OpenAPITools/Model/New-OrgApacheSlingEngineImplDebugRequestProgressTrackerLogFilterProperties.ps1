function New-OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${extensions},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${minDurationMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxDurationMs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${compactLogFormat}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties -ArgumentList @(
            ${extensions},
            ${minDurationMs},
            ${maxDurationMs},
            ${compactLogFormat}
        )
    }
}
