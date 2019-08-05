function New-ComDayCqMcmCampaignImplIntegrationConfigImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${aemPeriodmcmPeriodcampaignPeriodformConstraints},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${aemPeriodmcmPeriodcampaignPeriodpublicUrl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${aemPeriodmcmPeriodcampaignPeriodrelaxedSSL}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqMcmCampaignImplIntegrationConfigImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqMcmCampaignImplIntegrationConfigImplProperties -ArgumentList @(
            ${aemPeriodmcmPeriodcampaignPeriodformConstraints},
            ${aemPeriodmcmPeriodcampaignPeriodpublicUrl},
            ${aemPeriodmcmPeriodcampaignPeriodrelaxedSSL}
        )
    }
}
