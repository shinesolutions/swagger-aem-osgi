function New-ComAdobeGraniteAuthImsProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${configid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${scope}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteAuthImsProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteAuthImsProperties -ArgumentList @(
            ${configid},
            ${scope}
        )
    }
}
