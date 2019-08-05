function New-ComDayCqReplicationImplReverseReplicatorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${schedulerPeriodperiod}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReplicationImplReverseReplicatorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReplicationImplReverseReplicatorProperties -ArgumentList @(
            ${schedulerPeriodperiod}
        )
    }
}
