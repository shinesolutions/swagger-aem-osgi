function New-ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${types}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties -ArgumentList @(
            ${name},
            ${types}
        )
    }
}
