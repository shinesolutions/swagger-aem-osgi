function New-GuideLocalizationServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${supportedLocales},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${Localizable Properties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.GuideLocalizationServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.GuideLocalizationServiceProperties -ArgumentList @(
            ${supportedLocales},
            ${Localizable Properties}
        )
    }
}
