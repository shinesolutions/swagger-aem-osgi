function New-ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${Flush agents}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties -ArgumentList @(
            ${Flush agents}
        )
    }
}
