function New-ComDayCqDamCoreImplGfxCommonsGfxRendererProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${skipPeriodbufferedcache}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplGfxCommonsGfxRendererProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplGfxCommonsGfxRendererProperties -ArgumentList @(
            ${skipPeriodbufferedcache}
        )
    }
}
