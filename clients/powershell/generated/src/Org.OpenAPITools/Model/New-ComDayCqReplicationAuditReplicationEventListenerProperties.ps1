function New-ComDayCqReplicationAuditReplicationEventListenerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReplicationAuditReplicationEventListenerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReplicationAuditReplicationEventListenerProperties -ArgumentList @(
            ${servicePeriodranking}
        )
    }
}
