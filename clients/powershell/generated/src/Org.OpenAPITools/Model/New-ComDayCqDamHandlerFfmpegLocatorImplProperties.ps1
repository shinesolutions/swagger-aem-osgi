function New-ComDayCqDamHandlerFfmpegLocatorImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${executablePeriodsearchpath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamHandlerFfmpegLocatorImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamHandlerFfmpegLocatorImplProperties -ArgumentList @(
            ${executablePeriodsearchpath}
        )
    }
}
