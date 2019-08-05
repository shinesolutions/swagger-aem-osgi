function New-ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${mimetype}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties -ArgumentList @(
            ${mimetype}
        )
    }
}
