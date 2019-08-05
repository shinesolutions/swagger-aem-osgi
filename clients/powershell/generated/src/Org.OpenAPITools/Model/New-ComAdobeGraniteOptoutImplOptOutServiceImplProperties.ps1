function New-ComAdobeGraniteOptoutImplOptOutServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${optoutPeriodcookies},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${optoutPeriodheaders},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${optoutPeriodwhitelistPeriodcookies}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteOptoutImplOptOutServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteOptoutImplOptOutServiceImplProperties -ArgumentList @(
            ${optoutPeriodcookies},
            ${optoutPeriodheaders},
            ${optoutPeriodwhitelistPeriodcookies}
        )
    }
}
