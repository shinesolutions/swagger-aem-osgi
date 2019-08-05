function New-ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${xmphandlerPeriodcqPeriodformats}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties -ArgumentList @(
            ${xmphandlerPeriodcqPeriodformats}
        )
    }
}
