function New-AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${showPlaceholder},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maximumCacheEntries},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${afPeriodscriptingPeriodcompatversion},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${makeFileNameUnique},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${generatingCompliantData}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties -ArgumentList @(
            ${showPlaceholder},
            ${maximumCacheEntries},
            ${afPeriodscriptingPeriodcompatversion},
            ${makeFileNameUnique},
            ${generatingCompliantData}
        )
    }
}
