function New-ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${poolSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxPoolSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${queueSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${keepAliveTime}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties -ArgumentList @(
            ${poolSize},
            ${maxPoolSize},
            ${queueSize},
            ${keepAliveTime}
        )
    }
}
