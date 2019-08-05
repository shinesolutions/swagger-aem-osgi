function New-ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${operation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${operationIcon},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${topicName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${emailEnabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties -ArgumentList @(
            ${operation},
            ${operationIcon},
            ${topicName},
            ${emailEnabled}
        )
    }
}
