function New-ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${isEnabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties -ArgumentList @(
            ${isEnabled}
        )
    }
}
