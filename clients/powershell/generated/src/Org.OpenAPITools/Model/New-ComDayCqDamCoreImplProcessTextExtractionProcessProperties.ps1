function New-ComDayCqDamCoreImplProcessTextExtractionProcessProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${mimeTypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxExtract}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplProcessTextExtractionProcessProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplProcessTextExtractionProcessProperties -ArgumentList @(
            ${mimeTypes},
            ${maxExtract}
        )
    }
}
