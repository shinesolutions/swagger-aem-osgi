function New-AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo {
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
        [System.Nullable[Org.OpenAPITools.Model.AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties]]
        ${properties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo -ArgumentList @(
            ${pid},
            ${title},
            ${description},
            ${properties}
        )
    }
}
