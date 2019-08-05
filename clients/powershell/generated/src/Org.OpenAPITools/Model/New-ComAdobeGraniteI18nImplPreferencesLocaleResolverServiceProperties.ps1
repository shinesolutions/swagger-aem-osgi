function New-ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${securityPeriodpreferencesPeriodname}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties -ArgumentList @(
            ${securityPeriodpreferencesPeriodname}
        )
    }
}
