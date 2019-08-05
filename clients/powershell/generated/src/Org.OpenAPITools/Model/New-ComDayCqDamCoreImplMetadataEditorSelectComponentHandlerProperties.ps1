function New-ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${graniteColondata}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties -ArgumentList @(
            ${graniteColondata}
        )
    }
}
