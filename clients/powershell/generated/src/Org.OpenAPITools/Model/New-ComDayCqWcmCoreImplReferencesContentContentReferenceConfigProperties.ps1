function New-ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${contentReferenceConfigPeriodresourceTypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties -ArgumentList @(
            ${contentReferenceConfigPeriodresourceTypes}
        )
    }
}
