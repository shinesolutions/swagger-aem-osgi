function New-ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${tagpattern}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties -ArgumentList @(
            ${servicePeriodranking},
            ${tagpattern}
        )
    }
}
