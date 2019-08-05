function New-ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${redirectPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${redirectPeriodstatsPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${redirectPeriodextensions},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${redirectPeriodpaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties -ArgumentList @(
            ${redirectPeriodenabled},
            ${redirectPeriodstatsPeriodenabled},
            ${redirectPeriodextensions},
            ${redirectPeriodpaths}
        )
    }
}
