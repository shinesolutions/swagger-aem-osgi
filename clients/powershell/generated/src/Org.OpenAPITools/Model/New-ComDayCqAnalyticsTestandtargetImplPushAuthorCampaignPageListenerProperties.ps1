function New-ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodanalyticsPeriodtestandtargetPeriodpushauthorcampaignpagelistenerPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties -ArgumentList @(
            ${cqPeriodanalyticsPeriodtestandtargetPeriodpushauthorcampaignpagelistenerPeriodenabled}
        )
    }
}
