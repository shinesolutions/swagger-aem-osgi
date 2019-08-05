function New-ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${pseudoPeriodpatterns}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties -ArgumentList @(
            ${pseudoPeriodpatterns}
        )
    }
}
