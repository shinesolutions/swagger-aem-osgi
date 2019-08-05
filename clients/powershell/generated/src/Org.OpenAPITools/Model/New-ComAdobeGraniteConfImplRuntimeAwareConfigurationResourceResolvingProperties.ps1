function New-ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${fallbackPaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties -ArgumentList @(
            ${enabled},
            ${fallbackPaths}
        )
    }
}
