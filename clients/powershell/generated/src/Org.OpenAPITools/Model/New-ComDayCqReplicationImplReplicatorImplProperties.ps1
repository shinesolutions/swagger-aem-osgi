function New-ComDayCqReplicationImplReplicatorImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${distributeUnderscoreevents}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReplicationImplReplicatorImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReplicationImplReplicatorImplProperties -ArgumentList @(
            ${distributeUnderscoreevents}
        )
    }
}
