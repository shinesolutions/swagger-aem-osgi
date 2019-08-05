function New-ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${maxConnections},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${maxRequests},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${requestTimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${logDir}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties -ArgumentList @(
            ${maxConnections},
            ${maxRequests},
            ${requestTimeout},
            ${logDir}
        )
    }
}
