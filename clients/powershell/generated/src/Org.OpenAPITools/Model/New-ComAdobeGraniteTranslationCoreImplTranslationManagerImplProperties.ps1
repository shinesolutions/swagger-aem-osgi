function New-ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${defaultConnectorName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${defaultCategory}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties -ArgumentList @(
            ${defaultConnectorName},
            ${defaultCategory}
        )
    }
}
