function New-ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodid}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties -ArgumentList @(
            ${oauthPeriodproviderPeriodid}
        )
    }
}
