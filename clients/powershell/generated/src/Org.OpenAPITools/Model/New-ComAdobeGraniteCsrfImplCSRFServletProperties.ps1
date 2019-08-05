function New-ComAdobeGraniteCsrfImplCSRFServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${csrfPeriodtokenPeriodexpiresPeriodin},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodauthPeriodrequirements}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteCsrfImplCSRFServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteCsrfImplCSRFServletProperties -ArgumentList @(
            ${csrfPeriodtokenPeriodexpiresPeriodin},
            ${slingPeriodauthPeriodrequirements}
        )
    }
}
