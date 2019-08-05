function New-ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${oauthPeriodproviderPeriodid}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties -ArgumentList @(
            ${oauthPeriodproviderPeriodid}
        )
    }
}
