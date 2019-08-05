function New-ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${omnisearchPeriodsuggestionPeriodrequiretextPeriodmin},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${omnisearchPeriodsuggestionPeriodspellcheckPeriodrequire}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties -ArgumentList @(
            ${omnisearchPeriodsuggestionPeriodrequiretextPeriodmin},
            ${omnisearchPeriodsuggestionPeriodspellcheckPeriodrequire}
        )
    }
}
