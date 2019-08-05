function New-ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${minThreadPoolSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxThreadPoolSize}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties -ArgumentList @(
            ${minThreadPoolSize},
            ${maxThreadPoolSize}
        )
    }
}
