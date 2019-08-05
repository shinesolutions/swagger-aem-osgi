function New-ComAdobeGraniteLicenseImplLicenseCheckFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${checkInternval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${excludeIds},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${encryptPing}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteLicenseImplLicenseCheckFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteLicenseImplLicenseCheckFilterProperties -ArgumentList @(
            ${checkInternval},
            ${excludeIds},
            ${encryptPing}
        )
    }
}
