function New-ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${threadPoolSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${delayTime},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${workerSleepTime}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties -ArgumentList @(
            ${threadPoolSize},
            ${delayTime},
            ${workerSleepTime}
        )
    }
}
