function New-AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${fontList}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties -ArgumentList @(
            ${fontList}
        )
    }
}
