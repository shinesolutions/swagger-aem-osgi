function New-ComDayCqReplicationImplReplicationReceiverImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${receiverPeriodtmpfilePeriodthreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${receiverPeriodpackagesPeriodusePeriodinstall}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReplicationImplReplicationReceiverImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReplicationImplReplicationReceiverImplProperties -ArgumentList @(
            ${receiverPeriodtmpfilePeriodthreshold},
            ${receiverPeriodpackagesPeriodusePeriodinstall}
        )
    }
}
