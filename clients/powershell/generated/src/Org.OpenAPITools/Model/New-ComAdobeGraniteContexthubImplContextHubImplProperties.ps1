function New-ComAdobeGraniteContexthubImplContextHubImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${comPeriodadobePeriodgranitePeriodcontexthubPeriodsilentUnderscoremode},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${comPeriodadobePeriodgranitePeriodcontexthubPeriodshowUnderscoreui}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteContexthubImplContextHubImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteContexthubImplContextHubImplProperties -ArgumentList @(
            ${comPeriodadobePeriodgranitePeriodcontexthubPeriodsilentUnderscoremode},
            ${comPeriodadobePeriodgranitePeriodcontexthubPeriodshowUnderscoreui}
        )
    }
}
