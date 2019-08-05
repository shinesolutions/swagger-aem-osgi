function New-ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${pid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${title},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties]]
        ${properties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo -ArgumentList @(
            ${pid},
            ${title},
            ${description},
            ${properties}
        )
    }
}
