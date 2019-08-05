function New-ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${providerPeriodroot}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties -ArgumentList @(
            ${providerPeriodroot}
        )
    }
}
