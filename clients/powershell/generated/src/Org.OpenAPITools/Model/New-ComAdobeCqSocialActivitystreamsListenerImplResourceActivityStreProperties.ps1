function New-ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${streamPath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${streamName}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties -ArgumentList @(
            ${streamPath},
            ${streamName}
        )
    }
}
