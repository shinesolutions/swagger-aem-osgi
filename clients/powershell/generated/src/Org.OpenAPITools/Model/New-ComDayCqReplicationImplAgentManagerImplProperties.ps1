function New-ComDayCqReplicationImplAgentManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jobPeriodtopics},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${serviceUserPeriodtarget},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${agentProviderPeriodtarget}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReplicationImplAgentManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReplicationImplAgentManagerImplProperties -ArgumentList @(
            ${jobPeriodtopics},
            ${serviceUserPeriodtarget},
            ${agentProviderPeriodtarget}
        )
    }
}
