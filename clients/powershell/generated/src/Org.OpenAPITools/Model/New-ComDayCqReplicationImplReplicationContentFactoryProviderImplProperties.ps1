function New-ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${replicationPeriodcontentPerioduseFileStorage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${replicationPeriodcontentPeriodmaxCommitAttempts}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties -ArgumentList @(
            ${replicationPeriodcontentPerioduseFileStorage},
            ${replicationPeriodcontentPeriodmaxCommitAttempts}
        )
    }
}
