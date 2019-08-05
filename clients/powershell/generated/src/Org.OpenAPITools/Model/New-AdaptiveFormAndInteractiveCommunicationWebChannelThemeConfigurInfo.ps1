function New-AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${pid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${title},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties]]
        ${properties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo -ArgumentList @(
            ${pid},
            ${title},
            ${description},
            ${properties}
        )
    }
}
