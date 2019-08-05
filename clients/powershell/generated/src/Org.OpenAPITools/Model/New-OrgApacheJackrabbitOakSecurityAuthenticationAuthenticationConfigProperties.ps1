function New-OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodappName},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodconfigSpiName}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties -ArgumentList @(
            ${orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodappName},
            ${orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodconfigSpiName}
        )
    }
}
