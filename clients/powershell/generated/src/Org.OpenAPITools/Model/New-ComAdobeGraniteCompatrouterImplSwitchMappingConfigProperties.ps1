function New-ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${group},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${ids}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties -ArgumentList @(
            ${group},
            ${ids}
        )
    }
}
