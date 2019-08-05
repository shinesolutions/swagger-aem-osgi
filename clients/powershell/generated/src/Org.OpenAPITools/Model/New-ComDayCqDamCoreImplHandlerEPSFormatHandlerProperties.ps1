function New-ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${mimetype}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties -ArgumentList @(
            ${mimetype}
        )
    }
}
