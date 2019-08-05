function New-OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${commitsTrackerWriterGroups}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties -ArgumentList @(
            ${commitsTrackerWriterGroups}
        )
    }
}
