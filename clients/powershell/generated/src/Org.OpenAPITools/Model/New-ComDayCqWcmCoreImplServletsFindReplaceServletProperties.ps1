function New-ComDayCqWcmCoreImplServletsFindReplaceServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${scope}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplServletsFindReplaceServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplServletsFindReplaceServletProperties -ArgumentList @(
            ${scope}
        )
    }
}
