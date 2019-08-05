function New-ComAdobeFormsCommonServiceImplDefaultDataProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${alloweddataFileLocations}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeFormsCommonServiceImplDefaultDataProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeFormsCommonServiceImplDefaultDataProviderProperties -ArgumentList @(
            ${alloweddataFileLocations}
        )
    }
}
