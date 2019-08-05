function New-ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${createPreviewEnabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${updatePreviewEnabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${queueSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${folderPreviewRenditionRegex}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties -ArgumentList @(
            ${createPreviewEnabled},
            ${updatePreviewEnabled},
            ${queueSize},
            ${folderPreviewRenditionRegex}
        )
    }
}
