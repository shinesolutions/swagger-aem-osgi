function New-ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${communitiesPeriodintegrationPeriodlivefyrePeriodslingPeriodeventPeriodfilter}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties -ArgumentList @(
            ${communitiesPeriodintegrationPeriodlivefyrePeriodslingPeriodeventPeriodfilter}
        )
    }
}
