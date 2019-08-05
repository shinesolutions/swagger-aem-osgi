function New-ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${supportedPaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties -ArgumentList @(
            ${supportedPaths}
        )
    }
}
