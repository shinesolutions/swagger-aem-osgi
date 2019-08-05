function New-ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${tagpattern},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${componentPeriodresourceType}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties -ArgumentList @(
            ${servicePeriodranking},
            ${tagpattern},
            ${componentPeriodresourceType}
        )
    }
}
