function New-ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${dmreplicateonmodifyPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${dmreplicateonmodifyPeriodforcesyncdeletes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties -ArgumentList @(
            ${dmreplicateonmodifyPeriodenabled},
            ${dmreplicateonmodifyPeriodforcesyncdeletes}
        )
    }
}
