function New-ComAdobeCqDamS7imagingImplIsImageServerComponentProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${TcpPort},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${AllowRemoteAccess},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${MaxRenderRgnPixels},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${MaxMessageSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${RandomAccessUrlTimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${WorkerThreads}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamS7imagingImplIsImageServerComponentProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamS7imagingImplIsImageServerComponentProperties -ArgumentList @(
            ${TcpPort},
            ${AllowRemoteAccess},
            ${MaxRenderRgnPixels},
            ${MaxMessageSize},
            ${RandomAccessUrlTimeout},
            ${WorkerThreads}
        )
    }
}
